package ���߳�;

public class ��ȡ�̵߳����ַ�ʽ {
	public static void main(String[] args) {
	 MyThread m=new MyThread();
	 m.start();
	 new MyThread().start();
	 System.out.println(Thread.currentThread());
}
}
