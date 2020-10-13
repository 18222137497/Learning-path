package 生产者消费者线程;


public class LX {
    public static void main(String[] args) {
     	Runnable runnable = new	Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().getName()+"线程工作");//currentThread返回当前执行的线程对象
				}
			}
		};
		Thread thread = new Thread(runnable);
		thread.setName("1");
		Thread thread1 = new Thread(runnable);
		thread1.setName("2");
		thread.start();
		thread1.start();
    }
}
