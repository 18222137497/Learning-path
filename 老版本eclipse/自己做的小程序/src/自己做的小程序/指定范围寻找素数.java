package �Լ�����С����;

import java.util.Scanner;

public class ָ����ΧѰ������ {
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
		System.out.println("����" + zahl + "������");
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�����뷶Χ��");
		int range = scan.nextInt();
		ָ����ΧѰ������.getNumber(range);
	}

}
