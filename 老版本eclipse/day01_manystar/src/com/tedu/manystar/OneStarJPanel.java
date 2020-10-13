package com.tedu.manystar;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class OneStarJPanel extends JPanel {

	public void paint(Graphics g) {
		super.paint(g);
		//设置背景颜色
		this.setBackground(Color.BLACK);
		//设置画笔颜色
		g.setColor(Color.yellow);
		//设置字体
		g.setFont(new Font("宋体",Font.BOLD,45));
		//绘制
		for (int i = 0; i < 501; i++) {
			int x=(int)(Math.random()*Factory.jfwidth);
			int y=(int)(Math.random()*Factory.jfheight);
		g.drawString("*", x, y);
	}
		}
}
