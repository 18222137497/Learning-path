package AirplaneWar;

import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.util.Arrays;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * ���ࣺ�ϵ���
 * @author 123
 *
 */
public class Game extends JPanel{
	/*���崰��*/
	//�����С
	public static int width=Toolkit.getDefaultToolkit().getScreenSize().width;
	public static int height=Toolkit.getDefaultToolkit().getScreenSize().height;
	//���ڴ�С
	public static final int WIDTH=400;
	public static final int HEIGHT=700;
	//ˮƽ����
	public static int jframeX=width/2-WIDTH/2;
	public static int jframeY=height/2-HEIGHT/2; 
	/*
	 * ������Ϸ״̬
	 * ���� ���� ��ͣ ����
	 * Ĭ��Ϊ����
	 */
	public static final int START=0;
	public static final int RUNNING=1;
	public static final int PAUSE=2;
	public static final int GAME_OVER=3;
	//���õ�ǰ״̬
	public int state=START;
	//����ͼƬ��
	public static BufferedImage start;
	//��ͣͼ
	public static BufferedImage pause;
	//����ͼ
	public static BufferedImage gameOver;
	//ʹ�þ�̬��������ͼƬ
	static {
		start=FlyingObject.loadImage("start.png");
		pause=FlyingObject.loadImage("pause.png");
		gameOver=FlyingObject.loadImage("gameover.png");
	}
	//����ʵ����
	private BackGround bg=new BackGround();
	private Hero hero=new Hero();
	//��С�л����۷�
	private FlyingObject[] enemies={};
	private Bullet[] bullets={};
	//���ɵ��˵ĺ����㷨
	public FlyingObject nextOne(){
		//ʵ�������������
		Random rand=new Random();
		//����20��Χ�ڵ������
		int type=rand.nextInt(20);
		if (type<4) {
			return new Box();
		}else if (type<12) {
			return new Enemy1();
		}else {
			return new Enemy();
		}
	}
	//������˵��볡��ʱ��
	int enterIndex=0;
	//��С�л����۷��볡
	public void enterAction(){
		enterIndex++;//ÿʮ�����һ
		if (enterIndex%40==0) {//ÿ0.4�����һ��������
			//��ȡ���˶���
			FlyingObject obj=nextOne();
			//���������
			enemies=Arrays.copyOf(enemies, enemies.length+1);
			//�������ĵ��˷���������-���
			enemies[enemies.length-1]=obj;
		}
	}
	//�����ӵ��볡��ʱ��
	int shootIndex=0;
	//�ӵ��볡-Ӣ�ۻ������ӵ�
	public void shootAction(){
		shootIndex++;
		if (shootIndex%30==0) {
			Bullet[] bs=hero.shoot();
			bullets=Arrays.copyOf(bullets, bullets.length+bs.length);
			//�����׷��
			System.arraycopy(bs, 0, bullets, bullets.length-bs.length, bs.length);
		}
	}
	//��������ƶ�
	public void stepAction(){
		//����ƶ�
		bg.step();
		//Ӣ�ۻ����ƶ�
		hero.step();
		//�����ƶ�
		for (int i = 0; i < enemies.length; i++) {
			enemies[i].step();
		}
		//�ӵ��ƶ�
		for (int i = 0; i < bullets.length; i++) {
			bullets[i].step();
		}
	}
	//ɾ��Խ��ķ�����
	public void outOfBoundsAction(){
		//����û��Խ��������±�
		int index=0;
		//����û��Խ�����������
		FlyingObject[] enemyLives=new FlyingObject[enemies.length];
        //������������
		for (int i = 0; i < enemies.length; i++) {
			//��ȡÿһ������
			FlyingObject f=enemies[i];
			if (!f.OutOfBounds()) {
				//����Խ��ĵ��˴��벻Խ������
				enemyLives[index]=f;
				index++;//�±�͸���
			}
		}
		//����Խ��ĵ������鸴�Ƶ�enemies
		enemies=Arrays.copyOf(enemyLives, index);
		//���岻Խ����ֵ��±�
		index=0;
		//��Խ����ӵ�����
		Bullet[] bulletLives=new Bullet[bullets.length];
		//�����ӵ�����
		for (int i = 0; i < bullets.length; i++) {
			Bullet b=bullets[i];
			if (!b.OutOfBounds()) {
				bulletLives[index]=b;
				index++;
			}
		}
		bullets=Arrays.copyOf(bulletLives, index);
	}
	//������ҵ÷�
	int score=0;
	//�������ӵ���ײ����
	public void bulletBangAction(){
		//���������ӵ�
		for (int i = 0; i < bullets.length; i++) {
			//��ȡÿһ���ӵ�
			Bullet b=bullets[i];
			//�������е���
			for (int j = 0; j < enemies.length; j++) {
				//��ȡÿһ������
				FlyingObject f=enemies[j];
				//�ж��Ƿ���ײ
				if (f.hit(b)&&f.isLife()&&b.isLife()) {
					f.goDead();//����ȥ��
					b.goDead();//�ӵ�ȥ��
					//��ײ֮���ж�����
					if (f instanceof Score) {
						//��������ǿ��ת��
						Score en=(Score)f;
						//��С�л��÷�
						score +=en.getScore();
					}
					if (f instanceof Award) {
						//��������ת��
						Award aw=(Award)f;
						//��ȡ����������
						int type=aw.getAwardType();
						switch (type) {
						case Award.DOUBLE_FIRE:
							//Ӣ�ۼ���˫������
							hero.addDoubleFire();
							break;
						case Award.LIFE:
							hero.addLife();
							break;
						}
					}
				}
			}
			
		}
		
	}
	//Ӣ�ۻ��������ײ
	public void heroBangAction(){
		//�������е���
		for (int i = 0; i < enemies.length; i++) {
			FlyingObject f=enemies[i];
			//�ж��Ƿ�ײ��
			if (f.hit(hero)&&f.isLife()&&hero.isLife()) {
				f.goDead();
				hero.subractLife();
				hero.clearDoubleFire();
			}
		}
	}
	//�����Ϸ�Ƿ����
	public void checkGameOverAction(){
		//����ֵС��0
		if (hero.getLife()<=0) {
			state=GAME_OVER;
		}
	}
	//����ִ�г���
	public void action(){
		//��������������
		MouseAdapter l=new MouseAdapter(){
			//��дMouseMove����
			public void mouseMoved(MouseEvent e){
				//����״̬
				if (state==RUNNING) {
					int x=e.getX();
					int y=e.getY();		
					hero.moveTo(x, y);
				}
			}
			//��д������¼�
			public void mouseClicked(MouseEvent e){
				//���ݲ�ͬ��״̬������ͬ�Ĵ���
				switch (state) {
				case START:
					state=RUNNING;
					break;

				case GAME_OVER:
					score=0;
					bg=new BackGround();
					hero=new Hero();
					enemies=new FlyingObject[0];
					bullets=new Bullet[0];
					state=START;
					break;
				}
			}
			//��д����Ƴ��¼�
			public void mouseExited(MouseEvent e){
				if (state==RUNNING) {
					state=PAUSE;
				}
			}
			//��д��������¼�
			public void mouseEntered(MouseEvent e){
				if (state==PAUSE) {
					state=RUNNING;
				}
			}
		};
		//����������¼�
		this.addMouseListener(l);
		//�����껬���¼�			
		this.addMouseMotionListener(l);
		//���嶨ʱ������
		Timer timer=new Timer();
		int intervel=10;//10ms���
		timer.schedule(new TimerTask(){
			//��д��ʱ����run����
			public void run(){
				if(state==RUNNING){
					/*��С�л��۷��볡*/
					enterAction();
					/*�ӵ��볡*/
					shootAction();
					/*�������ƶ�*/
					shootAction();
					/*ɾ��Խ�������*/
					outOfBoundsAction();
					/*�ӵ��ڵ�����ײ*/
					bulletBangAction();
					/*Ӣ�ۻ��������ײ*/
					heroBangAction();
					/*�����Ϸ�Ƿ����*/
					checkGameOverAction();
				}
				repaint();
			}
		},intervel,intervel);	
	}
	/*��д�ж�����*/
	@Override
	public void paint(Graphics g){
		bg.paintObject(g);
		hero.paintObject(g);
		for (int i = 0; i < enemies.length; i++) {
			enemies[i].paintObject(g);
		}
		for (int i = 0; i < bullets.length; i++) {
			bullets[i].paintObject(g);
		}
		/*���÷ֱ���*/
		g.drawString("SCORE"+score, 10, 25);
		/*������ֵ*/
		g.drawString("LIFE"+hero.getLife(), 10,45);
		/*������״̬�µ�״̬ͼ*/
		switch (state) {
		case START:
			g.drawImage(start, 0, 0, null);
			break;
		case PAUSE:
			g.drawImage(pause, 0, 0, null);
			break;
		case GAME_OVER:
			g.drawImage(gameOver, 0, 0, null);
			break;
		}
	}
	public static void main(String[] args) {
		/*ʵ�����������*/
		JFrame jf=new JFrame();
		/*���ñ���*/
		jf.setTitle("");
		Game gg=new Game();
		jf.add(gg);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		gg.action();
		new Music().start();
	}


}
