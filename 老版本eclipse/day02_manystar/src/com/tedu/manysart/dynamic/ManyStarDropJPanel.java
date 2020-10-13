package com.tedu.manysart.dynamic;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class ManyStarDropJPanel extends JPanel implements Runnable{
	
	/*����-����ÿ���ǵ�x��y����*/
	int[] x;//ÿ���ǵ�x����
	int[] y;//ÿ���ǵ�y����
	
	/*����-����ÿ���ǵ����弰��ɫ����*/
	Color[] c;
	Font[] f;
	
	/*����-�����̶߳���*/
	Thread t;
	
	/*���췽����ʼ������*/
	public ManyStarDropJPanel(){
		//���ñ�����ɫ
		this.setBackground(Color.BLACK);
		//ʵ�����̶߳���
		t = new Thread(this);
		//�߳�����
		t.start();
		//ʵ��������x��y����С����ɫ
		x = new int[300];
		y = new int[300];
		c = new Color[300];
		f = new Font[300];
		//ѭ�������������ֵ
		for (int i = 0; i < x.length; i++) {
			x[i] = Factory.randomPoint(Factory.jfwidth);
			y[i] = Factory.randomPoint(Factory.jfheight);
			c[i] = Factory.randomColor(256);
			f[i] = Factory.randomFont(35);
					
		}
	}
	//��дpaint����
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		for (int i = 0; i < x.length; i++) {
			g.setColor(c[i]);
			g.setFont(f[i]);
			g.drawString("*", x[i], y[i]);
		}
	}

	@Override
	public void run() {
		while(true){
			for (int i = 0; i < x.length; i++) {
				y[i]++;
				if(y[i] == Factory.jfheight){
				y[i]=0;
				//���������½�����ɫ������
				c[i] = Factory.randomColor(256);
				f[i] = Factory.randomFont(35);
				
			}
		}
		repaint();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch blockprintStackTrace();
		}
		}
	}
}
