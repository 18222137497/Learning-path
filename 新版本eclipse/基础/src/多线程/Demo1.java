package ���߳�;

public class Demo1 {
	public static void main(String[] args) {
		//�����Զ����̶߳���
	MyThread m=new MyThread();
		//�������߳�
	m.start();
		//����������ִ��forѭ��
	for (int i = 0; i < 10; i++) {
		System.out.println("main�̣߳�"+i);
	}
	
}
}
