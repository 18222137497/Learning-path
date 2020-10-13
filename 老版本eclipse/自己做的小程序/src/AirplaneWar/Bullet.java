package AirplaneWar;

import java.awt.image.BufferedImage;

public class Bullet extends FlyingObject{
	//����ͼƬ
	public static BufferedImage image;
	//��̬��������ͼƬ
	static {
		image=loadImage("bullet.png");
	}
	//�����������
	private int speed;
	//���췽��
	public Bullet(int x,int y){
		super(8,14,x,y);
		speed=3;
	}
	//�ӵ����ƶ�
	@Override
	public void step() {
		y-=speed;
	}
	//��ȡ�ӵ�ͼƬ
	@Override
	public BufferedImage getImage() {
		if (isLife()) {
			return image;
		}else if (isDead()) {
			state=REMOVE;
		}
		return null;
	}
	//�����ӵ�Խ��
	@Override
	public boolean OutOfBounds() {
		return y<=-this.height;
	}

}
