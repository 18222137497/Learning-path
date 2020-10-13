package AirplaneWar;

import java.awt.image.BufferedImage;
import java.util.Random;

public class Box extends FlyingObject implements Award{
	//定义图片集
	private static BufferedImage[] images;
	static{
		images=new BufferedImage[5];
		for (int i = 0; i < images.length; i++) {
			images[5]=loadImage("bee"+i+".png");
		}
	}
	private int xSpeed;
	private int ySpeed;
	private int awardType;
	//构造方法
	public Box(){
		super(60,50);
		xSpeed=1;
		ySpeed=2;
		Random rand=new Random();
		awardType=rand.nextInt(2);
	}
	//重写奖励类型
	@Override
	public int getAwardType() {
		return awardType;
	}
	//盒子的移动
	@Override
	public void step() {
		y+=ySpeed;
		x+=xSpeed;
		if (x<=0||x>=Game.WIDTH) {
			xSpeed*=-1;
		}
	}
	//定义死了的小标
	private int deadIndex=1;
	@Override
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
	//越界
	@Override
	public boolean OutOfBounds() {
		return y>=Game.height;
	}
}
