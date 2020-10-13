package com.tedu.shootgame;

import java.awt.image.BufferedImage;

/**
 * 小敌机类-飞行物-可以得分
 * @author 123
 *
 */
public class Airplane extends FlyingObject implements Enemy{
	/*定义图片集*/
	public static BufferedImage[] images;
	static {
		//初始化图片数组
		images =new BufferedImage[5];
		//循环遍历-完后曾图片得切换-爆炸效果
		for (int i = 0; i < images.length; i++) {
			images[i]=loadImage("airplane"+i+".png");
		}
	}
	/*定义属性坐标增量*/
	private int speed;
	/*构造方法*/
	public Airplane(){
		/*
		 * super()：先执行父类的构造方法
		 *    -必须放在当前方法的第一行
		 */
		super(49,36);
		speed=2;//坐标增量为2 y+2
	}
	/*定义下标-死了的下标*/
	int deadIndex=1;
	/*小敌机死亡得分*/
	public int getScore() {
		return 1;
	}
	/*小敌机移动*/
	public void step() {
		y+=speed;//y+2		
	}
	/*获取图片-图片切换-爆炸效果*/
	public BufferedImage getImage() {
		//判断是否活着
		if (isLife()) {
			return images[0];
		}else if (isDead()) {
			//从第二章图片开始轮换
			BufferedImage img=images[deadIndex++];
			//当转到第五张图片视时删除飞行物
			if (deadIndex==images.length) {
				state=REMOVE;
			}
			return img;
		}
			
		return null;
	}
	/*检测小敌机是否越界*/
	public boolean OutOfBounds() {
		return this.y>=ShootGame.HEIGHT;
	}

}
