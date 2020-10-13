package com.tedu.shootgame;

import java.awt.image.BufferedImage;
import java.util.Random;

/**
 * С�۷�-������-����
 * @author 123
 *
 */
public class Bee extends FlyingObject implements Award{
	/*����ͼƬ��*/
	private static BufferedImage[]images;
	static{
		images =new BufferedImage[5];
		for (int i = 0; i < images.length; i++) {
			images[i]=loadImage("bee"+i+".png");
		}
	}
	private int xSpeed;//x��������
	private int ySpeed;//y��������
	private int awardType;//��������

	/*���췽��*/
	public Bee(){
		super(60,50);
		xSpeed=1;
		ySpeed=2;
		Random rand=new Random();
		awardType= rand.nextInt(2);//����0~2��������������2
		
	}
	/*��д��������*/
	public int getAwardType() {
		
		return awardType;
	}

	/*С�۷���ƶ�*/
	public void step() {
		y+=ySpeed; 
		x+=xSpeed;
		//�ж��Ƿ���ײ�����ұ߽�
		if (x<=0||x>=ShootGame.WIDTH-this.width) {
			xSpeed*=-1;//�ı�x����
		}
	}
	/*�������˵��±�*/
	private int deadIndex=1;
	public BufferedImage getImage() {
		if (isLife()) {
			return images[0];
		}else if (isDead()) {
			BufferedImage img=images[deadIndex++];
			if (deadIndex==images.length) {
				state=REMOVE;
			}
			return img;
		}
		return null;
	}

	/*���С�۷��Ƿ�Խ��*/
	public boolean OutOfBounds() {
		
		return this.y>=ShootGame.height;
	}
}
