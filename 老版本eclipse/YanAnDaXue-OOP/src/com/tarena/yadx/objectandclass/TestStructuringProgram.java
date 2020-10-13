package com.tarena.yadx.objectandclass;

import java.util.Scanner;

public class TestStructuringProgram {
	/*
	 * 练习1：
	 * 使用main输出人的信息，人的信息包含以下内容
	 *  1.姓名2.年龄3.性别4.薪水
	 */
	public static void main(String[] args) {
//		String name = "张宇";
//		int age=20;
//		boolean sex=false;
//		double salary=200.00;
//		System.out.println("-----------");
//		System.out.println("姓名："+name);
//		System.out.println("-----------");
//		System.out.println("年龄："+age);
//		System.out.println("-----------");
//		System.out.println("性别:"+sex);
//		System.out.println("-----------");
//		System.out.println("薪水："+salary);
		TestStructuringProgram.printPrintson("汪京", 21, false,8000000.00 );
		
	}

	public static void printPrintson(String name,int age,boolean sex,double salary){
		System.out.println("-----------");
		System.out.println("姓名："+name);
		System.out.println("-----------");
		System.out.println("年龄："+age);
		System.out.println("-----------");
		System.out.println("性别:"+sex);
		System.out.println("-----------");
		System.out.println("薪水："+salary);
		System.out.println();
		
	}
	
}
