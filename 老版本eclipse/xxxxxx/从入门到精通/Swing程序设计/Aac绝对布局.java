package Swing程序设计;
/**
 * 絕對佈局
 */
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public 	class Aac绝对布局 extends JFrame{
	public Aac绝对布局(){
		setBounds(100, 100, 200, 150);
		setVisible(true);
		Container c=getContentPane();
		c.setLayout(null);//將容器的佈局設置爲絕對佈局
		JButton b1=new JButton("按鈕1"),b2=new JButton("按鈕2");
		b1.setBounds(10, 30, 80, 30);
		b2.setBounds(60, 70, 100, 20);
		c.add(b1);
		c.add(b2);
		setDefaultCloseOperation(Aac绝对布局.this.EXIT_ON_CLOSE);
		setResizable(false);
		
	}
	public static void main(String[] args) {
		new Aac绝对布局();
	}
	
}