package Swing程序设计;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * 文本域组件 JTextArea
 * @author 123
 *
 */
public class AarJTextArea extends JFrame{
	public AarJTextArea(){
		setBounds(100, 100, 400, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		JTextArea ja=new JTextArea();//创建文本域
		ja.setText("这是一个文本域");
		ja.append("\n添加的内容");//在已有字符末尾添加内容
		ja.setRows(5);//设置行数，5个字符长度
		ja.setColumns(20);//设置列数，20个字符长度
		ja.insert("插入", 2);//在第3个字符位置插入内容
		JScrollPane jp=new JScrollPane(ja);//加入滚动面板
		c.add(jp);
		setVisible(true);
	}
	public static void main(String[] args) {
		new AarJTextArea();
	}
}
