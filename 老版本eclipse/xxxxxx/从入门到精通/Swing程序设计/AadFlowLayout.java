package Swing程序设计;
/**
 * 流佈局
 * @author WJ
 *
 */
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;


public class AadFlowLayout extends JFrame{
	public AadFlowLayout(){
		setBounds(100, 100, 300, 200);
		Container c=getContentPane();
		c.setLayout(new  FlowLayout(3,20,20));
		//流佈局,默認爲劇中,第一個參數是對其方式1為中，2為右對齊，3為左對齊，後面兩個參數是間距
		for (int i = 0; i < 10; i++) {
			c.add(new JButton("按鈕"+i));
		}
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new AadFlowLayout();
	}

}
