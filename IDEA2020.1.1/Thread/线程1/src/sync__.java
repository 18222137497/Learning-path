import sun.misc.GC;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 关于synchronized关键字
 * 修饰代码块，即同步语句块，其作用的范围是大括号{}括起来的代码，作用的对象是调用这个代码块的对象。
 * 修饰普通方法，即同步方法，其作用的范围是整个方法，作用的对象是调用这个方法的对象。
 * 修饰静态方法，其作用的范围是整个静态方法，作用的对象是这个类的所有对象
 *      以上三条的意思是，调用了同步代码的对象就会被作用，static代码会直接加载到内存，所以也是直接就调用了
 * synchronized的锁对象为对象监视器（monitor）对象，每个对象的对象头都有一个monitor对象
 * 在synchronized修饰方法时是添加ACC_SYNCHRONIZED标识，该标识指明了该方法是一个同步方法，JVM通过该ACC_SYNCHRONIZED访问标志来辨别一个方法是否声明为同步方法，从而执行相应的同步调用。
 *
 * ReentrantLock依赖于api，而synchronized依赖于jvm，在1.6之后更推荐synchronized
 * 和这个同步关键字相关的又ThreadLocal，CAS,ReentrantLock(这个实现了Lock接口一般的手动添加锁的lock对象都是这个)
 */
public class sync__ {
    public static void main(String[] args) {
    }
}

/**
 * 使用同步代码块
 *  同步代码块
 *      作用的范围是大括号括起来的代码
 *      作用的对象是调用这个代码块的对象
 */
class MyThread0 extends Thread{
    @Override
    public void run() {
        synchronized (this){
            System.out.println("线程执行");
        }
    }
}

/**
 * 关键字修饰普通方法
 *      作用范围是整个方法
 *      作用的对象是调用这个方法的对象(调用方法的对象会被作用)
 *      默认的锁对象是当前对象
 */
class MyThread1 extends Thread{
    public synchronized void _(){
        System.out.println("方法执行");
    }
}

/**
 * 关键字修饰静态方法
 *      作用范围为整个静态方法
 *      作用的对象是这个类的所有对象(创建的对象都会作用)
 *      默认的锁对象是当前类的Class对象
 */
class MyThread2 extends Thread{
    public static synchronized void __(){
        System.out.println("创建对象，调用方法");
    }
}
class test{
    public static void main(String[] args) {

    }
}