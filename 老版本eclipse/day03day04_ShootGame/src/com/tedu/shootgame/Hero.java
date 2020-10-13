package com.tedu.shootgame;

import java.awt.image.BufferedImage;

/**
 * Ӣ�ۻ���-������
 * @author 123
 *
 */
public class Hero extends FlyingObject {
	/*����ͼƬ��*/
	private static BufferedImage[] images;
	/*��̬��������ͼƬ*/
	static {
		images=new BufferedImage[2];
		for (int i = 0; i < images.length; i++) {
			images[i]=loadImage("hero"+i+".png");
		}
	}
	/*��������ֵ*/
	private int life;
	/*����˫������*/
	private int doubleFire;
	/*���췽��*/
	public  Hero(){
		super(97,124,150,400);
		life=3;//Ĭ��Ϊ3����
		doubleFire=0;//Ĭ��Ϊ����
	}
	/*Ӣ�ۻ���������ƶ���x��y����Ϊ����xy����*/
	public void moveTo(int x,int y){
		//������xy�����ƶ���Ӣ�ۻ�ͼƬ���м�
		this.x=x-this.width/2;
		this.y=y-this.height/2;
	}
	/*Ӣ�ۻ����ƶ�*/
	@Override
	public void step() {
	}
	/*������ŵ��±�*/
	int index=0;
	/*Ӣ�ۻ���ȡͼƬ*/
	@Override
	public BufferedImage getImage() {
		if (isLife()) {
			return images[index++%2];
		};
		return null;
	}
	/*Ӣ�ۻ������ӵ����㷨*/
	public Bullet[] shoot(){
		//����1/4Ӣ�ۻ��Ŀ�
		int xStep=this.width/4;
		int yStep=20;//�̶�
		if (doubleFire>0) {//˫
			//�����ӵ����鳤��Ϊ2
			Bullet[] bs=new Bullet[3];
			bs[0]=new Bullet(this.x+1*xStep,this.y-yStep);
			bs[1]=new Bullet(this.x+2*xStep,this.y-yStep);
			bs[2]=new Bullet(this.x+3*xStep,this.y-yStep);
			//Ӣ�ۻ�ÿ����һ��˫���ӵ���������2
			doubleFire-=2;
			return bs;
		}else{
			Bullet[] bs=new Bullet[1];
			bs[0]=new Bullet(this.x+2*xStep,this.y-yStep);
			return bs;
		}
	}
	@Override
	public boolean OutOfBounds() {
		return false;
	}
	/*
	 * Ӣ�ۻ����з���
	 */
	/*Ӣ�ۻ���������*/
	public void addLife(){
		life++;
	}
	/*Ӣ�ۻ���������ֵ*/
	public void subtractLife(){
		life--;
	}
	/*��ȡӢ�ۻ�����ֵ*/
	public int getLife(){
		return life;
	}
	/*Ӣ�ۻ����ӻ���ֵ*/
	public void addDoubleFire(){
		doubleFire+=40;
	}
	/*Ӣ�ۻ����ٻ���ֵ*/
	public void clearDoubleFire(){
		doubleFire=0;
	}

}
