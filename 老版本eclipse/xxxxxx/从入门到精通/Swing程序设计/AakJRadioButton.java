package Swing程序设计;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 * 单选按钮组件   JRadioButton
 * @author 123
 *
 */
public class AakJRadioButton extends JFrame{
	public AakJRadioButton(){
		setBounds(100, 100, 180, 110);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());//设置流布局
		JRadioButton p1=new JRadioButton("好");//设置选项按钮
		JRadioButton p2=new JRadioButton("坏");
		 
		ButtonGroup bg=new ButtonGroup();//将选项按钮装入按钮组
		bg.add(p1);
		bg.add(p2);
		
		p1.setSelected(true);//设置初始默认选项
		c.add(p1);
		c.add(p2);
		JButton jb=new JButton();
		jb.setText("输出");
		jb.setToolTipText("点击");//设置鼠标悬停提示
		jb.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//判断选项，输出窗口
				if (p1.isSelected()==true&&p2.isSelected()==false) {
					JOptionPane.showMessageDialog(AakJRadioButton.this, "你选中的是："+p1.getText());//弹出 提示窗口
				}else if (p1.isSelected()==false&&p2.isSelected()==true) {
					JOptionPane.showMessageDialog(AakJRadioButton.this, "你选中的是："+p2.getText());
				}else if (p1.isSelected()==false&&p2.isSelected()==false) {
					JOptionPane.showMessageDialog(AakJRadioButton.this, "你没选！");
				}
				bg.clearSelection();//按钮组清空选项
				
			}
		});
		c.add(jb);
		
		
		
		
		
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new AakJRadioButton();
	}
 
}
