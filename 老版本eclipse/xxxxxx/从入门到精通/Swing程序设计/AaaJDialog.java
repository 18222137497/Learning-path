package Swing程序设计;
/**
 * JDialog類的使用
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
		setTitle("父窗體");
		setVisible(true);
		setBounds(Toolkit.getDefaultToolkit().getScreenSize().width/2-200, Toolkit.getDefaultToolkit().getScreenSize().height/2-300, 400, 600);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Container c=getContentPane();//設置窗體容器 
	    c.setBackground(Color.white);
	    JButton l=new JButton("彈出對話框");
	    l.setFont(new Font("楷体",Font.BOLD,15));
	    l.setForeground(Color.blue);
//	    l.setBackground(Color.blue);
	    l.addActionListener(new ActionListener() {//設置按鈕點擊后執行内容
			@Override
			public void actionPerformed(ActionEvent e) {
				new Demo3(AaaJDialog.this).setVisible(true);;
				
			}
		});
	    JButton b=new JButton("彈出大對話框");
	    b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			    new Demo2(AaaJDialog.this).setVisible(true);;
				
			}
		});
	    c.setLayout(new FlowLayout());//設置佈局，使用流佈局
	    c.add(l);
	    c.add(b);
	    c.validate();//驗證容器中的組件
	    setResizable(false);//設置窗體是否可以改變     !!!!
	    
	}
	public static void main(String[] args) {
		new AaaJDialog();
	}
	
}
class Demo3 extends JDialog{
	
	public Demo3(JFrame jframe){
		super(jframe, "小對話框", true);
		
		Container c=getContentPane();
		JLabel l= new JLabel("第一對話框");
		l.setHorizontalAlignment(SwingConstants.CENTER);//文字居中   ！！！！！！！
		c.add(l);
		setBounds(500, 500, 100, 100);
		
		
	}
}
class Demo2 extends JDialog{
	
	public Demo2(JFrame jframe){
		super(jframe, "大對話框", true);
		Container c=getContentPane();
		JLabel l=new JLabel("大對話框");
		l.setHorizontalAlignment(SwingConstants.CENTER);
		c.add(l);
		setBounds(500, 500, 200, 200);
	}
}






	

	
