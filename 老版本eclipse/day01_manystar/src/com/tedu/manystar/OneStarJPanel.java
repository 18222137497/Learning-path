package com.tedu.manystar;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class OneStarJPanel extends JPanel {

	public void paint(Graphics g) {
		super.paint(g);
		//���ñ�����ɫ
		this.setBackground(Color.BLACK);
		//���û�����ɫ
		g.setColor(Color.yellow);
		//��������
		g.setFont(new Font("����",Font.BOLD,45));
		//����
		for (int i = 0; i < 501; i++) {
			int x=(int)(Math.random()*Factory.jfwidth);
			int y=(int)(Math.random()*Factory.jfheight);
		g.drawString("*", x, y);
	}
		}
}
