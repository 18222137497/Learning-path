package Swing�������;
/**
 * �^���Ѿ�
 */
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public 	class Aac���Բ��� extends JFrame{
	public Aac���Բ���(){
		setBounds(100, 100, 200, 150);
		setVisible(true);
		Container c=getContentPane();
		c.setLayout(null);//�������āѾ��O�à��^���Ѿ�
		JButton b1=new JButton("���o1"),b2=new JButton("���o2");
		b1.setBounds(10, 30, 80, 30);
		b2.setBounds(60, 70, 100, 20);
		c.add(b1);
		c.add(b2);
		setDefaultCloseOperation(Aac���Բ���.this.EXIT_ON_CLOSE);
		setResizable(false);
		
	}
	public static void main(String[] args) {
		new Aac���Բ���();
	}
	
}