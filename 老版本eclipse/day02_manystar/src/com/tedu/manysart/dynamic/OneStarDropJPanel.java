package com.tedu.manysart.dynamic;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class OneStarDropJPanel extends JPanel implements Runnable{
	//����
	int y;//y����
	int x;
	int z=150;
	Thread t;//�߳�t
	Color c;
	Font f;
	//���췽��-��ʼ������
	public OneStarDropJPanel() {
		this.setBackground(Color.BLACK);
		t=new Thread(this);//ʵ�����̶߳���
		t.start();//�߳�����
		c=Factory.randomColor(256);//��ʼ�������ɫ
		f=Factory.randomFont(65);//��ʼ���������
		x=Factory.randomPoint(Factory.jfwidth);
		
	}
	//��дJPanel�е�paint����
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(c);
		g.setFont(f);
		g.drawString("*", x, y);
		g.setColor(Color.yellow);
		g.fillOval(250, 100, 100, 100);
		g.setColor(Color.BLACK);
		g.fillOval(z, 100, 100, 100);
		
		
	}
	//��дrun����
	public void run() {
		while(true){
			y++;
			z++;
			if (y>=Factory.jfheight) {
				y=0;
				x=Factory.randomPoint(Factory.jfwidth);//x���³�ʼ��
				c=Factory.randomColor(256);//���³�ʼ����ɫ
				f=Factory.randomFont(65);//���³�ʼ������
			}

			if (z>=350) {
				z=150;
			}
				repaint();//�ػ�
			try {//����˯���¼������룩
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
