package 多线程;
/**
 * 买票案例出现了线程安全问题
 * 出现了重复的和不存在的票
 * 
 * 解决线程安全的以重方案：使用同步代码块
 * 格式：
 * 	synchronized(锁对象){
 * 		可能出现线程安全的代码（访问了共享数据的代码）
 * }
 * 注意：
 * 	1.通过代码块的锁对象可以是任意对象
 * 	2.但是必须保证多个线程所用的锁对象是同一个
 *  3.锁对象作用：
 *  	 把同步代码块锁住，只让一个线程在同步代码块中
 * @author 123
 *
 */
public class 多线程的线程安全 {
	public static void main(String[] args) {
		Runnable run=new Runnable() {
			private int number=100;
			Object obj=new Object();
			public void run() {
				while (number>0) {
					synchronized(obj) {
						if (number>0) {
							try {
								Thread.sleep(10);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							System.out.println(Thread.currentThread().getName()+"-->正在卖第"+number+"号票");
							number--;
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
