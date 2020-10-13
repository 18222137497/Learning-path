package com.tedu.shootgame;

import java.awt.image.BufferedImage;

/**
 * �ӵ���-������
 * @author 123
 *
 */
public class Bullet extends FlyingObject {
	/*����ͼƬ*/
	public static BufferedImage image;
	/*��̬��������ͼƬ*/
	static {
		image=loadImage("bullet.png");
	}
	/*�����������*/
	private int speed;
	
	/*���췽��*/
	public Bullet(int x, int y){
		super(8,14,x,y);
		speed=3;
	}

	@Override
	public void step() {
		y-=speed;
	}
    //��ȡ�ӵ�ͼƬ
	@Override
	public BufferedImage getImage() {
		if (isLife()) {
			return image;
		}else if (isDead()) {
			state=REMOVE;
		}
		return null;
	}

	@Override
	public boolean OutOfBounds() {
		
		return y<=-this.height;
	}

}
