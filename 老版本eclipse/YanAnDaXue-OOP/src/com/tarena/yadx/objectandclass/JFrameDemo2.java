package com.tarena.yadx.objectandclass;

import javax.swing.JFrame;

public class JFrameDemo2 {
//	public static void main(String[] args) {
//		JFrame j = new JFrame();
//		j.setTitle("窗口");
//		j.setSize(800, 600);
//		j.setVisible(true);
//		j.setLocationRelativeTo(null);
//		j.setDefaultCloseOperation(j.EXIT_ON_CLOSE);
//	}
	//属性
	JFrame jf;
	//构造方法初始化参数
	public JFrameDemo2(){
		jf=new JFrame();
		jf.setTitle("MyJFrame");
		jf.setSize(600, 800);
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.setVisible(true);
	}
	//主方法
	public static void main(String[] args) {
		new JFrameDemo2();
	}

}
