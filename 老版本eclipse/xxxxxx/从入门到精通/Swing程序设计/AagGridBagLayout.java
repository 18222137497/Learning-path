package Swing程序设计;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 网络组布局管理器
 * @author 123
 *
 */
public class AagGridBagLayout{
	JFrame f=new JFrame();
	Container c;
	void createFrame(){
		c=f.getContentPane();
		c.setLayout(new GridBagLayout());
		f.setSize(800, 600);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	void init(){//网格组布局设置位置
		GridBagConstraints g1=new GridBagConstraints();
		g1.gridx=1;
		g1.gridx=1;
		c.add(new JButton("组件1"),g1);
		GridBagConstraints g2=new GridBagConstraints();
		g2.gridx=2;
		g2.gridy=2;
		c.add(new JButton("组件2"),g2);
		GridBagConstraints g3=new GridBagConstraints();
		g3.gridx=3;
		g3.gridy=3;
		c.add(new JButton("组件3"),g3);
	}
	void createButton(){
		for (int i = 0; i < 9; i++) {
			GridBagConstraints g1=new GridBagConstraints();
			g1.gridx=i;
			g1.gridy=0;
			c.add(new JButton("组件"),g1);
			GridBagConstraints g2=new GridBagConstraints();
			g2.gridx=0;
			g2.gridy=i;
			c.add(new JButton("组件"),g2);
		}
	}
	void init2(){//网格组布局设置位置以及每个按钮所占宽高
		GridBagConstraints g1=new GridBagConstraints();
		g1.gridx=1;
		g1.gridx=1;
		c.add(new JButton("组件1"),g1);
		GridBagConstraints g2=new GridBagConstraints();
		g2.gridx=2;
		g2.gridy=2;
		g2.gridwidth=2;//宽
		g2.gridheight=1;//高
		c.add(new JButton("组件2"),g2);
		GridBagConstraints g3=new GridBagConstraints();
		g3.gridx=4;
		g3.gridy=4;
		g3.gridwidth=2;
		g3.gridheight=2;
		c.add(new JButton("组件3"),g3);
		
	}
	void init3(){//网格组布局色设置填充方式，水平，竖直填充，全填充

		GridBagConstraints g1=new GridBagConstraints();
		g1.gridx=1;
		g1.gridx=1;
		g1.gridwidth=2;
		g1.gridheight=2;
		c.add(new JButton("none"),g1);
		GridBagConstraints g2=new GridBagConstraints();
		g2.gridx=3;
		g2.gridy=1;
		g2.gridwidth=2;
		g2.gridheight=2;
		g2.fill=GridBagConstraints.HORIZONTAL;//水平填充
		c.add(new JButton("HORIZONTAL"),g2);
		GridBagConstraints g3=new GridBagConstraints();
		g3.gridx=5;
		g3.gridy=1;
		g3.gridwidth=2;
		g3.gridheight=2;
		g3.fill=GridBagConstraints.VERTICAL;//竖直填充
		c.add(new JButton("VERTICAL"),g3);
		GridBagConstraints g4=new GridBagConstraints();
		g4.gridx=7;
		g4.gridy=1;
		g4.gridwidth=2;
		g4.gridheight=2;
		g4.fill=GridBagConstraints.BOTH;//全填充
		c.add(new JButton("BOTH"),g4);
	}
	void init4() {//按钮在所在范围内的位置
		GridBagConstraints g1=new GridBagConstraints();
		g1.gridx=1;
		g1.gridy=1;
		g1.gridwidth=2;
		g1.gridheight=2;
		g1.anchor=GridBagConstraints.NORTH;//靠北
		c.add(new JButton("北"),g1);
		g1.fill=GridBagConstraints.BOTH;
		g1.anchor=GridBagConstraints.CENTER;
		JPanel p=new JPanel();
		p.setBackground(Color.green);
		c.add(p,g1);
	}
	void init5(){//按钮距离上下左右界限的距离
		GridBagConstraints g1=new GridBagConstraints();
		g1.gridx=1;
		g1.gridy=1;
		g1.gridwidth=1;
		g1.gridheight=1;
		g1.insets=new Insets(5, 5, 5, 10);//上左下右
		c.add(new JButton("北"),g1);
		
	}
	void init6(){//按钮放大和缩小
		GridBagConstraints g1=new GridBagConstraints();
		g1.gridx=2;
		g1.gridy=2;
		g1.ipadx=10;//正数放大
		g1.ipady=10;
		c.add(new JButton("@"),g1);
		GridBagConstraints g2=new GridBagConstraints();
		g2.gridx=4;
		g2.gridy=2;
		g1.ipadx=-10;//负数缩小
		g1.ipady=-10;
		c.add(new JButton("@"),g2);
	}
	void init7(){//按钮最大的放大程度
		GridBagConstraints g1=new GridBagConstraints();
		g1.gridx=2;
		g1.gridy=2;
		g1.weightx=10;//宽
		g1.weighty=10;//高
		c.add(new JButton("@"),g1);
		
	}
	
	public static void main(String[] args) {
		AagGridBagLayout j=new AagGridBagLayout();
		j.createFrame();
		j.createButton();
		j.init4();
		j.f.setVisible(true);
	}

}
