package AirplaneWar;

import java.awt.image.BufferedImage;
import java.util.Random;

public class Box extends FlyingObject implements Award{
	//����ͼƬ��
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
	//���췽��
	public Box(){
		super(60,50);
		xSpeed=1;
		ySpeed=2;
		Random rand=new Random();
		awardType=rand.nextInt(2);
	}
	//��д��������
	@Override
	public int getAwardType() {
		return awardType;
	}
	//���ӵ��ƶ�
	@Override
	public void step() {
		y+=ySpeed;
		x+=xSpeed;
		if (x<=0||x>=Game.WIDTH) {
			xSpeed*=-1;
		}
	}
	//�������˵�С��
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
	//Խ��
	@Override
	public boolean OutOfBounds() {
		return y>=Game.height;
	}
}
