package Swing�������;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * ��ѡ�� JCheckBox
 * @author 123
 *
 */
public class AalJCheckBox extends JFrame{
	public AalJCheckBox(){
		setBounds(100, 100, 400, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		JCheckBox c1=new JCheckBox("��ѧ");
		JCheckBox c2=new JCheckBox("����");
		JCheckBox c3=new JCheckBox("Ӣ��");
		c.add(c1);
		c.add(c2);
		c.add(c3);
		JButton j=new JButton("���");
		j.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(AalJCheckBox.this,"��ϲ����ѧ��?		"
			                                  +c1.isSelected()+"\n��ϲ��������		"
						                      +c2.isSelected()+"\n��ϲ��Ӣ����		"
			                                  +c3.isSelected());
			}
		});
		c.add(j);
		setVisible(true);
	}
	public static void main(String args[]){
		new AalJCheckBox();
	}

}
