package Swing�������;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 * ������ JComboBox
 * @author 123
 *
 */
public class AamJComboBox extends JFrame{
	public AamJComboBox(){
		setBounds(100, 100, 400, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(null);
		String[] arr={"��ѧ","����","Ӣ��"}; 
		JComboBox<String> combobox=new JComboBox<>(arr);
		combobox.setBounds(10, 10, 80, 50);
		c.add(combobox);
		JButton j=new JButton("���");
		j.setBounds(100, 10, 60, 40);
		j.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(AamJComboBox.this, "ѡ�е������ǣ�"+combobox.getSelectedIndex()+"\nѡ�е�ֵΪ��"+combobox.getSelectedItem());
			}
		});
		c.add(j);
		setVisible(true);
	}
	public static void main(String[] args) {
		new AamJComboBox();
	}

}
