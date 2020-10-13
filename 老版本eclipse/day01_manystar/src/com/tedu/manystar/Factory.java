package com.tedu.manystar;

import java.awt.Toolkit;

/**
 * 此类是公共类
 * 封装了公共的属性及方法
 * 作用：体现了代码的复用性
 * @author 123
 *
 */
public class Factory {
	//获取屏幕的宽
	public static int width=Toolkit.getDefaultToolkit().getScreenSize().width;
	//获取屏幕的高
	public static int height=Toolkit.getDefaultToolkit().getScreenSize().height;
	//定义窗体的宽
	public static int jfwidth=400;
	//定义窗体的高
	public static int jfheight=600;
	//计算水平居中x坐标
	public static int jframeX=width/2-jfwidth/2;
	//计算垂直居中y坐标
	public static int jframeY=height/2-jfheight/2;

}
