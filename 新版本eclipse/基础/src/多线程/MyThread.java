package ���߳�;
/**
 * �Զ����߳���
 * @author 123
 *
 */
public class MyThread extends Thread{
	public MyThread(String name) {//�����߳����Ƶķ���
		super(name);
	}
	public MyThread() {
		super();
	}
	public void run() {
		System.out.println(Thread.currentThread());//���ضԵ�ǰ����ִ�е��̶߳��������
		System.out.println(Thread.currentThread().getName());
//		for (int i = 0; i < 10; i++) {
//			System.out.println(getName()+":����ִ�У�"+i);
//		}
	}
	
}
