package com.tarena.yadx.manyStar;

import javax.swing.JFrame;

/**
 * ��������ĵڶ��ַ�ʽ
 * ʹ�ù��췽����ʼ��JFrame
 * ����������JFrame����
 * @author 123
 *
 */
public class MySencondJFrameDemo {
	
	//��ĳ�Ա1������
	JFrame jframe;
	
	//��ĳ�Ա2�����췽��
	public MySencondJFrameDemo(){
		jframe =new JFrame();
		jframe.setTitle("MySecondJFrame");
		jframe.setSize(400, 600);
		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
		jframe.setLocationRelativeTo(null);//�����óߴ��پ���
		jframe.setVisible(true);
		
	}
	
	//��ĳ�Ա3������-������\
	public static void main(String[] args){
		new MySencondJFrameDemo();
		/*
		 * ���ַ������ù��췽����ʼ���������ﵽ�����������߼�����
		 * �����������������ҳ���ռ���ʽϸߡ�
		 */
	
	}
	

}
