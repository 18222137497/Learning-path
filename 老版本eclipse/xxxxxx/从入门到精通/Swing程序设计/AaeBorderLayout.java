package Swing�������;
/**
 * �߽粼��
 */
import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

public class AaeBorderLayout extends JFrame{
	public AaeBorderLayout(){
		setBounds(100, 100, 350, 200);
		Container c=getContentPane();
		c.setLayout(new BorderLayout());//���ñ߽粼��
		JButton b1=new  JButton("��");
		JButton b2=new  JButton("��");
		JButton b3=new  JButton("��");
		JButton b4=new  JButton("��");
		JButton b5=new  JButton("��");
		c.add(b1,BorderLayout.CENTER);//�в���Ӱ�ť
		c.add(b2,BorderLayout.EAST);//������Ӱ�ť
		c.add(b3,BorderLayout.WEST);//������Ӱ�ť
		c.add(b4,BorderLayout.SOUTH);//�ϲ���Ӱ�ť
		c.add(b5,BorderLayout.NORTH);//������Ӱ�ť
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true); 

	}
	public static void main(String[] args) {
		new AaeBorderLayout();
	}

}
