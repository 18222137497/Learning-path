package Swing�������;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.naming.StringRefAddr;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
/**
 * ��������
 * @author 123
 *
 */
public class Aas�������� extends JFrame{
	public Aas��������(){
		setBounds(100, 100, 400, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		JLabel jl=new JLabel("��ǩ");
		JButton jb=new JButton("��ť");
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jl.setText("��ť�������");
			}
		});
		JTextField jt=new JTextField(20);
		jt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Object obj=e.getSource();//e.getSource() ����Object��ֵ
				JTextField ja=(JTextField)obj;//ǿת���ı���
				jl.setText(ja.getText());//����ı����ֵ
				
			}
		});
		JCheckBox jc=new JCheckBox("��ѡ��");
		jc.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jl.setText("��ѡ��ѡ����");
				
			}
		});
		JRadioButton jr=new JRadioButton("��ѡ��");
		jr.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jl.setText("��ѡ��ѡ����");
				
			}
		});
		String[] arr={"1","2","3"};
		JComboBox<String> jx=new JComboBox(arr);
		jx.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jl.setText("������ѡ����");
				
			}
		});
		c.add(jb);
		c.add(jt);
		c.add(jc);
		c.add(jr);
		c.add(jx);
		c.add(jl);
		
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new Aas��������();
	}
}
