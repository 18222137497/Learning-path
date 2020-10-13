package Swing程序设计;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * 提交按钮组件 
 * @author 123
 *
 */
public class Aaj提交按钮组件 extends JFrame{
	public Aaj提交按钮组件(){
		setBounds(100, 100, 400, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new GridLayout(3,2));//设置网格布局3行两列
		JButton jb[]=new JButton[6];
		for (int i = 0; i < jb.length; i++) {
			jb[i]=new JButton();
			c.add(jb[i]);
		}
		jb[0].setText("不可用");//设置此按钮的外部名字
		jb[0].setEnabled(false);//设置按钮为不可点模式
		
		jb[1].setText("有背景色");
		jb[1].setBackground(Color.yellow);//设置窗口背景颜色
		
		jb[2].setText("无边框");
		jb[2].setBorderPainted(false);//设置窗口无边框
		
		jb[3].setText("有边框");
		jb[3].setBorder(BorderFactory.createLineBorder(Color.blue));//设置窗口边框颜色
		
		Icon icon=new ImageIcon("src/java.jpg");//获取图片
		jb[4].setText("有图片");
		jb[4].setIcon(icon);//给按钮设置图片
		
		jb[5].setText("添加按钮内容");
		jb[5].setToolTipText("内有窗口");//设置鼠标悬停提示   !
		jb[5].addActionListener(new ActionListener() {//添加事件监听
			public void actionPerformed(ActionEvent e) {//监听触发的方法
				JOptionPane.showMessageDialog(Aaj提交按钮组件.this, "点击按钮");//弹出小对话框
				
			}
			
		});
		
		
		
		
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new Aaj提交按钮组件();
	}

}
