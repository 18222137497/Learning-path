package Swing程序设计;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 * 下拉框 JComboBox
 * @author 123
 *
 */
public class AamJComboBox extends JFrame{
	public AamJComboBox(){
		setBounds(100, 100, 400, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(null);
		String[] arr={"数学","语文","英语"}; 
		JComboBox<String> combobox=new JComboBox<>(arr);
		combobox.setBounds(10, 10, 80, 50);
		c.add(combobox);
		JButton j=new JButton("输出");
		j.setBounds(100, 10, 60, 40);
		j.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(AamJComboBox.this, "选中的索引是："+combobox.getSelectedIndex()+"\n选中的值为："+combobox.getSelectedItem());
			}
		});
		c.add(j);
		setVisible(true);
	}
	public static void main(String[] args) {
		new AamJComboBox();
	}

}
