package Swing�������;

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
 * ��ѡ��ť���   JRadioButton
 * @author 123
 *
 */
public class AakJRadioButton extends JFrame{
	public AakJRadioButton(){
		setBounds(100, 100, 180, 110);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());//����������
		JRadioButton p1=new JRadioButton("��");//����ѡ�ť
		JRadioButton p2=new JRadioButton("��");
		 
		ButtonGroup bg=new ButtonGroup();//��ѡ�ťװ�밴ť��
		bg.add(p1);
		bg.add(p2);
		
		p1.setSelected(true);//���ó�ʼĬ��ѡ��
		c.add(p1);
		c.add(p2);
		JButton jb=new JButton();
		jb.setText("���");
		jb.setToolTipText("���");//���������ͣ��ʾ
		jb.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//�ж�ѡ��������
				if (p1.isSelected()==true&&p2.isSelected()==false) {
					JOptionPane.showMessageDialog(AakJRadioButton.this, "��ѡ�е��ǣ�"+p1.getText());//���� ��ʾ����
				}else if (p1.isSelected()==false&&p2.isSelected()==true) {
					JOptionPane.showMessageDialog(AakJRadioButton.this, "��ѡ�е��ǣ�"+p2.getText());
				}else if (p1.isSelected()==false&&p2.isSelected()==false) {
					JOptionPane.showMessageDialog(AakJRadioButton.this, "��ûѡ��");
				}
				bg.clearSelection();//��ť�����ѡ��
				
			}
		});
		c.add(jb);
		
		
		
		
		
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new AakJRadioButton();
	}
 
}
