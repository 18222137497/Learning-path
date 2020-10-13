package com.tedu.shootgame;

import java.awt.image.BufferedImage;

/**
 * ��л�-������-���Ե÷�
 * @author 123
 *
 */
public class BigAirplane extends FlyingObject implements Enemy{
	/*����ͼƬ��*/
	public static BufferedImage[] images;
	/*��̬��������ͼƬ*/
	static {
		//��ʼ��ͼƬ����
		images =new BufferedImage[5];
		//ѭ����������ͼƬ
		for (int i = 0; i < images.length; i++) {
			images[i]=loadImage("bigplane"+i+".png");
		}
	}
	/*������������*/
	private int speed;
	/*���췽��*/
	public BigAirplane(){
		super(69,99);
		speed=2;
	}
/*�÷�*/
	public int getScore() {
		return 3;
	}
/*��л��ƶ�*/
	public void step() {
		y+=speed;
	}
/*��ȡͼƬ*/
	/*���˵��±�*/
	public int deadIndex=1;
	/*��ը*/
	/*�ж��Ƿ����*/
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
	/*�ж�Խ��*/
	public boolean OutOfBounds() {
		return this.y>=ShootGame.HEIGHT;
	}

}
