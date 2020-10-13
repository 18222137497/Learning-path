package 线程的创建;

/**
 * 非并发类的实现Runnable的创建方式
 * 三种
 */
public class MyThread0 {
    public static void main(String[] args) {
        //第一种，继承Thread类重写run方法
        new MyThreadOne();
        //第二种，直接实现Runnable接口
        new MyThreadTwo();
        //第三种 Runnable接口是函数式接口，这种方法是利用Thread类中的构造方法创建一个重写run方法后的线程，最推荐
        new Thread(()-> System.out.println("线程执行"));
    }
}
/**
 * 第一种，创建一个自定义线程类，该类继承Thread类
 *  这里的run方法虽然不是必须实现，但是继承Thread创建线程的目的就是重写他的run方法
 *  Thread里面默认的run方法是调用自己属性中的Runnable，这个Runnable在没有赋值时候是空的，赋值通过构造函数赋值也就是Thread(new Runnable(){run方法})
 */
class MyThreadOne extends Thread{
    //重写run方法
    @Override
    public void run() {
        System.out.println("线程执行");
    }
}

/**
 * 直接实现Runnable接口重写其中的run方法，简单暴力，
 * 这种方法个人不太推荐，这样创建的线程会失去好多Thread类中对线程操作的方法，你要是能自己一一实现，就当我没说
 */
class MyThreadTwo implements Runnable{

    @Override
    public void run() {
        System.out.println("线程执行");
    }
}
