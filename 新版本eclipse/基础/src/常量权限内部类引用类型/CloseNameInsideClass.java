package ����Ȩ���ڲ�����������;
/**
 * �����ڲ���
 * �����ڲ������̳�һ�������ʵ��һ�����ӿ�
 * @author 123
 *
 */
public class CloseNameInsideClass {
	public static void main(String[] args) {
		FlyAble f=new FlyAble() {
			public void fly() {
				System.out.println("����");
			}
		};
		f.fly();
		showFly(f);
	}
	public static void showFly(FlyAble f) {
		f.fly();
	}
}
abstract class FlyAble{//����һ��������
	public abstract void fly();
}
