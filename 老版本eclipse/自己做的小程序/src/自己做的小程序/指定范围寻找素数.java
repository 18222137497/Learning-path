package 自己做的小程序;

import java.util.Scanner;

public class 指定范围寻找素数 {
	public static void getNumber(int range) {
		int zahl = 0;
		for (int i = 2; i < range; i++) {
			boolean a = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					a = false;
					break;
				}
				

			}
			if (a) {
				System.out.print(i + "	");
				zahl++;
				if (zahl % 10 == 0) {
					System.out.println();
				}

			}

		}
		System.out.println();
		System.out.println("共有" + zahl + "个质数");
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入范围：");
		int range = scan.nextInt();
		指定范围寻找素数.getNumber(range);
	}

}
