package Performance;

import java.util.Scanner;

public class age {
	public static void main(String[] ages) {
		// Scanner scan=new Scanner(System.in);
		// System.out.println("请输入年份：");
		// int age=scan.nextInt();
		// if(age%4==0&&age%100!=0||age%400==0){
		// System.out.println("闰年");
		// }else{
		// System.out.println("平年");
		//
		// }
		//
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入年份：");
		while (true) {
			int inputYear = scan.nextInt();

			String result = (inputYear % 400 == 0) || (inputYear % 4 == 0) && (inputYear % 100 != 0) ? "闰年" : "平年";
			System.out.println(inputYear + "年:" + result);
		}

	}

}
