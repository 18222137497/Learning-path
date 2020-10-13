package T2;

/**
 * ËØÊý
 * 
 * @author 123
 *
 */
public class Prime extends Number {
	public static void main(String[] args) {
		new Prime().method();
	}

	public void method() {
		for (double i = 3; i < 101; i++) {
			boolean x = true;
			for (double j = 2; j < i; j++) {
				double b = i / j;
				int a = (int) b;
				if (a == b) {
					x = false;
				}
			}
			if (x) {
				System.out.println(i + "ËØÊý");
			}
		}
	}

}
