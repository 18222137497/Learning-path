package Swing程序设计;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPasswordField;

/**
 * 密码框 JPasswordField
 * @author 123
 *
 */
public class AaqJPasswordField extends JFrame{
	public AaqJPasswordField(){
		setBounds(100, 100, 400, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		JPasswordField jp=new JPasswordField();//创建密码框
		jp.setColumns(20);//设置密码框大小，20个字符
		jp.setEchoChar('*');//设置回显字符
		jp.addActionListener(new ActionListener() {       //设置事件监听，回车
			public void actionPerformed(ActionEvent e) {
				char[] cr=jp.getPassword();//将密码框中每个内容分别传入字符数组中
				String arr=new String(cr);//将字符数组合并成字符串
				System.out.println(arr);//输出字符串
			}
		});
		c.add(jp);
	
		
		
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new AaqJPasswordField();
	}
	
}
