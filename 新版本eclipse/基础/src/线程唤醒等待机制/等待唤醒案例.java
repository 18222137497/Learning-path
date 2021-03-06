package 线程唤醒等待机制;

public class 等待唤醒案例 {
	public static void main(String[] args) {
	Object obj=new Object();
	new Thread() {
		public void run() {
			synchronized (obj) {
			System.out.println("告知老板要的包子种类和数量");
			try {
				obj.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("开吃");
			}
		};
	}.start();
	new Thread() {
		public void run() {
			System.out.println("还需等待5s");
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (obj) {
				System.out.println("老板做好包子了");
				obj.notify();
			}
		};
	}.start();
	
}
}
