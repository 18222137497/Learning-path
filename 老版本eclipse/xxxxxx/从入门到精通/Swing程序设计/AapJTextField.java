package Swing程序设计;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 * 文本框 JTextField
 * @author 123
 *
 */
public class AapJTextField extends JFrame{
	public AapJTextField(){
		setBounds(100, 100, 400,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());//设置流布局
		JTextField jf=new JTextField();//创建文本框
		jf.setText("请输入值");
		jf.setColumns(20);//给文本框一个长度，这个是20个字符长度
		c.add(jf);
		JButton jb=new JButton("输出");
		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(AapJTextField.this, "输入的是："+jf.getText());
				jf.setText("");//清空文本狂
				jf.requestFocus();	//焦点返回文本框
			}
		});
		c.add(jb);
		setVisible(true);
	}
	public static void main(String[] args) {
		new AapJTextField();
	}

}
