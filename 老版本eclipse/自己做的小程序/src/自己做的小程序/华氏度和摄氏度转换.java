package 自己做的小程序;

import java.util.Scanner;

public class 华氏度和摄氏度转换 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入温度（n C/F）");
		int n=scan.nextInt();
		char a=scan.next().trim().charAt(0);
		if(a=='c'||a=='C'){
			double b=9*n/5.0+32;
			int c=(int)(b+0.5);
			System.out.println("您输入的是："+n+"	"+a);
			System.out.println("转化后："+c+"F");
			
		}else if(a=='f'||a=='F'){
			double b=5*(n-32)/9.0;
			int c=(int)(b+0.5);
			System.out.println("您输入的是："+n+"	"+a);
			System.out.println("转换后："+c+"C");
			
		}else{
			System.out.println("注意格式！");
		}

	}

}
