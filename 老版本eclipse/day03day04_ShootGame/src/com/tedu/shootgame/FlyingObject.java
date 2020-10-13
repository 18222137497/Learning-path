package com.tedu.shootgame;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

/**
 * 飞行物抽象类
 * 包含了飞行物所有公共属性、构造方法、自定义方 法
 * 使用飞行物实体类去继承此类
 * 简化了编写代码量，体现按面向对象编程
 * @author 123
 *
 */
public abstract class FlyingObject {
	/*定义飞行物基本属性
	飞行物状态
	*/
	public static final int LIFE=0;
	//死了
	public static final int DEAD=1;
	//删除
	public static final int REMOVE=2;
	//飞行物初始状态
	public int state =LIFE;

	//飞行物的宽，高，x，y坐标
	protected int width;//宽
	protected int height;//高
	protected int x;//x坐标
	protected int y;//y坐标
	/*
	 * 提供特定的构造方法
	 * 两种：
	 *  1.英雄机、天空、子弹
	 *  2.大小敌机和蜜蜂提供
	 */
	
	/*专门为英雄机天空子弹提供的构造放法 */
	public FlyingObject(int width,int height,int x,int y){
		this.width=width;
		this.height=height;
		this.x=x;
		this.y=y;
	}
	/*专门为大小敌机和蜜蜂准备的构造方法*/
	public FlyingObject(int width,int height){
		this.width=width;
		this.height=height;
		/*
		 * 设置飞行物x坐标范围内出现的位置
		 */
		Random ran=new Random();
		x=ran.nextInt(ShootGame.WIDTH-this.width);
		/*
		 * 设置飞行物的y坐标
		 * -height 
		 */
		y=-this.height;
		
	}
	/*读取图片方法*/
	public static BufferedImage loadImage(String fileName){
		try {
			//同包读取图片
			BufferedImage img=ImageIO.read(FlyingObject.class.getResource(fileName));
			
			return img;
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	/*飞行物移动*/
	public abstract void step();
	/*获取图片*/
	public abstract BufferedImage getImage();
	/*判断是否活着*/
	public boolean isLife(){
		return state==LIFE;
	}
	/*判断是否死了*/
	public boolean isDead(){
		return state==DEAD;	
	}
	/*判断是否删除*/
	public boolean isRemove(){
		return state==REMOVE;
	}
	/*画笔机绘制图片*/
	public void paintObject(Graphics g){
		g.drawImage(getImage(), x, y, null);
	}
	/*检测飞行物是否越界*/
	public abstract boolean OutOfBounds();
	/*碰撞方法：this_敌人、other_子弹/英雄机*/
	public boolean hit(FlyingObject other){
		//x1：碰撞的x最小边界
		int x1=this.x-other.width;
		//x2：碰撞的x最大边界
		int x2=this.x+this.width;
		//y1：碰撞的y最小边界
		int y1=this.y-other.height;
		//y2：碰撞的y最大边界
		int y2=this.y+this.height;
		//获取other-英雄机/子弹的x/y坐标
		int x=other.x;
		int y=other.y;
		//返回逻辑表达式-是否碰撞
		return x>=x1&&x<=x2&&y>=y1&&y<=y2;
	}
	/*飞行物去死吧*/
	public void goDead(){
		state=DEAD;
		/* 虽然次方法的目的是为了让飞行物的状态为dead，
		 * 但并不表示飞行物被移除了，只有状态为Remove飞行物才会被删除，
		 */
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
