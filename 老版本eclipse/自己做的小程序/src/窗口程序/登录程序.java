package 窗口程序;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class 登录程序 extends JFrame{
	private String arr="252587065";
	private String arr1="13512851948";
	public 登录程序(){
		setSize(500, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(null);
		JLabel jl=new JLabel("用户名:");
		jl.setBounds(160, 100, 50, 20);
		c.add(jl);
		JLabel jl1=new JLabel("密码:");
		jl1.setBounds(160, 130, 50, 20);
		c.add(jl1);
		JTextField jt=new JTextField();//用户名文本框
		jt.setBounds(210, 100, 100, 20);
		c.add(jt);
		JPasswordField jp=new JPasswordField();//密码框
		jp.setBounds(210, 130, 100, 20);
		c.add(jp);
		JButton jb=new JButton("登录");
		jb.setBounds(170, 170, 60, 30);
		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char[] a=jp.getPassword();//获得密码框内容
				String c=new String();
				for (char d : a) {
					c+=d;
				}
				if (jt.getText().equals(arr)&&c.equals(arr1)) {
					JOptionPane.showMessageDialog(登录程序.this, "登录成功！");
				}else{
					JOptionPane.showMessageDialog(登录程序.this, "用户名或密码不正确！");
				}
				
				
			}
		});
		c.add(jb);
		JButton jb1=new JButton("重置");
		jb1.setBounds(250, 170, 60, 30);
		jb1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				jt.setText("");
				jp.setText("");
				
			}
		});
		c.add(jb1);
		
		
		setResizable(false);//设置窗口大小不可变
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new 登录程序();
	}


}
