package �̻߳��ѵȴ�����;

public class �ȴ����Ѱ��� {
	public static void main(String[] args) {
	Object obj=new Object();
	new Thread() {
		public void run() {
			synchronized (obj) {
			System.out.println("��֪�ϰ�Ҫ�İ������������");
			try {
				obj.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("����");
			}
		};
	}.start();
	new Thread() {
		public void run() {
			System.out.println("����ȴ�5s");
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (obj) {
				System.out.println("�ϰ����ð�����");
				obj.notify();
			}
		};
	}.start();
	
}
}
