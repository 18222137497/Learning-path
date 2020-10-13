package day04;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
	//三目运算
		/*
		 * 1.条件运算符
		 *   语法：boolean？数1：数2（真就走数1，假就走数2）
		 *   执行过程：先是计算boolen的值若为true则整个表达结果为数1的值
		 *                               若为false则整个表达式的结果为数2的值
		 */
//		Scanner scan=new Scanner(System.in);
//		System.out.println("请输入年份？");
//		int year=scan.nextInt();
//		boolean flag=(year%4==0&&year%100!=0);
//		String str=flag?year+"是闰年":year+"不是闰年";
//		System.out.println(str);
		
		int a= 8,b = 55;
		int max=a>b?a:b;
		System.out.println("max="+max);
		
	}

}
