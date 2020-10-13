package Swing程序设计;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

/**
 * 列表框组件  JList
 * @author 123
 *
 */
public class AaoJList extends JFrame{
	public AaoJList(){
		setBounds(100, 100, 300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(null);
		
		String items[]={"元素1","元素2","元素3","元素4","元素5","元素6","元素7","元素8","元素9","元素10"};
		DefaultListModel<String> model=new DefaultListModel<>();//创建列表框模型
		for (String tmp : items) {
			model.addElement(tmp);//向数据模型添加元素
		}
		JList<String> jl=new JList<>();//创建列表框组件
		model.addElement("外加元素");
		jl.setModel(model);//列表载入数据模型
		/*
		 * MULTIPLE_INTERVAL_SELECTION 随便选
		 * SINGLE_INTERVAL_SELECTION   只能选相邻的
		 * SINGLE_SELECTION            单选
		 * 
		 */
		jl.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);//设置选择模式
		JScrollPane js=new JScrollPane(jl);//添加滚动条
		js.setBounds(10, 10, 100, 100);//设置位置以及大小  注：大小位置要设在滚动条上，之前列表框组件载入滚动条之后不必设置位置，位置跟随滚动条位置改变
		JButton jb=new JButton("确认");
		jb.setBounds(120, 90, 70, 25);
		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//获取列表框中的所有元素
				java.util.List<String> values=jl.getSelectedValuesList();
				for (String tmp : values) {
					System.out.println(tmp);
				}
				System.out.println("---------end----------");
				
			}
		});
		c.add(js);
		c.add(jb);
		
		
		setVisible(true);
	}
	public static void main(String[] args){
		new AaoJList();
	}

}
