package Swing�������;
/**
 * ���Ѿ�
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
		//���Ѿ�,Ĭ�J������,��һ�������ǌ��䷽ʽ1���У�2���Ҍ��R��3�����R������ɂ��������g��
		for (int i = 0; i < 10; i++) {
			c.add(new JButton("���o"+i));
		}
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new AadFlowLayout();
	}

}
