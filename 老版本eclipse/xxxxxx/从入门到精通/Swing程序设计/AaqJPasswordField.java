package Swing�������;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPasswordField;

/**
 * ����� JPasswordField
 * @author 123
 *
 */
public class AaqJPasswordField extends JFrame{
	public AaqJPasswordField(){
		setBounds(100, 100, 400, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		JPasswordField jp=new JPasswordField();//���������
		jp.setColumns(20);//����������С��20���ַ�
		jp.setEchoChar('*');//���û����ַ�
		jp.addActionListener(new ActionListener() {       //�����¼��������س�
			public void actionPerformed(ActionEvent e) {
				char[] cr=jp.getPassword();//���������ÿ�����ݷֱ����ַ�������
				String arr=new String(cr);//���ַ�����ϲ����ַ���
				System.out.println(arr);//����ַ���
			}
		});
		c.add(jp);
	
		
		
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new AaqJPasswordField();
	}
	
}
