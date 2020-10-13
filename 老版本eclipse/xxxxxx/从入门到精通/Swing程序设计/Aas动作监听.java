package Swing程序设计;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.naming.StringRefAddr;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
/**
 * 动作监听
 * @author 123
 *
 */
public class Aas动作监听 extends JFrame{
	public Aas动作监听(){
		setBounds(100, 100, 400, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		JLabel jl=new JLabel("标签");
		JButton jb=new JButton("按钮");
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jl.setText("按钮被点击了");
			}
		});
		JTextField jt=new JTextField(20);
		jt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Object obj=e.getSource();//e.getSource() 返回Object的值
				JTextField ja=(JTextField)obj;//强转成文本框
				jl.setText(ja.getText());//获得文本框的值
				
			}
		});
		JCheckBox jc=new JCheckBox("复选框");
		jc.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jl.setText("复选框被选择了");
				
			}
		});
		JRadioButton jr=new JRadioButton("单选框");
		jr.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jl.setText("单选框被选择了");
				
			}
		});
		String[] arr={"1","2","3"};
		JComboBox<String> jx=new JComboBox(arr);
		jx.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jl.setText("下拉框被选择了");
				
			}
		});
		c.add(jb);
		c.add(jt);
		c.add(jc);
		c.add(jr);
		c.add(jx);
		c.add(jl);
		
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new Aas动作监听();
	}
}
