package AirplaneWar;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class BackGround extends FlyingObject{
	private static BufferedImage image;
	static {
		image=loadImage("background.png");	
	}
	//������������
	private int speed;
	private int y1;//�ڶ���ͼƬ��������
	//���췽��
	public BackGround(){
		super(Game.WIDTH,Game.HEIGHT,0,0);
		speed=1;
		y1=-this.height;
	}
	//��յ��ƶ�
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
	/*��ȡͼƬ*/
	@Override
	public BufferedImage getImage() {
		return image;
	}
	//��ɾ������
	@Override
	public boolean OutOfBounds() {
		return false;
	}
	/*��дpaintObject����*/
	//��ͼ
	@Override
	public void paintObject(Graphics g) {
		g.drawImage(getImage(), x, y, null);
		g.drawImage(getImage(), x, y1, null);
	}

}
