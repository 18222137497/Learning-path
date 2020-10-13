package day04;

import java.util.Scanner;

//柜台收银程序
/*
 * 练习
 * 1满600打9折，不满打八折
 */
public class DaZheXT {

	public static void main(String[] args) {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("请输入单价？");
//		double unitprice=scan.nextDouble();
//		System.out.println("请输入数量？");
//		double amout=scan.nextDouble();
//		System.out.println("请输入金额？");
//		double money=scan.nextDouble();
//		//计算总价（单价乘以数量=总价）
//		double totalprice=unitprice*amout;
//		if(totalprice>=500){
//			totalprice*=0.8;
//		}
//		if(money>=totalprice){
//			double change=money-totalprice;//计算找零
//			System.out.println("总价为"+totalprice+" "+"找零为"+change);
//			
//		}else{
//			double change=totalprice-money;
//			System.out.println("您的钱不够"+"差"+change+"元");
//		}
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入单价");
		double unitprintln=scan.nextDouble();
		System.out.println("请输入数量");
		double amout=scan.nextDouble();
		double zongjia=unitprintln*amout;
		System.out.println("总价为"+zongjia);
		System.out.println("请付款");
		double money=scan.nextDouble();
		if(money>=zongjia&&zongjia>=600){
			double $=money-(zongjia*=0.9);
			System.out.println("找零"+$+"元");
		}else{
			double $=money-(zongjia*0.8);
			System.out.println("找零"+$+"元");
		}
		
				
	}

}
