package com.tarena.yadx.objectandclass;

import java.util.Scanner;

public class TestStructuringProgram {
	/*
	 * ��ϰ1��
	 * ʹ��main����˵���Ϣ���˵���Ϣ������������
	 *  1.����2.����3.�Ա�4.нˮ
	 */
	public static void main(String[] args) {
//		String name = "����";
//		int age=20;
//		boolean sex=false;
//		double salary=200.00;
//		System.out.println("-----------");
//		System.out.println("������"+name);
//		System.out.println("-----------");
//		System.out.println("���䣺"+age);
//		System.out.println("-----------");
//		System.out.println("�Ա�:"+sex);
//		System.out.println("-----------");
//		System.out.println("нˮ��"+salary);
		TestStructuringProgram.printPrintson("����", 21, false,8000000.00 );
		
	}

	public static void printPrintson(String name,int age,boolean sex,double salary){
		System.out.println("-----------");
		System.out.println("������"+name);
		System.out.println("-----------");
		System.out.println("���䣺"+age);
		System.out.println("-----------");
		System.out.println("�Ա�:"+sex);
		System.out.println("-----------");
		System.out.println("нˮ��"+salary);
		System.out.println();
		
	}
	
}
