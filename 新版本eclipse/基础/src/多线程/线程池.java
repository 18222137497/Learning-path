package 多线程;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * JDK1.5之后添加的线程池
 * java.util.concurrent.Executors:线程池的工厂类，用生成线程池
 * Executors类中的静态方法：
 * 	static ExecutorService newFixedThreadPool(int nThreads)创建一个可重用固定线程数的线程池
 * 	参数：	存入线程的个数
 * 	返回值：	ExecutorService接口，返回的是ExecutorService接口的实现类对象，我们可以使用ExecutorService接口接收（面向接口编程）
 * java.util.concurrent.ExecutorService：线程池接口
 * 	用来从线程池中获取线程，调用start方法，执行线程任务
 * 		submit(Runnable task)提交一个Runnable任务用于执行
 * 	关闭/销毁线程的方法
 * 		void shutdown()
 * @author 123
 *
 */
public class 线程池 {	
	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);
		es.submit(new Runnable() {
			@Override
			public void run() {
				System.out.println("111111");				
			}
		});
		es.submit(new Runnable() {
			@Override
			public void run() {
				System.out.println("222222");				
			}
		});
		es.submit(new Runnable() {
			@Override
			public void run() {
				System.out.println("333333");				
			}
		});
	}
}
