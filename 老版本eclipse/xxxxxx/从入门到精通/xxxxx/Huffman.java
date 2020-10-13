package xxxxx;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Huffman extends JFrame {
	public Huffman() {

		setTitle("哈夫曼编码器");
		setBounds(100, 100, 600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);

		JLabel jl = new JLabel("请输入字符个数：");
		jl.setBounds(10, 10, 120, 30);

		JLabel jl1 = new JLabel("请输入编码字符：");
		jl1.setBounds(10, 40, 120, 30);

		JLabel arr = new JLabel("");
		c.add(arr);

		JTextField jt = new JTextField("");
		jt.setBounds(120, 10, 160, 30);
		jt.addFocusListener(new FocusListener() {
			public void focusLost(FocusEvent e) {
				Object obj = e.getSource();
				JTextField jtt = (JTextField) obj;
				try {
					Integer.parseInt(jtt.getText());
					arr.setText("✔");

				} catch (Exception e2) {
					arr.setText("输入的不是整形数字");
				}
			}

			public void focusGained(FocusEvent e) {
				arr.setText("内容格式为：");
				arr.setBounds(300, 10, 160, 30);

			}
		});
		jt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object obj = e.getSource();
				JTextField jtt = (JTextField) obj;
				try {
					Integer.parseInt(jtt.getText());
					arr.setText("✔");

				} catch (Exception e2) {
					arr.setText("输入的不是整形数字");
				}

			}
		});

		JLabel arr1 = new JLabel("");
		c.add(arr1);

		JTextField jt1 = new JTextField();
		jt1.setBounds(120, 40, 160, 30);
		jt1.addFocusListener(new FocusListener() {
			public void focusLost(FocusEvent e) {
				Object obj = e.getSource();
				JTextField jtt = (JTextField) obj;
				try {
					Integer.parseInt(jtt.getText());
					arr1.setText("✔");

				} catch (Exception e2) {
					arr1.setText("输入的不是整形数字");
				}
			}

			public void focusGained(FocusEvent e) {
				arr1.setText("内容格式为：");
				arr1.setBounds(300, 40, 160, 30);
			}
		});
		jt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object obj = e.getSource();
				JTextField jtt = (JTextField) obj;
				try {
					Integer.parseInt(jtt.getText());
					arr1.setText("✔");

				} catch (Exception e2) {
					arr1.setText("输入的不是整形数字");
				}

			}
		});
		c.add(jt1);
		JLabel arr3 = new JLabel();
		arr3.setText("内容格式为：");
		JTextField jt3 = new JTextField("");
		jt3.setBounds(120, 70, 160, 30);
		jt3.addFocusListener(new FocusListener() {
			public void focusLost(FocusEvent e) {
				Object obj = e.getSource();
				JTextField jtt = (JTextField) obj;
				try {
					Integer.parseInt(jtt.getText());
					arr3.setText("✔");

				} catch (Exception e2) {
					arr3.setText("输入的不是整形数字");
				}

			}

			@Override
			public void focusGained(FocusEvent e) {
				arr3.setText("内容格式为：");
				arr3.setBounds(300, 70, 160, 30);

			}
		});
		jt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object obj = e.getSource();
				JTextField jtt = (JTextField) obj;
				try {
					Integer.parseInt(jtt.getText());
					arr3.setText("✔");

				} catch (Exception e2) {
					arr3.setText("输入的不是整形数字");
				}

			}
		});
		c.add(jt3);
		c.add(arr3);

		JLabel jl2 = new JLabel("请输入对应频数：");
		jl2.setBounds(10, 70, 120, 30);

		JButton jb = new JButton("编码");
		jb.setBounds(120, 120, 80, 80);
		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(Huffman.this, "字符与编码的关系如下：");

			}
		});

		c.add(jl);
		c.add(jt);
		c.add(jl1);
		c.add(jl2);
		c.add(jb);
		setVisible(true);
	}

	// 主函数
	public static void main(String[] args) {
		new Huffman();

	}
}
