package ���߳�;
/**
 * ��Ʊ�����������̰߳�ȫ����
 * �������ظ��ĺͲ����ڵ�Ʊ
 * 
 * ����̰߳�ȫ�����ط�����ʹ��ͬ�������
 * ��ʽ��
 * 	synchronized(������){
 * 		���ܳ����̰߳�ȫ�Ĵ��루�����˹������ݵĴ��룩
 * }
 * ע�⣺
 * 	1.ͨ��������������������������
 * 	2.���Ǳ��뱣֤����߳����õ���������ͬһ��
 *  3.���������ã�
 *  	 ��ͬ���������ס��ֻ��һ���߳���ͬ���������
 * @author 123
 *
 */
public class ���̵߳��̰߳�ȫ {
	public static void main(String[] args) {
		Runnable run=new Runnable() {
			private int number=100;
			Object obj=new Object();
			public void run() {
				while (number>0) {
					synchronized(obj) {
						if (number>0) {
							try {
								Thread.sleep(10);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							System.out.println(Thread.currentThread().getName()+"-->��������"+number+"��Ʊ");
							number--;
						}
					}
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
