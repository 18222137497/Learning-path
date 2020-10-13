package com.tedu.cathfish;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

//渔网
public class Net {
//
	BufferedImage image;
	int x,y,width,height;
	boolean show;
	
	public Net(){
		try {
			image=ImageIO.read(new File("pic"+File.separator+"net09.png"));
			width = image.getWidth();
			height = image.getHeight();
			x = 0;
			y = 0;
			show = true;//代表显示渔网
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 同步坐标
	 * @param args
	 */
     public void moveTo(int x,int y){
    	 this.x = x;
    	 this.y = y;
     }
     //进行判断
     public boolean catchFish(Fish f){
    	 int x1 = f.x - f.width/2;
    	 int x2 = f.x + f.width/2;
    	 int y1 = f.y - f.height/2;
    	 int y2 = f.y + f.height/2;
    	 if(x>x1 && x<x2 && y>y1 && y<y2){
    		 return true;//捕上鱼
    	 }
		return false;//未捕到鱼
    	 
     }
	public static void main(String[] args){
	Net net = new Net();
	System.out.println(net);
	
	}
	
    	 
     
	

}
