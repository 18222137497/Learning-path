package day04;

import java.util.Scanner;

//��̨��������
/*
 * ��ϰ
 * 1��600��9�ۣ����������
 */
public class DaZheXT {

	public static void main(String[] args) {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("�����뵥�ۣ�");
//		double unitprice=scan.nextDouble();
//		System.out.println("������������");
//		double amout=scan.nextDouble();
//		System.out.println("�������");
//		double money=scan.nextDouble();
//		//�����ܼۣ����۳�������=�ܼۣ�
//		double totalprice=unitprice*amout;
//		if(totalprice>=500){
//			totalprice*=0.8;
//		}
//		if(money>=totalprice){
//			double change=money-totalprice;//��������
//			System.out.println("�ܼ�Ϊ"+totalprice+" "+"����Ϊ"+change);
//			
//		}else{
//			double change=totalprice-money;
//			System.out.println("����Ǯ����"+"��"+change+"Ԫ");
//		}
		Scanner scan=new Scanner(System.in);
		System.out.println("�����뵥��");
		double unitprintln=scan.nextDouble();
		System.out.println("����������");
		double amout=scan.nextDouble();
		double zongjia=unitprintln*amout;
		System.out.println("�ܼ�Ϊ"+zongjia);
		System.out.println("�븶��");
		double money=scan.nextDouble();
		if(money>=zongjia&&zongjia>=600){
			double $=money-(zongjia*=0.9);
			System.out.println("����"+$+"Ԫ");
		}else{
			double $=money-(zongjia*0.8);
			System.out.println("����"+$+"Ԫ");
		}
		
				
	}

}
