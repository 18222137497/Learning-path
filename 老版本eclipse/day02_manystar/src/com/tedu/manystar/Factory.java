package com.tedu.manystar;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

public class Factory {
	public static int width=Toolkit.getDefaultToolkit().getScreenSize().width;
	public static int height=Toolkit.getDefaultToolkit().getScreenSize().height;
	public static int jfwidth=400;
	public static int jfheight=600;
	public static int jframeX=width/2-jfwidth/2;
	public static int jframeY=height/2-jfheight/2;
	/*自定义方法-随机生成x和y坐标*/
	public static int randomPoint(int l){
		int point=(int)(Math.random()*l);
		return point;
	}
	/*自定义方法-随机生成字体*/
	public static Font randomFont(int l){
		int size=(int)(Math.random()*l);
		Font font=new Font("宋体",Font.BOLD,size);
		return font;
	}
	/*自定义方法-随机产生颜色*/
	public static Color randomColor(int l){//颜色色调0-256
		int R=(int)(Math.random()*l);
		int G=(int)(Math.random()*l);
		int B=(int)(Math.random()*l);
		Color c=new Color(R,G,B);
		return c;
		
	}
	
}
