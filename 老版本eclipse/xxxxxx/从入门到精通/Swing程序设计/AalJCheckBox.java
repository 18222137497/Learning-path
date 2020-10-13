package Swing程序设计;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * 复选框 JCheckBox
 * @author 123
 *
 */
public class AalJCheckBox extends JFrame{
	public AalJCheckBox(){
		setBounds(100, 100, 400, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		JCheckBox c1=new JCheckBox("数学");
		JCheckBox c2=new JCheckBox("语文");
		JCheckBox c3=new JCheckBox("英语");
		c.add(c1);
		c.add(c2);
		c.add(c3);
		JButton j=new JButton("输出");
		j.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(AalJCheckBox.this,"我喜欢数学吗?		"
			                                  +c1.isSelected()+"\n我喜欢语文吗？		"
						                      +c2.isSelected()+"\n我喜欢英语吗？		"
			                                  +c3.isSelected());
			}
		});
		c.add(j);
		setVisible(true);
	}
	public static void main(String args[]){
		new AalJCheckBox();
	}

}
