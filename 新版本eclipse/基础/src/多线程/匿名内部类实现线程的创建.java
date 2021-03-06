package 多线程;

public class 匿名内部类实现线程的创建 {
	public static void main(String[] args) {
		new Thread() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(Thread.currentThread().getName()+"-->"+i);
				}
			};
		}.start();
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i <10; i++) {
					System.out.println(Thread.currentThread().getName()+"-->"+i);
				}
			}}).start();
	}
}
