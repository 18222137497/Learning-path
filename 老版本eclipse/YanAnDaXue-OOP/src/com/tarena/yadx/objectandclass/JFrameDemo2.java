package com.tarena.yadx.objectandclass;

import javax.swing.JFrame;

public class JFrameDemo2 {
//	public static void main(String[] args) {
//		JFrame j = new JFrame();
//		j.setTitle("����");
//		j.setSize(800, 600);
//		j.setVisible(true);
//		j.setLocationRelativeTo(null);
//		j.setDefaultCloseOperation(j.EXIT_ON_CLOSE);
//	}
	//����
	JFrame jf;
	//���췽����ʼ������
	public JFrameDemo2(){
		jf=new JFrame();
		jf.setTitle("MyJFrame");
		jf.setSize(600, 800);
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.setVisible(true);
	}
	//������
	public static void main(String[] args) {
		new JFrameDemo2();
	}

}
