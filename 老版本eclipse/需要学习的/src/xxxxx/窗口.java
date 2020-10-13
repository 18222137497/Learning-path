package xxxxx;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class 窗口 extends JFrame{
	public 窗口(){
		JPanel jp,jp1,jp2;
		JLabel jl1,jl2;
		JTextField jtf1;//JTextArea是多行文本容器
		JPasswordField jpf1;
		JButton jd1,jd2,jd3,jd4,jd5;
		this.setLayout(new GridLayout(3,1));
		jp1=new JPanel();
		jp2=new JPanel();
		jp =new JPanel();
		//设置标签
		jl1=new JLabel("用户名");
		jl2=new JLabel("密码");
		//设置文本框和密码框
		jtf1=new JTextField(10);
		jpf1=new JPasswordField(10);
		//设置按钮
		jd1=new JButton("登陆");
		jd2=new JButton("取消");
		jp.add(jl1);
		jp.add(jtf1);
		
		jp1.add(jl2);
		jp1.add(jpf1);
		
		jp2.add(jd1);
		jp2.add(jd2);
		
		this.add(jp);
		this.add(jp1);
		this.add(jp2);
		
		
		this.setTitle("分组");
		this.setSize(300,200);
		
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	
		
		
	}
	
	public static void main(String[] args) {
		new 窗口();
		
	}
	
}