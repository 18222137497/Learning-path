package Lambda;
/**
 * Lambda���ʽ�ı�׼��ʽ��
 * 	����������ɣ�
 * 		a.һЩ����
 * 		b.һ����ͷ
 * 		c.һ�δ���
 * 	��ʽ��
 * 		(�����б�)->{һЩ��д�����Ĵ���};
 * 	����˵����ʽ:
 * 		():�ӿ��еĳ��󷽷��Ĳ����б�û�в������Ϳ��ţ��в�����д���������������ʹ��,�ָ�
 * 		->:���ݵ���˼���Ѳ������ݸ�������{}
 * 		{}:��д�ӿڵĳ��󷽷��ķ�����
 * @author 123
 *
 */
public class Demo1 {
	public static void main(String[] args) {
	new Thread(()->{
		System.out.println("ʹ��Lambda���ʽʵ�֣����߳�");
	}).start();
	//���µȼۣ�������Lambda
	new Thread(new Runnable() {
		@Override
		public void run() {
			System.out.println("����ʵ�ֶ��߳�");
		}
		
	}).start();
}
}
