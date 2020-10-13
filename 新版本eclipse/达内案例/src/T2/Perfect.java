package T2;

/**
 * 完数
 * 
 * @author 123
 *
 */
public class Perfect extends Number {
	public static void main(String[] args) {
		new Perfect().method();
	}

	public void method() {
		for (double i = 3; i < 1001; i++) {
			double z = 0;
			for (double j = 2; j < i; j++) {
				double x = i / j;
				int y = (int) x;
				if (x == y) {
					z += x + j;
				}
			}
			if ((z / 2) + 1 == i) {
				System.out.println(i + "是完数");
			}
		}
	}

}
