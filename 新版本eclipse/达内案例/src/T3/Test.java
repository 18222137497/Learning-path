package T3;

/**
 * �����
 * 
 * @author 123
 *
 */
public class Test {
	public static void main(String[] args) {
		// �ӷ�
		double add = useCompute((a, b) -> a + b, 1, 2);
		System.out.println(add);
		// ����
		double sub = useCompute((a, b) -> a - b, 2, 1);
		System.out.println(sub);
		// �˷�
		double ride = useCompute((a, b) -> a * b, 2, 3);
		System.out.println(ride);
		// ����
		double div = useCompute((a, b) -> a / b, 6, 1);
		System.out.println(div);
	}

	public static double useCompute(Compute c, double a, double b) {
		return c.compute(a, b);

	}

}
