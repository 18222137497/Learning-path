package com.tarena.yadx.brench;

import java.util.Scanner;

public class ToCollectMoney1 {
	public static void main(String[] ages){
		/*
		 * ����̨�տ����
		 * 1.������Ʒ���۹��������Լ��׿�����㲢���Ӧ�ս�������
		 * 2.����
		 *       -�������룺������������
		 *       -���������Ӧ�ս������
		 *       -�������ṹ��double�ͱ���          
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("��ԭ�أ�5ëһ���");
		System.out.println("�����빺��������");
		int number=scan.nextInt();
		if(number>0){
			System.out.println("��Ҫ����ǲ�ԭ��"+number+"���");
			System.out.println("��֧��:"+number/2.0+"Ԫ");
			System.out.println("��֧����");
			double money=scan.nextDouble();
			if(money>=number/2){
				while(true){
					String a=(number/2==money)||(number/2>money)&&(number/2==money)?"Ǯ����":"����:";
					System.out.println(money-number/2.0+"Ԫ");
					break;
				}
			}else{
				System.out.println("Ǯ����,��"+(number/2-money)+"Ԫ");
		}
		}
		
		
		
	}

}
