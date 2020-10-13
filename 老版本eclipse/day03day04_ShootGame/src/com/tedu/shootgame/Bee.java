package com.tedu.shootgame;

import java.awt.image.BufferedImage;
import java.util.Random;

/**
 * 小蜜蜂-飞行物-奖励
 * @author 123
 *
 */
public class Bee extends FlyingObject implements Award{
	/*定义图片集*/
	private static BufferedImage[]images;
	static{
		images =new BufferedImage[5];
		for (int i = 0; i < images.length; i++) {
			images[i]=loadImage("bee"+i+".png");
		}
	}
	private int xSpeed;//x坐标增量
	private int ySpeed;//y坐标增量
	private int awardType;//奖励类型

	/*构造方法*/
	public Bee(){
		super(60,50);
		xSpeed=1;
		ySpeed=2;
		Random rand=new Random();
		awardType= rand.nextInt(2);//产生0~2的整数，不包含2
		
	}
	/*重写奖励类型*/
	public int getAwardType() {
		
		return awardType;
	}

	/*小蜜蜂的移动*/
	public void step() {
		y+=ySpeed; 
		x+=xSpeed;
		//判读是否碰撞到左右边界
		if (x<=0||x>=ShootGame.WIDTH-this.width) {
			xSpeed*=-1;//改变x方向
		}
	}
	/*定义死了的下标*/
	private int deadIndex=1;
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

	/*检测小蜜蜂是否越界*/
	public boolean OutOfBounds() {
		
		return this.y>=ShootGame.height;
	}
}
