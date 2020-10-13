package AirplaneWar;

import java.awt.image.BufferedImage;

/**
 * 大敌机-飞行物-可以得分
 * @author 123
 *
 */
public class Enemy extends FlyingObject implements Score{
	//定义图片集
	public static BufferedImage[] images;
	//静态代码块加载图片
	static{
		//初始化图片数组
		images=new BufferedImage[5];
		//循环遍历加载图片
		for (int i = 0; i < images.length; i++) {
			images[i]=loadImage("bigplane"+i+".png");
		}
	}
	//定于坐标增量
	private int speed;
	//构造方法
	public Enemy() {
		super(69,99);
		speed=2;
	}
	//得分
	@Override
	public int getScore() {
		return 3;
	}
	//大敌机移动
	@Override
	public void step() {
		y+=speed;
	}
	//定义死了的下标
	public int deadIndex=1;
	//获取图片
	@Override
	public BufferedImage getImage() {
		//判断是否活着
		if (isLife()) {
			return images[0];
		}else if(isDead()){//爆炸
			BufferedImage img=images[deadIndex++];
			if (deadIndex==images.length) {
				state=REMOVE;
			}
			return img;
		}
		return null;
	}
	//判断越界
	@Override
	public boolean OutOfBounds() {
		return this.y>=Game.HEIGHT;
	}
	


}
