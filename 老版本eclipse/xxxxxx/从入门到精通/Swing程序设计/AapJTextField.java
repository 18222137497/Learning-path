package Swing�������;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 * �ı��� JTextField
 * @author 123
 *
 */
public class AapJTextField extends JFrame{
	public AapJTextField(){
		setBounds(100, 100, 400,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());//����������
		JTextField jf=new JTextField();//�����ı���
		jf.setText("������ֵ");
		jf.setColumns(20);//���ı���һ�����ȣ������20���ַ�����
		c.add(jf);
		JButton jb=new JButton("���");
		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(AapJTextField.this, "������ǣ�"+jf.getText());
				jf.setText("");//����ı���
				jf.requestFocus();	//���㷵���ı���
			}
		});
		c.add(jb);
		setVisible(true);
	}
	public static void main(String[] args) {
		new AapJTextField();
	}

}
