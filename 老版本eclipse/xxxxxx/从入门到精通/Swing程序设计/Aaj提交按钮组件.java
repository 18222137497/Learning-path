package Swing�������;

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
 * �ύ��ť��� 
 * @author 123
 *
 */
public class Aaj�ύ��ť��� extends JFrame{
	public Aaj�ύ��ť���(){
		setBounds(100, 100, 400, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new GridLayout(3,2));//�������񲼾�3������
		JButton jb[]=new JButton[6];
		for (int i = 0; i < jb.length; i++) {
			jb[i]=new JButton();
			c.add(jb[i]);
		}
		jb[0].setText("������");//���ô˰�ť���ⲿ����
		jb[0].setEnabled(false);//���ð�ťΪ���ɵ�ģʽ
		
		jb[1].setText("�б���ɫ");
		jb[1].setBackground(Color.yellow);//���ô��ڱ�����ɫ
		
		jb[2].setText("�ޱ߿�");
		jb[2].setBorderPainted(false);//���ô����ޱ߿�
		
		jb[3].setText("�б߿�");
		jb[3].setBorder(BorderFactory.createLineBorder(Color.blue));//���ô��ڱ߿���ɫ
		
		Icon icon=new ImageIcon("src/java.jpg");//��ȡͼƬ
		jb[4].setText("��ͼƬ");
		jb[4].setIcon(icon);//����ť����ͼƬ
		
		jb[5].setText("��Ӱ�ť����");
		jb[5].setToolTipText("���д���");//���������ͣ��ʾ   !
		jb[5].addActionListener(new ActionListener() {//����¼�����
			public void actionPerformed(ActionEvent e) {//���������ķ���
				JOptionPane.showMessageDialog(Aaj�ύ��ť���.this, "�����ť");//����С�Ի���
				
			}
			
		});
		
		
		
		
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new Aaj�ύ��ť���();
	}

}
