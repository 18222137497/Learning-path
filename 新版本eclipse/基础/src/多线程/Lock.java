package ���߳�;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Lock�ӿ�
 * java.util.concurrent.locks.ReentrantLock
 * @author 123
 *
 */
public class Lock {
	public static void main(String[] args) {
		Runnable run=new Runnable() {
			private int number=100;
			ReentrantLock l=new ReentrantLock();//�ڳ�Աλ�ô���һ��ReentrantLock����
			Object obj=new Object();
			public void run() {
				while (number>0) {
					l.lock();//��ȡlock��
					if (number>0) {
						try {
							Thread.sleep(10);
							System.out.println(Thread.currentThread().getName()+"-->��������"+number+"��Ʊ");
							number--;
						} catch (InterruptedException e) {
							e.printStackTrace();
						}finally {
							l.unlock();//�ͷ�lock��
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
