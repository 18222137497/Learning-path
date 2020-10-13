package com.tedu.shootgame;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

/**
 * ���-������
 * @author 123
 *
 */
public class Sky extends FlyingObject {
	/*���屳��ͼ*/
	private static BufferedImage image;
	static {
		image =loadImage("background.png");
	}
	//������������
	private int speed;
	private int y1;//�������ű���ͼƬ���л�
	/*���췽��*/
	public Sky(){
		super(ShootGame.WIDTH,ShootGame.HEIGHT,0,0);//���ø���Ĺ��췽��
		speed=1;
		y1=-this.height;//�ڶ���ͼ�ĳ�ʼ����
	}
	/*��յ��ƶ�*/
	@Override
	public void step() {
		y+=speed;
		y1+=speed;
		if (y>=ShootGame.HEIGHT) {
			y=-ShootGame.HEIGHT;
		}
		if (y1>=ShootGame.HEIGHT) {
			y1=-ShootGame.HEIGHT;
		}
		
	}
	/*��ȡͼƬ*/
	@Override
	public BufferedImage getImage() {
		return image;
	}
	
	@Override
	public boolean OutOfBounds() {
		// TODO Auto-generated method stub
		return false;
	}
	/*��дpaintObject����*/
	public void paintObject(Graphics g){
		g.drawImage(getImage(), x, y, null);
		g.drawImage(getImage(), x, y1, null);
	}




}
