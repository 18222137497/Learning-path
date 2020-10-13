package com.tedu.shootgame;

import java.awt.image.BufferedImage;

/**
 * 子弹类-飞行物
 * @author 123
 *
 */
public class Bullet extends FlyingObject {
	/*定义图片*/
	public static BufferedImage image;
	/*静态代码块加载图片*/
	static {
		image=loadImage("bullet.png");
	}
	/*定义坐标变量*/
	private int speed;
	
	/*构造方法*/
	public Bullet(int x, int y){
		super(8,14,x,y);
		speed=3;
	}

	@Override
	public void step() {
		y-=speed;
	}
    //获取子弹图片
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
