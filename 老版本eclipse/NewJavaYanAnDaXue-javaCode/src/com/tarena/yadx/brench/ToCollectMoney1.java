package com.tarena.yadx.brench;

import java.util.Scanner;

public class ToCollectMoney1 {
	public static void main(String[] ages){
		/*
		 * 收银台收款程序
		 * 1.根据商品单价购买数量以及首款金额计算并输出应收金额和找零
		 * 2.分析
		 *       -定义输入：单价数量找零
		 *       -定义输出：应收金额找零
		 *       -设计输入结构：double型变量          
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("草原特，5毛一打儿");
		System.out.println("请输入购买数量：");
		int number=scan.nextInt();
		if(number>0){
			System.out.println("您要买的是草原特"+number+"打儿");
			System.out.println("需支付:"+number/2.0+"元");
			System.out.println("请支付：");
			double money=scan.nextDouble();
			if(money>=number/2){
				while(true){
					String a=(number/2==money)||(number/2>money)&&(number/2==money)?"钱正好":"找零:";
					System.out.println(money-number/2.0+"元");
					break;
				}
			}else{
				System.out.println("钱不够,差"+(number/2-money)+"元");
		}
		}
		
		
		
	}

}
