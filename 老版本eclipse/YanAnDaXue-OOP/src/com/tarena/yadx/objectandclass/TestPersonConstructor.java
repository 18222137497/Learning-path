package com.tarena.yadx.objectandclass;
/**
 * ���ԣ�ͨ�����췽�����в��޲μ���ʼ��
 * @author 123
 *
 */

public class TestPersonConstructor {
	/*
	 * ��ϰ2��1��������name age salary
	 *        2���幹�췽��:
	 *              -�޲ο���̨��ӡ���޲εĹ��췽����
	 *              -1��name ��ʼ����Ա����
	 *              -����name age
	 *              -����
	 *        3���巽��showMe
	 *              ��ӡ�˵Ļ�����Ϣ��ͨ���ַ�����ƴ��
	 *              ƴ�Ӹ�ʽΪperson[name=,age=,salary=]  
	 * һ.���췽��������
	 *    1.Ϊ��ʹ�÷�����Զ�һ���ඨ�������췽������Щ���췽��������ͬ�����ƣ�������
	 *      �����Ĳ�����ͬ����֮Ϊ���췽��������
	 *    2.�ڴ�������ʱ��java��������ͨ����ͬ�Ĳ������ò�ͬ�Ĺ��췽��                   
	 */
	String name;//����
	int age;
	int salary;
	public  TestPersonConstructor(){
		System.out.println("�޲εĹ��췽��");
	}
	public TestPersonConstructor(String name){
//		this.name=name;
		System.out.println("1�������Ĺ��췽��");
	}
	public TestPersonConstructor(String name,int age){
//		this.name=name;
//		this.age=age;
		System.out.println("2�������Ĺ��췽��");
	}
	public TestPersonConstructor(String name,int age,int salary){
		this("",10);
		this.name=name;
	    this.age=age;
	    this.salary=salary;
		
		System.out.println("���������Ĺ��췽��");

	}
	public void showMe(){
		System.out.println("name="+name+"��age="+age+"�꣬salary="+salary+"ë");
	}
	public static void main(String[] args) {
		new TestPersonConstructor("",10,10).showMe();;
		
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
