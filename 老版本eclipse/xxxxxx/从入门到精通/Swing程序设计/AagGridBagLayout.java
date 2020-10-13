package Swing�������;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * �����鲼�ֹ�����
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
	void init(){//�����鲼������λ��
		GridBagConstraints g1=new GridBagConstraints();
		g1.gridx=1;
		g1.gridx=1;
		c.add(new JButton("���1"),g1);
		GridBagConstraints g2=new GridBagConstraints();
		g2.gridx=2;
		g2.gridy=2;
		c.add(new JButton("���2"),g2);
		GridBagConstraints g3=new GridBagConstraints();
		g3.gridx=3;
		g3.gridy=3;
		c.add(new JButton("���3"),g3);
	}
	void createButton(){
		for (int i = 0; i < 9; i++) {
			GridBagConstraints g1=new GridBagConstraints();
			g1.gridx=i;
			g1.gridy=0;
			c.add(new JButton("���"),g1);
			GridBagConstraints g2=new GridBagConstraints();
			g2.gridx=0;
			g2.gridy=i;
			c.add(new JButton("���"),g2);
		}
	}
	void init2(){//�����鲼������λ���Լ�ÿ����ť��ռ���
		GridBagConstraints g1=new GridBagConstraints();
		g1.gridx=1;
		g1.gridx=1;
		c.add(new JButton("���1"),g1);
		GridBagConstraints g2=new GridBagConstraints();
		g2.gridx=2;
		g2.gridy=2;
		g2.gridwidth=2;//��
		g2.gridheight=1;//��
		c.add(new JButton("���2"),g2);
		GridBagConstraints g3=new GridBagConstraints();
		g3.gridx=4;
		g3.gridy=4;
		g3.gridwidth=2;
		g3.gridheight=2;
		c.add(new JButton("���3"),g3);
		
	}
	void init3(){//�����鲼��ɫ������䷽ʽ��ˮƽ����ֱ��䣬ȫ���

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
		g2.fill=GridBagConstraints.HORIZONTAL;//ˮƽ���
		c.add(new JButton("HORIZONTAL"),g2);
		GridBagConstraints g3=new GridBagConstraints();
		g3.gridx=5;
		g3.gridy=1;
		g3.gridwidth=2;
		g3.gridheight=2;
		g3.fill=GridBagConstraints.VERTICAL;//��ֱ���
		c.add(new JButton("VERTICAL"),g3);
		GridBagConstraints g4=new GridBagConstraints();
		g4.gridx=7;
		g4.gridy=1;
		g4.gridwidth=2;
		g4.gridheight=2;
		g4.fill=GridBagConstraints.BOTH;//ȫ���
		c.add(new JButton("BOTH"),g4);
	}
	void init4() {//��ť�����ڷ�Χ�ڵ�λ��
		GridBagConstraints g1=new GridBagConstraints();
		g1.gridx=1;
		g1.gridy=1;
		g1.gridwidth=2;
		g1.gridheight=2;
		g1.anchor=GridBagConstraints.NORTH;//����
		c.add(new JButton("��"),g1);
		g1.fill=GridBagConstraints.BOTH;
		g1.anchor=GridBagConstraints.CENTER;
		JPanel p=new JPanel();
		p.setBackground(Color.green);
		c.add(p,g1);
	}
	void init5(){//��ť�����������ҽ��޵ľ���
		GridBagConstraints g1=new GridBagConstraints();
		g1.gridx=1;
		g1.gridy=1;
		g1.gridwidth=1;
		g1.gridheight=1;
		g1.insets=new Insets(5, 5, 5, 10);//��������
		c.add(new JButton("��"),g1);
		
	}
	void init6(){//��ť�Ŵ����С
		GridBagConstraints g1=new GridBagConstraints();
		g1.gridx=2;
		g1.gridy=2;
		g1.ipadx=10;//�����Ŵ�
		g1.ipady=10;
		c.add(new JButton("@"),g1);
		GridBagConstraints g2=new GridBagConstraints();
		g2.gridx=4;
		g2.gridy=2;
		g1.ipadx=-10;//������С
		g1.ipady=-10;
		c.add(new JButton("@"),g2);
	}
	void init7(){//��ť���ķŴ�̶�
		GridBagConstraints g1=new GridBagConstraints();
		g1.gridx=2;
		g1.gridy=2;
		g1.weightx=10;//��
		g1.weighty=10;//��
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
