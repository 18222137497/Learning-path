package day05;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入密码：");
		int a=scan.nextInt();
		switch(a){
		case 10086:
			System.out.println("正确！");
			break;
		case 10085:
			System.out.println("就差一点点了！");
			break;
		default:
			System.out.println("错误");
			
		}

	}

}
