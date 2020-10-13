package AirplaneWar;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

/**
 * 飞行物公共类
 * 飞行物公共属性、公共构造方法、自定义方法
 * 飞行物实体类继承此类
 * @author 123
 *
 */
public abstract class FlyingObject {
	/*
	 * 定义飞行物基本属性
	 * 飞行物状态
	 */
	public static final int LIFE=0;
	public static final int DEAD=1;
	public static final int REMOVE=2;//删除
	//飞行物初始状态
	public int state=LIFE;
	//飞行物的宽高xy坐标
	protected int width;
	protected int height;
	protected int x;
	protected int y;
	/*
	 * 提供特定的构造方法
	 */
	//英雄机 子弹 天空
	public FlyingObject(int width,int height,int x,int y){
		this.width=width;
		this.height=height;
		this.x=x;
		this.y=y;
	}
	//敌人 蜜蜂
	public FlyingObject(int width,int height){
		this.width=width;
		this.height=height;
		Random r=new Random();
		x=r.nextInt(Game.WIDTH-this.width);
		y=-this.height;
	}
	//读取图片的方法
	public static BufferedImage loadImage(String fileName){
		try {
			//读取同包图片
			BufferedImage img=ImageIO.read(FlyingObject.class.getResource(fileName));
			return img;
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	//飞行物移动
	public abstract void step();
	//获取图片
	public abstract BufferedImage getImage();
	//判断是否还活着
	public boolean isLife(){
		return state==LIFE;
	}
	//判断是否死了
	public boolean isDead(){
		return state==DEAD;
	}
	//判断是否删除 
	public boolean isRemove(){
		return state==REMOVE;
	}
	//画笔机绘制图片
	public void paintObject(Graphics g){
		g.drawImage(getImage(), x, y, null);
	}
	//检测飞行物是否越界
	public abstract boolean OutOfBounds();
	//碰撞方法
	public boolean hit(FlyingObject other){
		int x1=this.x-other.width;
		int x2=this.x+this.width;
		int y1=this.y-other.height;
		int y2=this.y+this.height;
		int x=other.x;
		int y=other.y;
		return x>=x1&&x<=x2&&y>=y1&&y<=y2;//碰撞为true
	}
	//飞行物死
	public void goDead(){
		state=DEAD;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
