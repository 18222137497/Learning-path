package �̻߳��ѵȴ�����;

public class Chihuo extends Thread{
	private Baozi bz;
	public Chihuo(Baozi bz) {
		this.bz=bz;
	}
	@Override
	public void run() {
		while (true) {
			synchronized (bz) {
				if (bz.flag==false) {
					try {
						bz.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				//������֮��ִ�г԰���
				System.out.println("�Ի����ڳ�"+bz.pi+bz.xian+"����");
				bz.flag=false;
				bz.notify();
				System.out.println("�Ի��Ѿ�����"+bz.pi+bz.xian+"����,�����̿�ʼ����");
				System.out.println("-------------------------------");
			}
			
		}
	}
}
