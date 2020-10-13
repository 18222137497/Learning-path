package 多线程;
/**
 * 同步方法的锁对象是this就是new Runnable();
 * 方法格式：
 * 	修饰符  synchronized 返回值类型 方法名(参数列表){}
 * 
 * 
 * 
 * 注意！！！！如果是静态同步方法，格式为 ：修饰符 static synchronized 返回值类型 方法名(参数列表){}
 * 			锁对象为本类的class属性-->class文件对象(反射)
 * @author 123
 *
 */
public class 解决线程安全的第二种方法同步方法 {
	public static void main(String[] args) {
		Runnable run=new Runnable() {
			private int number=100;
			Object obj=new Object();
			public synchronized void TB() {//同步方法  锁对象为this  
				if (number>0) {
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"-->正在卖第"+number+"号票");
					number--;
				}
			}//同步方法  锁对象为this
			public void run() {
				while (number>0) {
					TB();
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
