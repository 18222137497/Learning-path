package com.tedu.manysart.dynamic;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class OneStarDropJPanel extends JPanel implements Runnable{
	//属性
	int y;//y坐标
	int x;
	int z=150;
	Thread t;//线程t
	Color c;
	Font f;
	//构造方法-初始化参数
	public OneStarDropJPanel() {
		this.setBackground(Color.BLACK);
		t=new Thread(this);//实例化线程对象
		t.start();//线程启动
		c=Factory.randomColor(256);//初始的随机颜色
		f=Factory.randomFont(65);//初始的随机字体
		x=Factory.randomPoint(Factory.jfwidth);
		
	}
	//重写JPanel中的paint方法
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
	//重写run方法
	public void run() {
		while(true){
			y++;
			z++;
			if (y>=Factory.jfheight) {
				y=0;
				x=Factory.randomPoint(Factory.jfwidth);//x重新初始化
				c=Factory.randomColor(256);//重新初始化颜色
				f=Factory.randomFont(65);//重新初始化字体
			}

			if (z>=350) {
				z=150;
			}
				repaint();//重绘
			try {//设置睡眠事件（毫秒）
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
