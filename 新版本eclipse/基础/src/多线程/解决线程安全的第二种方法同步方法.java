package ���߳�;
/**
 * ͬ����������������this����new Runnable();
 * ������ʽ��
 * 	���η�  synchronized ����ֵ���� ������(�����б�){}
 * 
 * 
 * 
 * ע�⣡����������Ǿ�̬ͬ����������ʽΪ �����η� static synchronized ����ֵ���� ������(�����б�){}
 * 			������Ϊ�����class����-->class�ļ�����(����)
 * @author 123
 *
 */
public class ����̰߳�ȫ�ĵڶ��ַ���ͬ������ {
	public static void main(String[] args) {
		Runnable run=new Runnable() {
			private int number=100;
			Object obj=new Object();
			public synchronized void TB() {//ͬ������  ������Ϊthis  
				if (number>0) {
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"-->��������"+number+"��Ʊ");
					number--;
				}
			}//ͬ������  ������Ϊthis
			public void run() {
				while (number>0) {
					TB();
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
