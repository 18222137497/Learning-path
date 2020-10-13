package com.tarena.yadx.objectandclass;
/**
 * 测试（通过构造方法）有参无参即初始化
 * @author 123
 *
 */

public class TestPersonConstructor {
	/*
	 * 练习2：1定义属性name age salary
	 *        2定义构造方法:
	 *              -无参控制台打印“无参的构造方法”
	 *              -1参name 初始化成员变量
	 *              -二参name age
	 *              -三参
	 *        3定义方法showMe
	 *              打印人的基本信息；通过字符串的拼接
	 *              拼接格式为person[name=,age=,salary=]  
	 * 一.构造方法的重载
	 *    1.为了使用方便可以对一个类定义多个构造方法，这些构造方法都有相同的名称（类名）
	 *      方法的参数不同，称之为构造方法的重载
	 *    2.在创建对象时，java编译器会通过不同的参数调用不同的构造方法                   
	 */
	String name;//属性
	int age;
	int salary;
	public  TestPersonConstructor(){
		System.out.println("无参的构造方法");
	}
	public TestPersonConstructor(String name){
//		this.name=name;
		System.out.println("1个参数的构造方法");
	}
	public TestPersonConstructor(String name,int age){
//		this.name=name;
//		this.age=age;
		System.out.println("2个参数的构造方法");
	}
	public TestPersonConstructor(String name,int age,int salary){
		this("",10);
		this.name=name;
	    this.age=age;
	    this.salary=salary;
		
		System.out.println("三个参数的构造方法");

	}
	public void showMe(){
		System.out.println("name="+name+"，age="+age+"岁，salary="+salary+"毛");
	}
	public static void main(String[] args) {
		new TestPersonConstructor("",10,10).showMe();;
		
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
