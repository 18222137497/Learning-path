package Swing�������;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * �ı������ JTextArea
 * @author 123
 *
 */
public class AarJTextArea extends JFrame{
	public AarJTextArea(){
		setBounds(100, 100, 400, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		JTextArea ja=new JTextArea();//�����ı���
		ja.setText("����һ���ı���");
		ja.append("\n��ӵ�����");//�������ַ�ĩβ�������
		ja.setRows(5);//����������5���ַ�����
		ja.setColumns(20);//����������20���ַ�����
		ja.insert("����", 2);//�ڵ�3���ַ�λ�ò�������
		JScrollPane jp=new JScrollPane(ja);//����������
		c.add(jp);
		setVisible(true);
	}
	public static void main(String[] args) {
		new AarJTextArea();
	}
}
