package com.tedu.shootgame;

import java.awt.image.BufferedImage;

/**
 * 英雄机类-飞行物
 * @author 123
 *
 */
public class Hero extends FlyingObject {
	/*定义图片集*/
	private static BufferedImage[] images;
	/*静态代码块加载图片*/
	static {
		images=new BufferedImage[2];
		for (int i = 0; i < images.length; i++) {
			images[i]=loadImage("hero"+i+".png");
		}
	}
	/*定义生命值*/
	private int life;
	/*定义双倍火力*/
	private int doubleFire;
	/*构造方法*/
	public  Hero(){
		super(97,124,150,400);
		life=3;//默认为3条命
		doubleFire=0;//默认为单倍
	}
	/*英雄机随着鼠标移动，x，y坐标为鼠标的xy坐标*/
	public void moveTo(int x,int y){
		//将鼠标的xy坐标移动至英雄机图片的中间
		this.x=x-this.width/2;
		this.y=y-this.height/2;
	}
	/*英雄机的移动*/
	@Override
	public void step() {
	}
	/*定义活着的下标*/
	int index=0;
	/*英雄机获取图片*/
	@Override
	public BufferedImage getImage() {
		if (isLife()) {
			return images[index++%2];
		};
		return null;
	}
	/*英雄机发射子弹的算法*/
	public Bullet[] shoot(){
		//定义1/4英雄机的宽
		int xStep=this.width/4;
		int yStep=20;//固定
		if (doubleFire>0) {//双
			//定义子弹数组长度为2
			Bullet[] bs=new Bullet[3];
			bs[0]=new Bullet(this.x+1*xStep,this.y-yStep);
			bs[1]=new Bullet(this.x+2*xStep,this.y-yStep);
			bs[2]=new Bullet(this.x+3*xStep,this.y-yStep);
			//英雄机每发射一次双倍子弹活力减少2
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
	 * 英雄机特有方法
	 */
	/*英雄机生命增加*/
	public void addLife(){
		life++;
	}
	/*英雄机减少生命值*/
	public void subtractLife(){
		life--;
	}
	/*获取英雄机生命值*/
	public int getLife(){
		return life;
	}
	/*英雄机增加活力值*/
	public void addDoubleFire(){
		doubleFire+=40;
	}
	/*英雄机减少活力值*/
	public void clearDoubleFire(){
		doubleFire=0;
	}

}
