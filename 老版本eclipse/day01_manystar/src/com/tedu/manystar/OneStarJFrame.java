package com.tedu.manystar;

import javax.swing.JFrame;

/**
 * 此类是窗体类：
 *  1.继承JFrame类
 *  2.构造方法初始化窗体参数
 *  3.main函数实例化当前类对象
 * @author 123
 *
 */
public class OneStarJFrame extends JFrame {
	/*构造方法初始化参数*/
	public OneStarJFrame(){
		//设置标题
		this.setTitle("One star");
		//设置窗体大小及位置
		this.setBounds(Factory.jframeX, Factory.jframeY, Factory.jfwidth, Factory.jfheight);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		//设置默认的关闭方式
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		//添加内容
		this.add(new OneStarJPanel());
	}
	//主函数：程序的入口，没有主函数的类不能运行
	public static void main(String[] args) {
		new OneStarJFrame();
	}
	

}
