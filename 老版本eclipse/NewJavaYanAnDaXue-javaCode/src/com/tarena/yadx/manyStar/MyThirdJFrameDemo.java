package com.tarena.yadx.manyStar;

import javax.swing.JFrame;

/**
 * ��������ĵ����ַ�ʽ
 * 1.������������˼����ɳ����д
 * 2.���ù��췽����ʼ������
 * 3.����������������һ-�̳еķ�ʽ��ɴ����д
 * 4.���ù�����-����ȡ�������Լ�������-��ɳ����д
 * 5.�����߼����㷽ʽ��ɴ����ˮƽ��ֱ����
 * @author 123
 *
 */

public class MyThirdJFrameDemo extends JFrame{
	
	//���췽����ʼ������
	public MyThirdJFrameDemo(){
		this.setTitle("MyThirdJFrame");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//���ô���ľ��м���С
		this.setBounds(Factory.jframeX, Factory.jframeY, Factory.jframeWidth, Factory.jframeHeight);
		this.setVisible(true);
		
	
		
	}
	public static void main(String[] args) {
		new MyThirdJFrameDemo();
	}
	/*
	 * ���ַ�ʽ���Ƹ��ӵ�������һ�����
	 * �ŵ㣺
	 * 1.ʹ�����������ı��˼��
	 * 2.ʹ���˹��췽����ʼ���������̳е����������˴�����ظ���д���Լ��߼�����Ϣ
	 * 3.ʹ�ù������װ�˾�̬�����Լ��������˴�����ظ���д
	 * 4.����������������ٸ����˳���Ĺ���Ч��
	 * 
	 */
	

}
