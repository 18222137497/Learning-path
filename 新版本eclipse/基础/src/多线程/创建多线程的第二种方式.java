package ���߳�;
/**
 * Runnable�ӿ�
 * @author 123
 *
 */
public class �������̵߳ĵڶ��ַ�ʽ {
	public static void main(String[] args) {
		MyRunnable m=new MyRunnable();
		new Thread(m).start();
		for (int i = 0; i < 20; i++) {
			System.out.println(i);
		}
	}
	

}
class MyRunnable implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(Thread.currentThread().getName()+"-->"+i);
		}
	}
	
}
