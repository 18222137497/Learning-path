package xxxxx;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ���� extends JFrame{
	public ����(){
		JPanel jp,jp1,jp2;
		JLabel jl1,jl2;
		JTextField jtf1;//JTextArea�Ƕ����ı�����
		JPasswordField jpf1;
		JButton jd1,jd2,jd3,jd4,jd5;
		this.setLayout(new GridLayout(3,1));
		jp1=new JPanel();
		jp2=new JPanel();
		jp =new JPanel();
		//���ñ�ǩ
		jl1=new JLabel("�û���");
		jl2=new JLabel("����");
		//�����ı���������
		jtf1=new JTextField(10);
		jpf1=new JPasswordField(10);
		//���ð�ť
		jd1=new JButton("��½");
		jd2=new JButton("ȡ��");
		jp.add(jl1);
		jp.add(jtf1);
		
		jp1.add(jl2);
		jp1.add(jpf1);
		
		jp2.add(jd1);
		jp2.add(jd2);
		
		this.add(jp);
		this.add(jp1);
		this.add(jp2);
		
		
		this.setTitle("����");
		this.setSize(300,200);
		
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	
		
		
	}
	
	public static void main(String[] args) {
		new ����();
		
	}
	
}