package com.tedu.cathfish;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

//鱼
public class Fish {

	/**
	 * 序列化标识
	 * @param args
	 */
	
	
	//图片
	BufferedImage image;//图片
	
	//坐标，图片的宽度，高度
	int x,y,width,height;
	
	
	//速度
	int speed;//速度
	
	
	BufferedImage[] images;
	
	//构造方法
	public Fish(String name){
		
			try {
				images = new BufferedImage[10];
				for(int i=0;i<images.length;i++){
				images[i] = ImageIO.read(new File("pic/fish0"+name+i+".png"));
				}
				image=images[0];
				width=image.getWidth();
				height=image.getHeight();
				x=(int)(Math.random()*700);
				y=(int)(Math.random()*500);
				speed=(int)(Math.random()*3)+4;
			} catch(Exception e){
				e.printStackTrace();
			}
		}
	
	//鱼游动的方法
	int index = 0;//循环下标
	int count = 0;//计数
	public void move(){
		image = images[index++ % images.length];
		//对数组长度取余，可以保证下标不越界
		x = x -speed;
		if(x<=-width/2){
			x=  700 + width/2;
			y=(int)(Math.random()*500);
			
		}
	}
}


