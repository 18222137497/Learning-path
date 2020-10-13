package AirplaneWar;

import java.awt.image.BufferedImage;

public class Enemy1 extends FlyingObject implements Score{
	//∂®“ÂÕº∆¨ºØ
	public static BufferedImage[] images;
	static {
		images=new BufferedImage[5];
		for (int i = 0; i < images.length; i++) {
			images[i]=loadImage("airplane"+i+".png");
		}
	}
	private int speed;
	public Enemy1() {
		super(49,36);
		speed=2;
	}
	@Override
	public int getScore() {
		return 1;
	}
	@Override
	public void step() {
		y+=speed;
	}
	private int deadIndex=0;
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
	@Override
	public boolean OutOfBounds() {
		return this.y>=Game.HEIGHT;
	}

}
