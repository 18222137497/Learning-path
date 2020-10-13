package com.tarena.yadx.accesscontrol;
/**
 * final关键字
 * @author 123
 *
 */
public class TestFinal {
	/*
	 * 一、final修饰变量
	 *  1.final修饰成员变量，意为不能改变。
	 *  2.final修饰成员变量，两种初始化方式：
	 *      -声明同时初始化
	 *      -构造方法初始化
	 *  3.final关键字也可以修饰局部变量，使用之前初始化即可
	 * 二、final修饰方法
	 *  1.final关键字修饰的方法不能被重写
	 *  2.使一个方法不能被重写的意义在于：防止在子类定义新的方法时不经意见重写
	 * 三、final修饰类
	 *  1.final修饰类不可以被继承
	 *  2.jdk中的一些基础类final，比如：String、Math、Integer、Double
	 *  3.使一个类不能被继承的意义：
	 *      可以保护类不被继承修改，可以控制滥用继承对系统造成的危害
	 * 四、static final常量
	 *  1.static final修饰成员变量称为长量必须同时声明且初始化，
	 *  不可被改变       
	 */
	public static final int START_STATE=0;

}
