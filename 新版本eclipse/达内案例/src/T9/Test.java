package T9;

public class Test {
	public static void main(String[] args) {
		Cylinder c = new Cylinder(1, 1, "��ɫ");
		System.out.println("Բ�����	" + c.area());
		c.setColor("��ɫ");
		c.volume();
		System.out.println(c);
	}
}
