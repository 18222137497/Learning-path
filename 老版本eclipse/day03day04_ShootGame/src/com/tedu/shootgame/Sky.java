package com.tedu.shootgame;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

/**
 * 天空-飞行物
 * @author 123
 *
 */
public class Sky extends FlyingObject {
	/*定义背景图*/
	private static BufferedImage image;
	static {
		image =loadImage("background.png");
	}
	//定义坐标增量
	private int speed;
	private int y1;//用于两张背景图片的切换
	/*构造方法*/
	public Sky(){
		super(ShootGame.WIDTH,ShootGame.HEIGHT,0,0);//调用父类的构造方法
		speed=1;
		y1=-this.height;//第二张图的初始坐标
	}
	/*天空的移动*/
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
	/*获取图片*/
	@Override
	public BufferedImage getImage() {
		return image;
	}
	
	@Override
	public boolean OutOfBounds() {
		// TODO Auto-generated method stub
		return false;
	}
	/*重写paintObject方法*/
	public void paintObject(Graphics g){
		g.drawImage(getImage(), x, y, null);
		g.drawImage(getImage(), x, y1, null);
	}




}
