package Swing�������;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * JPanel���
 * @author 123
 *
 */
public class AahJpanel extends JFrame{
	public AahJpanel(){
		setBounds(100, 100, 500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c=getContentPane();
		c.setLayout(new GridLayout(2,2,10,10));//����Ϊ�������е����񲼾�
		
		JPanel p1=new JPanel();
		p1.setLayout(new GridLayout(1,3,10,10));
		JPanel p2=new JPanel(new BorderLayout());//����Ϊ�߽粼�� 
		JPanel p3=new JPanel(new GridLayout(1,2,10,10));
		JPanel p4=new JPanel(new GridLayout(2,1,10,10));
		/*��ӱ߿�*/
		p1.setBorder(BorderFactory.createTitledBorder("���1"));//��ӱ���߿�
		p2.setBorder(BorderFactory.createTitledBorder("���2"));
		p3.setBorder(BorderFactory.createTitledBorder("���3"));
		p4.setBorder(BorderFactory.createTitledBorder("���4"));
		p1.add(new JButton("1"));
		p1.add(new JButton("2"));
		p1.add(new JButton("3"));
		p2.add(new JButton("1"),BorderLayout.NORTH);
		p2.add(new JButton("2"),BorderLayout.SOUTH);
		p2.add(new JButton("3"),BorderLayout.EAST);
		p2.add(new JButton("4"),BorderLayout.WEST);
		p2.add(new JButton("5"),BorderLayout.CENTER);
		p2.setBackground(Color.yellow);
		
		
		c.add(p1);c.add(p2);c.add(p3);c.add(p4);
		
		
		
		
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new AahJpanel();
	}

}
