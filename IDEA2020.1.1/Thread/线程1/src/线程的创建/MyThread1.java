package 线程的创建;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * 并发类线程创建
 */
public class MyThread1 {
    public static void main(String[] args) {
        //1.方法1,直接实现Callable<T>接口
        new MyThread1One();
        //2.方法2,实现FutureTask<T>(未来任务)接口
        new MyThread1Two(()->"");
        //3.方法3,直接创建FutureTask<T>类，注意这是个类不是抽象类也不是接口,没有空参构造方法，只能传参，详情见下
        new FutureTask<String>(()->"");
        
    }
}

/**
 * 简单粗暴的实现Callable接口的线程创建
 */
class MyThread1One implements Callable<String> {

    @Override
    public String call() throws Exception {//注意这里可以抛出个异常交给虚拟机处理,而Runnable不能抛异常
        System.out.println("线程执行");
        return null;//还具有返回值返回值类型为Callable的泛型
    }
}
/**
 Java5提供了Future接口来代表Callable接口里call()方法的返回值，并且为Future接口提供了一个实现类FutureTask，这个实现类既实现了Future接口，
 还实现了Runnable接口，因此可以作为Thread类的target。在Future接口里定义了几个公共方法来控制它关联的Callable任务。

 >boolean cancel(boolean mayInterruptIfRunning)：尝试取消执行此任务，如果任务已经完成，则返回false，如果任务还没有开始，则任务就不会开始了
                                                如果任务正在执行，则会根据参数判断是否要取消此任务

 >V get()：返回Callable里call（）方法的返回值，调用这个方法会导致程序阻塞，必须等到子线程结束后才会得到返回值

 >V get(long timeout,TimeUnit unit)：返回Callable里call（）方法的返回值，最多阻塞timeout时间，经过指定时间没有返回抛出TimeoutException

 >boolean isDone()：若Callable任务完成，返回True  //这里简单的说就是线程执行call方法执行完成得到返回值之后说明完成任务，返回true

 >boolean isCancelled()：如果在Callable任务正常完成前被取消，返回True
 */
class MyThread1Two extends FutureTask<String> {//翻译为未来任务
    //下面两个方法必须重写一个，方法类似于Thread的构造方法只是参数由Runnable改成Callable
    public MyThread1Two(Callable<String> callable) {
        super(callable);
    }
    //第二个参数表示：设置成功完成后返回的结果，也可以不设置，不设置就是上面那个方法，也可以设置null，这样就和上面这个方法一样了
    public MyThread1Two(Runnable runnable, String result) {
        super(runnable, result);
    }
}
