package com.tarena.yadx.objectandclass;

import javax.swing.JFrame;

public class TestJFrame {
	public static void main(String[] args) {	
	JFrame J=new JFrame();
	
	J.setTitle("窗口");//设置标题
	J.setSize(800, 600);//设置窗口大小
	J.setVisible(true);//设置窗口可见
	J.setLocationRelativeTo(null);//设置窗体水平居中
	J.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置窗体默认关闭方式
	
	
	
	}
}
