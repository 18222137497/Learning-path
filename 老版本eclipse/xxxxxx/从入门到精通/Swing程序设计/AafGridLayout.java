package Swing程序设计;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 网格布局管理器
 * @author 123
 *
 */

public class AafGridLayout extends JFrame {
	public AafGridLayout(){
		setBounds(100, 100, 300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new GridLayout(7,3,5,5));//设置网格布局7行三列，垂直水平间距均为5
		for (int i = 0; i < 21; i++) {
			c.add(new JButton("按钮"+i));
		}
		
		
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new  AafGridLayout();
	}

}
