package Swing�������;
/**
 * JDialog�ʹ��
 */
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class AaaJDialog extends JFrame{
	public AaaJDialog(){
		setTitle("�����w");
		setVisible(true);
		setBounds(Toolkit.getDefaultToolkit().getScreenSize().width/2-200, Toolkit.getDefaultToolkit().getScreenSize().height/2-300, 400, 600);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Container c=getContentPane();//�O�ô��w���� 
	    c.setBackground(Color.white);
	    JButton l=new JButton("������Ԓ��");
	    l.setFont(new Font("����",Font.BOLD,15));
	    l.setForeground(Color.blue);
//	    l.setBackground(Color.blue);
	    l.addActionListener(new ActionListener() {//�O�ð��o�c�����������
			@Override
			public void actionPerformed(ActionEvent e) {
				new Demo3(AaaJDialog.this).setVisible(true);;
				
			}
		});
	    JButton b=new JButton("������Ԓ��");
	    b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			    new Demo2(AaaJDialog.this).setVisible(true);;
				
			}
		});
	    c.setLayout(new FlowLayout());//�O�ÁѾ֣�ʹ�����Ѿ�
	    c.add(l);
	    c.add(b);
	    c.validate();//��C�����еĽM��
	    setResizable(false);//�O�ô��w�Ƿ���Ը�׃     !!!!
	    
	}
	public static void main(String[] args) {
		new AaaJDialog();
	}
	
}
class Demo3 extends JDialog{
	
	public Demo3(JFrame jframe){
		super(jframe, "С��Ԓ��", true);
		
		Container c=getContentPane();
		JLabel l= new JLabel("��һ��Ԓ��");
		l.setHorizontalAlignment(SwingConstants.CENTER);//���־���   ��������������
		c.add(l);
		setBounds(500, 500, 100, 100);
		
		
	}
}
class Demo2 extends JDialog{
	
	public Demo2(JFrame jframe){
		super(jframe, "��Ԓ��", true);
		Container c=getContentPane();
		JLabel l=new JLabel("��Ԓ��");
		l.setHorizontalAlignment(SwingConstants.CENTER);
		c.add(l);
		setBounds(500, 500, 200, 200);
	}
}






	

	
