package Swing程序设计;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
/**
 * JScrollPane面板（滚动面板）   JScrollPane
 * @author 123
 *
 */


public class AaiJScrollPane extends JFrame{
	public AaiJScrollPane(){
		setBounds(100, 100, 500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new GridLayout());
		
		
		JTextArea area=new JTextArea();//添加文本域             !  !  !  !  !  !  !  !  !
		
		
		
		JScrollPane sp=new JScrollPane(area);//创建滚动面板给文本域添加滚动条
		c.add(sp);//添加滚动面板     ！！！！！！！！！
		//这里不是添加组件了，组件已经添加到JScrollOane中
		
		
		
		
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new AaiJScrollPane();
	}

}
