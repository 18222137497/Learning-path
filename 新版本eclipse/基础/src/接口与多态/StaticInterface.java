package �ӿ����̬;

/**
 * �ӿڵķ�������
 * �ӿ��޷������Ա�����������Զ��峣������public static final����
 * @author 123
 *
 */
public class StaticInterface {
	public static void main(String[] args) {
		//Demo.run;�������޷��̳з�����Ҳ�޷�����
		IF.run();//�ӿ�û�й��췽��������ʵ����=���ܴ������󣡣�����
		Demo d=new Demo();
		CF c=new CF() {
			public void sing() {//�ӿڿ��Ա�ʵ��������������д���ĳ��󷽷�
				System.out.println("cfsing");
			}
		};
		d.eat();//Ĭ�Ϸ���ֻ����ʵ����Ķ�����ã�����ͨ���ӿڵ���,Ҳ����ͨ��ʵ�������
		d.sing();
	}
}

class Demo implements IF,CF {//�ӿڵĶ�ʵ��
	public void sing() {//������д�ӿڵ����Գ��󷽷������ʵ�ֵĽӿ���������ͬ�ĳ��󷽷���ֻ����дһ��
		System.out.println("���裡");
	}
	public void eat() {//���Ĭ�Ϸ������������򣡣������룡������дһ�� 
		System.out.println("��");
	}
//	public static void run(){        !!!!!!��Ϊ��.class�ļ��йأ����Բ�����д�ӿ��еľ�̬����!!!!!!!!
//		System.out.println("������!");
//	}

}
interface CF{
	public abstract void sing();
	public default void eat() {
		System.out.println("�ԣ�");
	}
}
