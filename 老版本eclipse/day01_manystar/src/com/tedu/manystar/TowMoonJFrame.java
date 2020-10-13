package com.tedu.manystar;

import javax.swing.JFrame;

public class TowMoonJFrame extends JFrame{
	public TowMoonJFrame() {
		this.setTitle("‘¬¡¡");
		this.setVisible(true);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setBounds(Factory.jframeX, Factory.jframeY, Factory.jfwidth, Factory.jfheight);
		this.add(new TowMoonJPanel());
	
	}
	public static void main(String[] args) {
		new TowMoonJFrame();
	}

}
