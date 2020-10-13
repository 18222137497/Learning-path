package AirplaneWar;

import java.awt.image.BufferedImage;

public class Bullet extends FlyingObject{
	//定义图片
	public static BufferedImage image;
	//静态代码块加载图片
	static {
		image=loadImage("bullet.png");
	}
	//定义坐标变量
	private int speed;
	//构造方法
	public Bullet(int x,int y){
		super(8,14,x,y);
		speed=3;
	}
	//子弹的移动
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
	//定义子弹越界
	@Override
	public boolean OutOfBounds() {
		return y<=-this.height;
	}

}
