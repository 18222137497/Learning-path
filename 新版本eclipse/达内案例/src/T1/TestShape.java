package T1;

import java.lang.reflect.Method;

public class TestShape {
	/* ͨ���÷����ܹ����㲢���һ��ͼ�ε��ܳ������ */
	public static void compute(Shape e) {
		boolean is = false;
		Method[] methods = e.getClass().getMethods();
		for (Method method : methods) {
			if (method.isAnnotationPresent(is3d.class)) {
				is = true;
			}
		}
		if (is) {
			System.out.println(e.getName());
			System.out.println("���" + e.getArea());
			System.out.println("���" + e.getLength());
		} else {
			System.out.println(e.getName());
			System.out.println("���" + e.getArea());
			System.out.println("�ܳ�" + e.getLength());
		}
	}

	public static void main(String[] args) {
		compute(new Rectangle(1, 2));
		System.out.println("--------------------------");
		compute(new Circle(1));
		System.out.println("--------------------------");
		compute(new Cone(new Circle(1), 1));
	}
}
