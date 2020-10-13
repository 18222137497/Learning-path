package AirplaneWar;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class BackGround extends FlyingObject{
	private static BufferedImage image;
	static {
		image=loadImage("background.png");	
	}
	//定义坐标增量
	private int speed;
	private int y1;//第二章图片坐标增量
	//构造方法
	public BackGround(){
		super(Game.WIDTH,Game.HEIGHT,0,0);
		speed=1;
		y1=-this.height;
	}
	//天空的移动
	@Override
	public void step() {
		y+=speed;
		y1+=speed;
		if (y>=Game.HEIGHT) {
			y=-Game.HEIGHT;
		}
		if (y1>=Game.HEIGHT) {
			y1=-Game.HEIGHT;
		}	
	}
	/*获取图片*/
	@Override
	public BufferedImage getImage() {
		return image;
	}
	//无删除方法
	@Override
	public boolean OutOfBounds() {
		return false;
	}
	/*重写paintObject方法*/
	//画图
	@Override
	public void paintObject(Graphics g) {
		g.drawImage(getImage(), x, y, null);
		g.drawImage(getImage(), x, y1, null);
	}

}
