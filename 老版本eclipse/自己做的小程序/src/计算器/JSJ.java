package ¼ÆËãÆ÷;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JSJ extends JFrame{
	public JSJ(){
		setTitle("¼ÆËãÆ÷");
		setSize(400, 500);
		setLocationRelativeTo(null);
		Container c=getContentPane();
		c.setLayout(new GridLayout(4,3,0,0));
		String[][] math={{"7","8","9"},
				         {"4","5","6"},
				         {"1","2","3"},
				         {"µ¹ÍË","0","."}};
		for (int i = 0; i < math.length; i++) {
			for (int j = 0; j < math[i].length; j++) {
				c.add(new JButton(math[i][j]));
			}
		}
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JSJ();
	}
}
