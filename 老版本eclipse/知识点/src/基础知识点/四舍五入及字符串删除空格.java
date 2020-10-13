package 基础知识点;

import java.util.Scanner;

public class 四舍五入及字符串删除空格 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("请输入当前温度（n c/f）：");
		int n=scan.nextInt();
		char temp=scan.next().trim().charAt(0);
		//next()接收字符串                   ！！！！
		//trim()去掉字符串左右空格           ！！！！
		//charAt(0)是将字符串第一ge字符返回  ！！！！
		if(temp=='c'||temp=='C'){
			//	F=9C/5+32
			double result=
					9*n/5.0+32;
			//保留小数，将除数变成浮点数
			//进行四舍五入
			int data=(int)(result+0.5);//四舍五入！！！！！！
			System.out.println("输入的温度是"+n+"	"+temp);
			System.out.println("转换后:"+data+"F");
		}else if(temp=='f'||temp=='F'){
			double result=5*(n-32)/9.0;
			int data=(int)(result+0.5);
			System.out.println("输入的温度是"+n+"	"+temp);
			System.out.println("转换后："+data+"C");
			
		}else{
			System.out.println("请输入正确的温度格式(n C/F)");
			
		}
		

	}

}
