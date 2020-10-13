package com.tedu.manystar;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class TowMoonJPanel extends JPanel {
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		this.setBackground(Color.BLACK);

		g.setFont(new Font("宋体",Font.BOLD,10));
		g.setColor(Color.BLUE);
		for (int i = 0; i < 501; i++) {
			int x=(int)(Math.random()*Factory.jfwidth);
			int y=(int)(Math.random()*Factory.jfheight);
		g.drawString("*", x, y);
		}
		g.setColor(Color.YELLOW);            
		g.setFont(new Font("宋体",Font.BOLD,45));
		//实心圆
		g.fillOval(250, 100, 100, 100);
		g.setColor(Color.BLACK);
		g.fillOval(250, 100, 80, 80);
	}



}
