package ���ڳ���;

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

public class ��¼���� extends JFrame{
	private String arr="252587065";
	private String arr1="13512851948";
	public ��¼����(){
		setSize(500, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(null);
		JLabel jl=new JLabel("�û���:");
		jl.setBounds(160, 100, 50, 20);
		c.add(jl);
		JLabel jl1=new JLabel("����:");
		jl1.setBounds(160, 130, 50, 20);
		c.add(jl1);
		JTextField jt=new JTextField();//�û����ı���
		jt.setBounds(210, 100, 100, 20);
		c.add(jt);
		JPasswordField jp=new JPasswordField();//�����
		jp.setBounds(210, 130, 100, 20);
		c.add(jp);
		JButton jb=new JButton("��¼");
		jb.setBounds(170, 170, 60, 30);
		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char[] a=jp.getPassword();//������������
				String c=new String();
				for (char d : a) {
					c+=d;
				}
				if (jt.getText().equals(arr)&&c.equals(arr1)) {
					JOptionPane.showMessageDialog(��¼����.this, "��¼�ɹ���");
				}else{
					JOptionPane.showMessageDialog(��¼����.this, "�û��������벻��ȷ��");
				}
				
				
			}
		});
		c.add(jb);
		JButton jb1=new JButton("����");
		jb1.setBounds(250, 170, 60, 30);
		jb1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				jt.setText("");
				jp.setText("");
				
			}
		});
		c.add(jb1);
		
		
		setResizable(false);//���ô��ڴ�С���ɱ�
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new ��¼����();
	}


}
