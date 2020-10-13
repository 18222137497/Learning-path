package com.tedu.manystar;

import javax.swing.JFrame;

public class ManySartJFrame extends JFrame {
	public ManySartJFrame(){
		this.setBounds(Factory.jframeX, Factory.jframeY, Factory.jfwidth, Factory.jfheight);
		this.setTitle("many star");
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.add(new ManySartJPanel());
	}
	public static void main(String[] args) {
		new ManySartJFrame(); 
		
	}

}
