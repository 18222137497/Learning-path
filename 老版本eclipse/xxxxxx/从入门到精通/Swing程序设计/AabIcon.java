package Swing�������;
/**
 * ������Ƭ
 */
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class AabIcon extends JFrame{
	public AabIcon(){
		setTitle("ssss");
		setBounds(Toolkit.getDefaultToolkit().getScreenSize().width/2-200, Toolkit.getDefaultToolkit().getScreenSize().height/2-300, 400, 600);
		setVisible(true);
		setDefaultCloseOperation(AabIcon.this.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setBackground(Color.red);
		JButton j=new JButton("һ���DƬ");
		j.setFont(new Font("����",Font.BOLD,15));
		j.setSize(100, 100);
		j.setBackground(Color.blue);
		j.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new LXB(AabIcon.this).setVisible(true);;
				
			}
		});
		c.add(j);	
		c.setLayout(new FlowLayout());
		setResizable(false);
	}
	public static void main(String[] args) {
		new AabIcon();
	}
}
class LXB extends JDialog{
    public LXB(JFrame jframe){
    	super(jframe,"�DƬ",true); 
    	setSize(639, 637);
    	Container c=getContentPane();
    	JLabel l=new JLabel("�@��һ���DƬ");
    	Icon icon=new ImageIcon("src/java.png");//Icon ImageIcon��䴫��ͼƬ
    	l.setIcon(icon);
    	l.setHorizontalAlignment(SwingConstants.CENTER);
    	c.add(l);
    	
    }
	
}
