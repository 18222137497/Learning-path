package com.tarena.yadx.manyStar;

import java.awt.Toolkit;

/**
 * 此类是公共类-工厂类
 * 封装公共的属性及方法
 * 窗体的宽
 * 窗体的高
 * 屏幕的宽
 * 屏幕的高
 * 水平居中的x坐标
 * 垂直居中的y坐标
 * 使用静态的属性-static关键字
 * 目的是为了能够使用类名直接打点调用其公共类的属性
 * @author 123
 *
 */

public class Factory {
	public static int width=Toolkit.getDefaultToolkit().getScreenSize().width;//屏幕的宽
	public static int height=Toolkit.getDefaultToolkit().getScreenSize().height;//屏幕的高
	public static int jframeWidth=400;//窗体的宽
	public static int jframeHeight=600;//窗体的高
	public static int jframeX=width/2-jframeWidth/2;
	public static int jframeY=height/2-jframeHeight/2;//窗体位置
	
	

}
