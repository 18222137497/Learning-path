package 自己做的小程序;

import java.util.Scanner;

public class 打折系统优化 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("请输入单价：");
		int a=scan.nextInt();
		System.out.print("请输入数量：");
		int b=scan.nextInt();
		System.out.print("请输入付款金额：");
		int c=scan.nextInt();
		int d=a*b;
		if(c>=d&&d>500){
			System.out.println("应收金额："+b*0.8+" "+"实收："+c+"找零："+(c-d*0.8));
			
			
		}else if(c>=d&&d<500){
			System.out.println("应收："+d+" "+"实收"+c+" "+"找零："+(c-d));
			
		
		}else{
			System.out.println("您钱给少了");
		}

	}

}
