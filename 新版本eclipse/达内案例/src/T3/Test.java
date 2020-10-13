package T3;

/**
 * 计算机
 * 
 * @author 123
 *
 */
public class Test {
	public static void main(String[] args) {
		// 加法
		double add = useCompute((a, b) -> a + b, 1, 2);
		System.out.println(add);
		// 减法
		double sub = useCompute((a, b) -> a - b, 2, 1);
		System.out.println(sub);
		// 乘法
		double ride = useCompute((a, b) -> a * b, 2, 3);
		System.out.println(ride);
		// 除法
		double div = useCompute((a, b) -> a / b, 6, 1);
		System.out.println(div);
	}

	public static double useCompute(Compute c, double a, double b) {
		return c.compute(a, b);

	}

}
