package com.tedu.manystar;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class ManySartJPanel extends JPanel {
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		this.setBackground(Color.BLACK);
		g.setColor(Color.YELLOW);
		g.fillOval(250, 100, 100, 100);
		g.setColor(Color.BLACK);
		g.fillOval(250, 100, 80, 80);
		for (int i = 0; i < 500; i++) {
			g.setColor(Factory.randomColor(256));
			g.setFont(Factory.randomFont(45));
			g.drawString("*", Factory.randomPoint(Factory.jfwidth), Factory.randomPoint(Factory.jfheight));
		}
		
		
	}

}
