package Swing�������;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
/**
 * JScrollPane��壨������壩   JScrollPane
 * @author 123
 *
 */


public class AaiJScrollPane extends JFrame{
	public AaiJScrollPane(){
		setBounds(100, 100, 500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new GridLayout());
		
		
		JTextArea area=new JTextArea();//����ı���             !  !  !  !  !  !  !  !  !
		
		
		
		JScrollPane sp=new JScrollPane(area);//�������������ı�����ӹ�����
		c.add(sp);//��ӹ������     ������������������
		//���ﲻ���������ˣ�����Ѿ���ӵ�JScrollOane��
		
		
		
		
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new AaiJScrollPane();
	}

}
