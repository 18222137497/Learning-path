package 基础知识点;

import java.util.Scanner;

public class String及switch {

	public static void main(String[] args){ 
			System.out.println("请输入A-E中的一个字母");
			Scanner scan=new Scanner(System.in);
			String data=scan.next();
			data=data.toUpperCase();//转成大写
			switch(data){
			case"A":
				System.out.println("优秀");
				break;
			case"B":
				System.out.println("良好");
				break;
			case"C":
				System.out.println("中");
				break;
			case"D":
				System.out.println("及格");
				break;
			case"E":
				System.out.println("不及格");
				break;
			default://不满足前面条件
				System.out.println("输入有误");
				break;

	}

	}
}
