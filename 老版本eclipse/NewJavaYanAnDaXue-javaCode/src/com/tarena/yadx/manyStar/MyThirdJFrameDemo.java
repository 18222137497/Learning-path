package com.tarena.yadx.manyStar;

import javax.swing.JFrame;

/**
 * 创建窗体的第三种方式
 * 1.采用面向对象的思想完成程序别写
 * 2.采用构造方法初始化参数
 * 3.采用面向对象的特征一-继承的方式完成代码编写
 * 4.采用工厂类-（提取公共属性及方法）-完成程序编写
 * 5.采用逻辑运算方式完成窗体的水平垂直居中
 * @author 123
 *
 */

public class MyThirdJFrameDemo extends JFrame{
	
	//构造方法初始化参数
	public MyThirdJFrameDemo(){
		this.setTitle("MyThirdJFrame");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//设置窗体的居中及大小
		this.setBounds(Factory.jframeX, Factory.jframeY, Factory.jframeWidth, Factory.jframeHeight);
		this.setVisible(true);
		
	
		
	}
	public static void main(String[] args) {
		new MyThirdJFrameDemo();
	}
	/*
	 * 此种方式看似复杂但代码量一大则简单
	 * 优点：
	 * 1.使用了面向对象的编程思想
	 * 2.使用了构造方法初始化参数及继承的特征，简化了代码的重复编写，以及逻辑的信息
	 * 3.使用公共类封装了静态的属性及方法简化了代码的重复编写
	 * 4.创建对象的数量较少改善了程序的功能效率
	 * 
	 */
	

}
