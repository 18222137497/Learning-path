package AirplaneWar;

import java.awt.image.BufferedImage;

/**
 * ��л�-������-���Ե÷�
 * @author 123
 *
 */
public class Enemy extends FlyingObject implements Score{
	//����ͼƬ��
	public static BufferedImage[] images;
	//��̬��������ͼƬ
	static{
		//��ʼ��ͼƬ����
		images=new BufferedImage[5];
		//ѭ����������ͼƬ
		for (int i = 0; i < images.length; i++) {
			images[i]=loadImage("bigplane"+i+".png");
		}
	}
	//������������
	private int speed;
	//���췽��
	public Enemy() {
		super(69,99);
		speed=2;
	}
	//�÷�
	@Override
	public int getScore() {
		return 3;
	}
	//��л��ƶ�
	@Override
	public void step() {
		y+=speed;
	}
	//�������˵��±�
	public int deadIndex=1;
	//��ȡͼƬ
	@Override
	public BufferedImage getImage() {
		//�ж��Ƿ����
		if (isLife()) {
			return images[0];
		}else if(isDead()){//��ը
			BufferedImage img=images[deadIndex++];
			if (deadIndex==images.length) {
				state=REMOVE;
			}
			return img;
		}
		return null;
	}
	//�ж�Խ��
	@Override
	public boolean OutOfBounds() {
		return this.y>=Game.HEIGHT;
	}
	


}
