package Swing�������;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * �������
 * @author 123
 *
 */
public class Aat������� extends JFrame{
	public Aat�������(){
		setBounds(100, 100, 400, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(null);
		JTextField jt1=new JTextField(10);
		jt1.setBounds(10, 10, 66, 21);
		JTextField jt2=new JTextField(10);
		jt2.setBounds(10, 41, 66, 21);
		JTextField jt3=new JTextField(10);
		jt3.setBounds(10, 72, 66, 21);
//		JLabel jl1=new JLabel("δ��ý���");
//		jl1.setBounds(86, 13, 100, 15);
//		JLabel jl2=new JLabel("δ��ý���");
//		jl2.setBounds(86, 44, 100, 15);
//		JLabel jl3=new JLabel("δ��ý���");
//		jl3.setBounds(86, 75, 100, 15);
		jt1.addFocusListener(new MyFocusListener());
		jt2.addFocusListener(new MyFocusListener());
		jt3.addFocusListener(new MyFocusListener());
		
		c.add(jt1);c.add(jt2);c.add(jt3);
		setVisible(true);
	}
	class MyFocusListener implements FocusListener{//�����ڲ���ʵ��FocusListener�ӿ�

		@Override
		public void focusGained(FocusEvent e) {
			JTextField jt=(JTextField)e.getSource();//��ô��������
			jt.setBorder(BorderFactory.createLineBorder(Color.green));//��ý��������߿�����ɫ
			
		}

		@Override
		public void focusLost(FocusEvent e) {
			JTextField jt=(JTextField)e.getSource();//��ô��������
			jt.setBorder(BorderFactory.createLineBorder(Color.red));//ʧȥ����ı߿��ɺ�ɫ
			
		}
		
	}
	
	public static void main(String[] args) {
		new Aat�������();
	}
}
