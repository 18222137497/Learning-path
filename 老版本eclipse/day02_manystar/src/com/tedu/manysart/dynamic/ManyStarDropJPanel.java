package com.tedu.manysart.dynamic;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class ManyStarDropJPanel extends JPanel implements Runnable{
	
	/*属性-定义每颗星的x，y坐标*/
	int[] x;//每颗星的x坐标
	int[] y;//每颗星的y坐标
	
	/*属性-定义每颗星的字体及颜色数组*/
	Color[] c;
	Font[] f;
	
	/*属性-定义线程对象*/
	Thread t;
	
	/*构造方法初始化参数*/
	public ManyStarDropJPanel(){
		//设置背景颜色
		this.setBackground(Color.BLACK);
		//实例化线程对象
		t = new Thread(this);
		//线程启动
		t.start();
		//实例化数组x，y及大小和颜色
		x = new int[300];
		y = new int[300];
		c = new Color[300];
		f = new Font[300];
		//循环遍历设置随机值
		for (int i = 0; i < x.length; i++) {
			x[i] = Factory.randomPoint(Factory.jfwidth);
			y[i] = Factory.randomPoint(Factory.jfheight);
			c[i] = Factory.randomColor(256);
			f[i] = Factory.randomFont(35);
					
		}
	}
	//重写paint方法
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
				//重新设置下降的颜色和字体
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
