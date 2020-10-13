package com.tedu.cathfish;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

//��
public class Fish {

	/**
	 * ���л���ʶ
	 * @param args
	 */
	
	
	//ͼƬ
	BufferedImage image;//ͼƬ
	
	//���꣬ͼƬ�Ŀ�ȣ��߶�
	int x,y,width,height;
	
	
	//�ٶ�
	int speed;//�ٶ�
	
	
	BufferedImage[] images;
	
	//���췽��
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
	
	//���ζ��ķ���
	int index = 0;//ѭ���±�
	int count = 0;//����
	public void move(){
		image = images[index++ % images.length];
		//�����鳤��ȡ�࣬���Ա�֤�±겻Խ��
		x = x -speed;
		if(x<=-width/2){
			x=  700 + width/2;
			y=(int)(Math.random()*500);
			
		}
	}
}


