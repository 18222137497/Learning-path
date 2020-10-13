package AirplaneWar;

import java.awt.image.BufferedImage;

public class Hero extends FlyingObject{
	//定义图片集
	private static BufferedImage[] images;
	//静态代码块加载图片
	static{
		images=new BufferedImage[2];
		for (int i = 0; i < images.length; i++) {
			images[i]=loadImage("hero"+i+".png");
		}
	}
	//定义生命值
	private int  life;
	//定义双倍火力
	private int doubleFire;
	//构造方法
	public Hero(){
		super(97,124,150,400);
		life=3;
		doubleFire=0;
	}
	//xy坐标 居中，使得xy=鼠标xy
	public void moveTo(int x,int y){
		//将鼠标的xy坐标移动至图片中间
		this.x=x-this.width/2;
		this.y=y-this.height/2;
	}
	//英雄机的移动
	@Override
	public void step() {
	}
	//定义活着的下标
	int index=0;
	//获取英雄机图片
	@Override
	public BufferedImage getImage() {
		if (isLife()) {
			return images[index++%2];
		}
		return null;
	}
	//英雄机发射子弹的算法
	public Bullet[] shoot(){
		//定义1/6英雄机的宽
		int xStep=this.width/6;
		int yStep=20;//固定子弹y位置
		if (doubleFire>0) {
			Bullet[] bs=new Bullet[5];
			bs[0]=new Bullet(this.x+1*xStep,this.y-yStep);
			bs[1]=new Bullet(this.x+2*xStep,this.y-yStep);
			bs[2]=new Bullet(this.x+3*xStep,this.y-yStep);
			bs[3]=new Bullet(this.x+4*xStep,this.y-yStep);
			bs[4]=new Bullet(this.x+5*xStep,this.y-yStep);
			//英雄机每发射一次双倍子弹火力减少2，定时
			doubleFire-=2;
			return bs;
		}else{
			Bullet[] bs=new Bullet[1];
			bs[0]=new Bullet(this.x+3*xStep,this.y-yStep);
			return bs;
		}
	}
	@Override
	public boolean OutOfBounds() {
		return false;
	}
	/*英雄机特有方法*/
	//英雄机生命增加
	public void addLife(){
		life++;
	}
	//英雄机生命减少
	public void subractLife(){
		life--;
	}
	//获取英雄机生命值
	public int getLife(){
		return life;
	}
	//英雄机增加火力
	public void addDoubleFire(){
		doubleFire+=40;
	}
	//英雄机减少火力值
	public void clearDoubleFire(){
		doubleFire=0;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
