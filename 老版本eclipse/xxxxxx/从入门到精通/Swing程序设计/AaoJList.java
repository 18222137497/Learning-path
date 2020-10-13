package Swing�������;

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
 * �б�����  JList
 * @author 123
 *
 */
public class AaoJList extends JFrame{
	public AaoJList(){
		setBounds(100, 100, 300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(null);
		
		String items[]={"Ԫ��1","Ԫ��2","Ԫ��3","Ԫ��4","Ԫ��5","Ԫ��6","Ԫ��7","Ԫ��8","Ԫ��9","Ԫ��10"};
		DefaultListModel<String> model=new DefaultListModel<>();//�����б��ģ��
		for (String tmp : items) {
			model.addElement(tmp);//������ģ�����Ԫ��
		}
		JList<String> jl=new JList<>();//�����б�����
		model.addElement("���Ԫ��");
		jl.setModel(model);//�б���������ģ��
		/*
		 * MULTIPLE_INTERVAL_SELECTION ���ѡ
		 * SINGLE_INTERVAL_SELECTION   ֻ��ѡ���ڵ�
		 * SINGLE_SELECTION            ��ѡ
		 * 
		 */
		jl.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);//����ѡ��ģʽ
		JScrollPane js=new JScrollPane(jl);//��ӹ�����
		js.setBounds(10, 10, 100, 100);//����λ���Լ���С  ע����Сλ��Ҫ���ڹ������ϣ�֮ǰ�б��������������֮�󲻱�����λ�ã�λ�ø��������λ�øı�
		JButton jb=new JButton("ȷ��");
		jb.setBounds(120, 90, 70, 25);
		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//��ȡ�б���е�����Ԫ��
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
