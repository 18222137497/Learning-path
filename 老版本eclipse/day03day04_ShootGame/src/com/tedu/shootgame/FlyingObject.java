package com.tedu.shootgame;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

/**
 * �����������
 * �����˷��������й������ԡ����췽�����Զ��巽 ��
 * ʹ�÷�����ʵ����ȥ�̳д���
 * ���˱�д�����������ְ����������
 * @author 123
 *
 */
public abstract class FlyingObject {
	/*����������������
	������״̬
	*/
	public static final int LIFE=0;
	//����
	public static final int DEAD=1;
	//ɾ��
	public static final int REMOVE=2;
	//�������ʼ״̬
	public int state =LIFE;

	//������Ŀ��ߣ�x��y����
	protected int width;//��
	protected int height;//��
	protected int x;//x����
	protected int y;//y����
	/*
	 * �ṩ�ض��Ĺ��췽��
	 * ���֣�
	 *  1.Ӣ�ۻ�����ա��ӵ�
	 *  2.��С�л����۷��ṩ
	 */
	
	/*ר��ΪӢ�ۻ�����ӵ��ṩ�Ĺ���ŷ� */
	public FlyingObject(int width,int height,int x,int y){
		this.width=width;
		this.height=height;
		this.x=x;
		this.y=y;
	}
	/*ר��Ϊ��С�л����۷�׼���Ĺ��췽��*/
	public FlyingObject(int width,int height){
		this.width=width;
		this.height=height;
		/*
		 * ���÷�����x���귶Χ�ڳ��ֵ�λ��
		 */
		Random ran=new Random();
		x=ran.nextInt(ShootGame.WIDTH-this.width);
		/*
		 * ���÷������y����
		 * -height 
		 */
		y=-this.height;
		
	}
	/*��ȡͼƬ����*/
	public static BufferedImage loadImage(String fileName){
		try {
			//ͬ����ȡͼƬ
			BufferedImage img=ImageIO.read(FlyingObject.class.getResource(fileName));
			
			return img;
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	/*�������ƶ�*/
	public abstract void step();
	/*��ȡͼƬ*/
	public abstract BufferedImage getImage();
	/*�ж��Ƿ����*/
	public boolean isLife(){
		return state==LIFE;
	}
	/*�ж��Ƿ�����*/
	public boolean isDead(){
		return state==DEAD;	
	}
	/*�ж��Ƿ�ɾ��*/
	public boolean isRemove(){
		return state==REMOVE;
	}
	/*���ʻ�����ͼƬ*/
	public void paintObject(Graphics g){
		g.drawImage(getImage(), x, y, null);
	}
	/*���������Ƿ�Խ��*/
	public abstract boolean OutOfBounds();
	/*��ײ������this_���ˡ�other_�ӵ�/Ӣ�ۻ�*/
	public boolean hit(FlyingObject other){
		//x1����ײ��x��С�߽�
		int x1=this.x-other.width;
		//x2����ײ��x���߽�
		int x2=this.x+this.width;
		//y1����ײ��y��С�߽�
		int y1=this.y-other.height;
		//y2����ײ��y���߽�
		int y2=this.y+this.height;
		//��ȡother-Ӣ�ۻ�/�ӵ���x/y����
		int x=other.x;
		int y=other.y;
		//�����߼����ʽ-�Ƿ���ײ
		return x>=x1&&x<=x2&&y>=y1&&y<=y2;
	}
	/*������ȥ����*/
	public void goDead(){
		state=DEAD;
		/* ��Ȼ�η�����Ŀ����Ϊ���÷������״̬Ϊdead��
		 * ��������ʾ�����ﱻ�Ƴ��ˣ�ֻ��״̬ΪRemove������Żᱻɾ����
		 */
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
