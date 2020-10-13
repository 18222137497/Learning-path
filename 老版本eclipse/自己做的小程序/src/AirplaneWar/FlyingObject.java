package AirplaneWar;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

/**
 * �����﹫����
 * �����﹫�����ԡ��������췽�����Զ��巽��
 * ������ʵ����̳д���
 * @author 123
 *
 */
public abstract class FlyingObject {
	/*
	 * ����������������
	 * ������״̬
	 */
	public static final int LIFE=0;
	public static final int DEAD=1;
	public static final int REMOVE=2;//ɾ��
	//�������ʼ״̬
	public int state=LIFE;
	//������Ŀ��xy����
	protected int width;
	protected int height;
	protected int x;
	protected int y;
	/*
	 * �ṩ�ض��Ĺ��췽��
	 */
	//Ӣ�ۻ� �ӵ� ���
	public FlyingObject(int width,int height,int x,int y){
		this.width=width;
		this.height=height;
		this.x=x;
		this.y=y;
	}
	//���� �۷�
	public FlyingObject(int width,int height){
		this.width=width;
		this.height=height;
		Random r=new Random();
		x=r.nextInt(Game.WIDTH-this.width);
		y=-this.height;
	}
	//��ȡͼƬ�ķ���
	public static BufferedImage loadImage(String fileName){
		try {
			//��ȡͬ��ͼƬ
			BufferedImage img=ImageIO.read(FlyingObject.class.getResource(fileName));
			return img;
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	//�������ƶ�
	public abstract void step();
	//��ȡͼƬ
	public abstract BufferedImage getImage();
	//�ж��Ƿ񻹻���
	public boolean isLife(){
		return state==LIFE;
	}
	//�ж��Ƿ�����
	public boolean isDead(){
		return state==DEAD;
	}
	//�ж��Ƿ�ɾ�� 
	public boolean isRemove(){
		return state==REMOVE;
	}
	//���ʻ�����ͼƬ
	public void paintObject(Graphics g){
		g.drawImage(getImage(), x, y, null);
	}
	//���������Ƿ�Խ��
	public abstract boolean OutOfBounds();
	//��ײ����
	public boolean hit(FlyingObject other){
		int x1=this.x-other.width;
		int x2=this.x+this.width;
		int y1=this.y-other.height;
		int y2=this.y+this.height;
		int x=other.x;
		int y=other.y;
		return x>=x1&&x<=x2&&y>=y1&&y<=y2;//��ײΪtrue
	}
	//��������
	public void goDead(){
		state=DEAD;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
