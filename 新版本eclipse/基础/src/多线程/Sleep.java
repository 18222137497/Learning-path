package ���߳�;
/**
 * Thread.sleep(long ����)��ʹ�߳�˯�ߣ�ʱ�����ٺ�������һ�Σ�
 * @author 123
 *
 */
public class Sleep {
	public static void main(String[] args) {
	for (int i = 1; i < 61; i++) {
		System.out.println(i);
		try {
			Thread.sleep(1000);//һǧ�������һ��
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
}
