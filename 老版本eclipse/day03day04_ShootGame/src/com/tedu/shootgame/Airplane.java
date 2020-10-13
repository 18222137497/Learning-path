package com.tedu.shootgame;

import java.awt.image.BufferedImage;

/**
 * С�л���-������-���Ե÷�
 * @author 123
 *
 */
public class Airplane extends FlyingObject implements Enemy{
	/*����ͼƬ��*/
	public static BufferedImage[] images;
	static {
		//��ʼ��ͼƬ����
		images =new BufferedImage[5];
		//ѭ������-�����ͼƬ���л�-��ըЧ��
		for (int i = 0; i < images.length; i++) {
			images[i]=loadImage("airplane"+i+".png");
		}
	}
	/*����������������*/
	private int speed;
	/*���췽��*/
	public Airplane(){
		/*
		 * super()����ִ�и���Ĺ��췽��
		 *    -������ڵ�ǰ�����ĵ�һ��
		 */
		super(49,36);
		speed=2;//��������Ϊ2 y+2
	}
	/*�����±�-���˵��±�*/
	int deadIndex=1;
	/*С�л������÷�*/
	public int getScore() {
		return 1;
	}
	/*С�л��ƶ�*/
	public void step() {
		y+=speed;//y+2		
	}
	/*��ȡͼƬ-ͼƬ�л�-��ըЧ��*/
	public BufferedImage getImage() {
		//�ж��Ƿ����
		if (isLife()) {
			return images[0];
		}else if (isDead()) {
			//�ӵڶ���ͼƬ��ʼ�ֻ�
			BufferedImage img=images[deadIndex++];
			//��ת��������ͼƬ��ʱɾ��������
			if (deadIndex==images.length) {
				state=REMOVE;
			}
			return img;
		}
			
		return null;
	}
	/*���С�л��Ƿ�Խ��*/
	public boolean OutOfBounds() {
		return this.y>=ShootGame.HEIGHT;
	}

}
