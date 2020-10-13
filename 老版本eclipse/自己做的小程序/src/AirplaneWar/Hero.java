package AirplaneWar;

import java.awt.image.BufferedImage;

public class Hero extends FlyingObject{
	//����ͼƬ��
	private static BufferedImage[] images;
	//��̬��������ͼƬ
	static{
		images=new BufferedImage[2];
		for (int i = 0; i < images.length; i++) {
			images[i]=loadImage("hero"+i+".png");
		}
	}
	//��������ֵ
	private int  life;
	//����˫������
	private int doubleFire;
	//���췽��
	public Hero(){
		super(97,124,150,400);
		life=3;
		doubleFire=0;
	}
	//xy���� ���У�ʹ��xy=���xy
	public void moveTo(int x,int y){
		//������xy�����ƶ���ͼƬ�м�
		this.x=x-this.width/2;
		this.y=y-this.height/2;
	}
	//Ӣ�ۻ����ƶ�
	@Override
	public void step() {
	}
	//������ŵ��±�
	int index=0;
	//��ȡӢ�ۻ�ͼƬ
	@Override
	public BufferedImage getImage() {
		if (isLife()) {
			return images[index++%2];
		}
		return null;
	}
	//Ӣ�ۻ������ӵ����㷨
	public Bullet[] shoot(){
		//����1/6Ӣ�ۻ��Ŀ�
		int xStep=this.width/6;
		int yStep=20;//�̶��ӵ�yλ��
		if (doubleFire>0) {
			Bullet[] bs=new Bullet[5];
			bs[0]=new Bullet(this.x+1*xStep,this.y-yStep);
			bs[1]=new Bullet(this.x+2*xStep,this.y-yStep);
			bs[2]=new Bullet(this.x+3*xStep,this.y-yStep);
			bs[3]=new Bullet(this.x+4*xStep,this.y-yStep);
			bs[4]=new Bullet(this.x+5*xStep,this.y-yStep);
			//Ӣ�ۻ�ÿ����һ��˫���ӵ���������2����ʱ
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
	/*Ӣ�ۻ����з���*/
	//Ӣ�ۻ���������
	public void addLife(){
		life++;
	}
	//Ӣ�ۻ���������
	public void subractLife(){
		life--;
	}
	//��ȡӢ�ۻ�����ֵ
	public int getLife(){
		return life;
	}
	//Ӣ�ۻ����ӻ���
	public void addDoubleFire(){
		doubleFire+=40;
	}
	//Ӣ�ۻ����ٻ���ֵ
	public void clearDoubleFire(){
		doubleFire=0;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
