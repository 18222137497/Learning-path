package Performance;

import java.util.Scanner;

public class age {
	public static void main(String[] ages) {
		// Scanner scan=new Scanner(System.in);
		// System.out.println("��������ݣ�");
		// int age=scan.nextInt();
		// if(age%4==0&&age%100!=0||age%400==0){
		// System.out.println("����");
		// }else{
		// System.out.println("ƽ��");
		//
		// }
		//
		Scanner scan = new Scanner(System.in);
		System.out.println("��������ݣ�");
		while (true) {
			int inputYear = scan.nextInt();

			String result = (inputYear % 400 == 0) || (inputYear % 4 == 0) && (inputYear % 100 != 0) ? "����" : "ƽ��";
			System.out.println(inputYear + "��:" + result);
		}

	}

}
