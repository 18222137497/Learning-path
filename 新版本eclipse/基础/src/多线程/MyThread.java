package 多线程;
/**
 * 自定义线程类
 * @author 123
 *
 */
public class MyThread extends Thread{
	public MyThread(String name) {//设置线程名称的方法
		super(name);
	}
	public MyThread() {
		super();
	}
	public void run() {
		System.out.println(Thread.currentThread());//返回对当前正在执行的线程对象的引用
		System.out.println(Thread.currentThread().getName());
//		for (int i = 0; i < 10; i++) {
//			System.out.println(getName()+":正在执行！"+i);
//		}
	}
	
}
