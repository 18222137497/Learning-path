package Swing�������;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * ���񲼾ֹ�����
 * @author 123
 *
 */

public class AafGridLayout extends JFrame {
	public AafGridLayout(){
		setBounds(100, 100, 300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new GridLayout(7,3,5,5));//�������񲼾�7�����У���ֱˮƽ����Ϊ5
		for (int i = 0; i < 21; i++) {
			c.add(new JButton("��ť"+i));
		}
		
		
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new  AafGridLayout();
	}

}
