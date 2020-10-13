package com.tedu.manysart.dynamic;

import javax.swing.JFrame;

public class ManyStarDropJFrame extends JFrame{
	public ManyStarDropJFrame(){
		this.setTitle("");
		this.setBounds(Factory.jframeX, Factory.jframeY, Factory.jfwidth, Factory.jfheight);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setVisible(true);	
		this.add(new ManyStarDropJPanel());
	}
	public static void main(String[] args) {
		new ManyStarDropJFrame();
	}

}
