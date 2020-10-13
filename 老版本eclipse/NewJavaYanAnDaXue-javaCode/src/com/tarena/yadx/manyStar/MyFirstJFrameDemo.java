package com.tarena.yadx.manyStar;

import javax.swing.JFrame;

/**
 * 窗体创建的第一种方式 主函数完成
 * 
 * @author 123
 *
 */

public class MyFirstJFrameDemo {
	public static void main(String[] args) {

		// 实例化窗体对象
		JFrame JF = new JFrame();

		// 设置标题
		JF.setTitle("我的第一个窗体");

		// 设置窗口大小
		JF.setSize(600, 800);

		// 设置默认关闭方式
		JF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 设置水平垂直居中---布局方式
		JF.setLocationRelativeTo(null);
		// 显示窗体
		JF.setVisible(true);
		
		
		/*
		 * 此种创建方式完全采用javaCode的方式，
		 * 出现了在main函数中写完了所有代码，复杂且繁琐且低效，逻辑不清楚
		 */
		
	}

}
