package com.tarena.yadx.objectandclass;

public class TextClass {
	/*
	 * 把大象放进冰箱分几步？
	 * 一，什么是类
	 *  1.类是一种抽象的数据类型
	 *  2.类里面包含了抽象数据类型的组成
	 *   -属性：也称为成员变量
	 *   -方法：对于该类型实施操作
	 * 练习：自定义testclass为Bird类
	 * 完成属性
	 * 方法的创建
	 */
//	String name="鸟人";
//	boolean sex=false;
//	double weight=100;
//	public void sing(){
//		System.out.println("得不到的永远在骚动。。");
//	}
//	public void color(){
//		System.out.println("黑白相间，头上有点绿");
//	}
//	public void breed(){
//		System.out.println("哥伦比亚大鸟");
//	}
	/*
	 * 二，定义一个类
	 *  1.类的定义包括：成员变量的定义，和方法的定义，其中成员变量用于描述该类型对象共同的数据结构
	 *  2.java中类的成员变量的格式为：
	 *          class 类名{
	 *             成员变量的类型 变量的名称；
	 *             。。。。
	 *             }
	 *  3.类创建后其成员变量可以按照默认的方式初始化
	 *      注意：写在类中的变量为成员变量，成员变量可以不用对其初始化初值，因为编译器会提供默认的初值
	 *  4.成员变量初始化表
	 *   数值类型（byte，short，int，long）0
	 *   小数类型（float，double）0.0
	 *   boolean类型    false
	 *   char类型   空字符
	 *   String类型     null               
	 */
	/*
	 * 三，定义类的方法
	 *  1.类中除了定义成员变量外，还可以定义方法用于描述对象的行为，封装对象的功能
	 *  2.方法的格式如下
	 *  class 类名 {
	 *   修饰词 返回值类型 方法名称（小驼峰）（[参数列表]）{
	 *   逻辑题
	 *   }
	 *  }
	 */
	public static void main(String[] args) {
		int i=0;//局部变量
		 //如果不赋初值则用的时候会报错
		System.out.println(i);
	}

}






