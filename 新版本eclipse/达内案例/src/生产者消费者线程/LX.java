package �������������߳�;


public class LX {
    public static void main(String[] args) {
     	Runnable runnable = new	Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().getName()+"�̹߳���");//currentThread���ص�ǰִ�е��̶߳���
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
