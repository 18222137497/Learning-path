package com.tarena.yadx.manyStar;

import javax.swing.JFrame;

/**
 * 创建窗体的第二种方式
 * 使用构造方法初始化JFrame
 * 设置其属性JFrame类型
 * @author 123
 *
 */
public class MySencondJFrameDemo {
	
	//类的成员1：属性
	JFrame jframe;
	
	//类的成员2：构造方法
	public MySencondJFrameDemo(){
		jframe =new JFrame();
		jframe.setTitle("MySecondJFrame");
		jframe.setSize(400, 600);
		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
		jframe.setLocationRelativeTo(null);//先设置尺寸再居中
		jframe.setVisible(true);
		
	}
	
	//类的成员3：方法-主方法\
	public static void main(String[] args){
		new MySencondJFrameDemo();
		/*
		 * 此种方法采用构造方法初始化参数，达到了面向对象的逻辑区分
		 * 但还不完美，复杂且程序占用率较高。
		 */
	
	}
	

}
