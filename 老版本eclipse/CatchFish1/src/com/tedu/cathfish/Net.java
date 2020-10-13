package com.tedu.cathfish;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

//����
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
			show = true;//������ʾ����
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * ͬ������
	 * @param args
	 */
     public void moveTo(int x,int y){
    	 this.x = x;
    	 this.y = y;
     }
     //�����ж�
     public boolean catchFish(Fish f){
    	 int x1 = f.x - f.width/2;
    	 int x2 = f.x + f.width/2;
    	 int y1 = f.y - f.height/2;
    	 int y2 = f.y + f.height/2;
    	 if(x>x1 && x<x2 && y>y1 && y<y2){
    		 return true;//������
    	 }
		return false;//δ������
    	 
     }
	public static void main(String[] args){
	Net net = new Net();
	System.out.println(net);
	
	}
	
    	 
     
	

}
