package day05;

import java.util.Scanner;

//命令解析程序
public class SwitchCase {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请您选择功能：1:显示全部记录 2：查询登录记录 0：提出建议");
		int command=scan.nextInt();
		switch(command){
		case 1:
			System.out.println("显示全部记录");
			break;
		case 2:
			System.out.println("查询登录记录");
			break;
		case 3:
			System.out.println("提出建议");
			break;
		default:
			System.out.println("输入错误");
		
		}
	

	}

}
