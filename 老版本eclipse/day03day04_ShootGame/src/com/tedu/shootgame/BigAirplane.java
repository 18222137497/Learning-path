package com.tedu.shootgame;

import java.awt.image.BufferedImage;

/**
 * 大敌机-飞行物-可以得分
 * @author 123
 *
 */
public class BigAirplane extends FlyingObject implements Enemy{
	/*定义图片集*/
	public static BufferedImage[] images;
	/*静态代码块加载图片*/
	static {
		//初始化图片数组
		images =new BufferedImage[5];
		//循环遍历加载图片
		for (int i = 0; i < images.length; i++) {
			images[i]=loadImage("bigplane"+i+".png");
		}
	}
	/*定义坐标增量*/
	private int speed;
	/*构造方法*/
	public BigAirplane(){
		super(69,99);
		speed=2;
	}
/*得分*/
	public int getScore() {
		return 3;
	}
/*大敌机移动*/
	public void step() {
		y+=speed;
	}
/*获取图片*/
	/*死了得下标*/
	public int deadIndex=1;
	/*爆炸*/
	/*判断是否活着*/
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
	/*判断越界*/
	public boolean OutOfBounds() {
		return this.y>=ShootGame.HEIGHT;
	}

}
