package �̻߳��ѵȴ�����;
/**
 * ������
 * 	ע�⣺�������߳�������̹߳�ϵ-->ͨ�ţ����⣩
 * 		����ͬʱͬ����������֤�����߳�ֻ��һ����ִ��
 * 		��������뱣֤Ψһ������ʹ�ð��Ӷ�����Ϊ������
 * 		��������ͳԻ������Ҫ�Ѱ��Ӷ�����Ϊ�������ݽ���
 * 			1.��Ҫ�ڳ�Աλ�ô���һ�����ӱ���
 * 			2.ʹ�ô��������췽��Ϊ������Ӹ�ֵ
 * @author 123
 *
 */
public class BaoZiPu extends Thread{
	private Baozi bz;
	public BaoZiPu(Baozi bz) {
		this.bz =bz;
	}
	//�����߳����� ����������
	@Override
		public void run() {
		int count=0;
		while(true) {
			synchronized(bz) {
				if (bz.flag==true) {
					//�����̽���ȴ�����״̬
					try {
						bz.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				if (count%2==0) {
					bz.pi="��Ƥ";
					bz.xian="������";
				}else {
					bz.pi="��Ƥ";
					bz.xian="ţ����";
				}
				count++;
				System.out.println("��������������"+bz.pi+bz.xian+"����");
				try {//����������Ҫ3��
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				bz.flag=true;
				bz.notify();
				System.out.println(bz.pi+bz.xian+"�����Ѿ����ã����Գ���");
				
				
			}
		}
		}
}
