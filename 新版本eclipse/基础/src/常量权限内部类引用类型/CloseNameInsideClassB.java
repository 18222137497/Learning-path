package ����Ȩ���ڲ�����������;
/**
 * CloseNameInsideClass�ļ򻯰汾
 * @author 123
 *
 */
public class CloseNameInsideClassB {
	public static void main(String[] args) {
		show(new FlyAble() {
			public void fly() {
				System.out.println("�ҷ���");
			}
		});
	}
	public static void show(FlyAble f) {
		f.fly();
	}
}
