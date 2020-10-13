package 多线程;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Lock接口
 * java.util.concurrent.locks.ReentrantLock
 * @author 123
 *
 */
public class Lock {
	public static void main(String[] args) {
		Runnable run=new Runnable() {
			private int number=100;
			ReentrantLock l=new ReentrantLock();//在成员位置创建一个ReentrantLock对象
			Object obj=new Object();
			public void run() {
				while (number>0) {
					l.lock();//获取lock锁
					if (number>0) {
						try {
							Thread.sleep(10);
							System.out.println(Thread.currentThread().getName()+"-->正在卖第"+number+"号票");
							number--;
						} catch (InterruptedException e) {
							e.printStackTrace();
						}finally {
							l.unlock();//释放lock锁
						}
					}
					}
				}
		};
		Thread t0=new Thread(run);
		Thread t1=new Thread(run);
		Thread t2=new Thread(run);
		t0.start();
		t1.start();
		t2.start();
		
	}
}
