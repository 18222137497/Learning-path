package com.tedu.manystar;

import javax.swing.JFrame;

/**
 * �����Ǵ����ࣺ
 *  1.�̳�JFrame��
 *  2.���췽����ʼ���������
 *  3.main����ʵ������ǰ�����
 * @author 123
 *
 */
public class OneStarJFrame extends JFrame {
	/*���췽����ʼ������*/
	public OneStarJFrame(){
		//���ñ���
		this.setTitle("One star");
		//���ô����С��λ��
		this.setBounds(Factory.jframeX, Factory.jframeY, Factory.jfwidth, Factory.jfheight);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		//����Ĭ�ϵĹرշ�ʽ
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		//�������
		this.add(new OneStarJPanel());
	}
	//���������������ڣ�û�����������಻������
	public static void main(String[] args) {
		new OneStarJFrame();
	}
	

}
