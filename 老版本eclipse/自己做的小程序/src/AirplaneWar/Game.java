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
 * 主类：上帝类
 * @author 123
 *
 */
public class Game extends JPanel{
	/*定义窗体*/
	//桌面大小
	public static int width=Toolkit.getDefaultToolkit().getScreenSize().width;
	public static int height=Toolkit.getDefaultToolkit().getScreenSize().height;
	//窗口大小
	public static final int WIDTH=400;
	public static final int HEIGHT=700;
	//水平居中
	public static int jframeX=width/2-WIDTH/2;
	public static int jframeY=height/2-HEIGHT/2; 
	/*
	 * 设置游戏状态
	 * 启动 运行 暂停 结束
	 * 默认为启动
	 */
	public static final int START=0;
	public static final int RUNNING=1;
	public static final int PAUSE=2;
	public static final int GAME_OVER=3;
	//设置当前状态
	public int state=START;
	//定义图片集
	public static BufferedImage start;
	//暂停图
	public static BufferedImage pause;
	//结束图
	public static BufferedImage gameOver;
	//使用静态代码块加载图片
	static {
		start=FlyingObject.loadImage("start.png");
		pause=FlyingObject.loadImage("pause.png");
		gameOver=FlyingObject.loadImage("gameover.png");
	}
	//定义实体类
	private BackGround bg=new BackGround();
	private Hero hero=new Hero();
	//大小敌机和蜜蜂
	private FlyingObject[] enemies={};
	private Bullet[] bullets={};
	//生成敌人的核心算法
	public FlyingObject nextOne(){
		//实例化随机数对象
		Random rand=new Random();
		//产生20范围内的随机数
		int type=rand.nextInt(20);
		if (type<4) {
			return new Box();
		}else if (type<12) {
			return new Enemy1();
		}else {
			return new Enemy();
		}
	}
	//定义敌人的入场计时器
	int enterIndex=0;
	//大小敌机和蜜蜂入场
	public void enterAction(){
		enterIndex++;//每十毫秒加一
		if (enterIndex%40==0) {//每0.4秒产生一个飞行物
			//获取敌人对象
			FlyingObject obj=nextOne();
			//数组的扩容
			enemies=Arrays.copyOf(enemies, enemies.length+1);
			//将产生的敌人放在数组中-最后
			enemies[enemies.length-1]=obj;
		}
	}
	//定义子弹入场计时器
	int shootIndex=0;
	//子弹入场-英雄机发射子弹
	public void shootAction(){
		shootIndex++;
		if (shootIndex%30==0) {
			Bullet[] bs=hero.shoot();
			bullets=Arrays.copyOf(bullets, bullets.length+bs.length);
			//数组的追加
			System.arraycopy(bs, 0, bullets, bullets.length-bs.length, bs.length);
		}
	}
	//飞行物的移动
	public void stepAction(){
		//天空移动
		bg.step();
		//英雄机的移动
		hero.step();
		//敌人移动
		for (int i = 0; i < enemies.length; i++) {
			enemies[i].step();
		}
		//子弹移动
		for (int i = 0; i < bullets.length; i++) {
			bullets[i].step();
		}
	}
	//删除越界的飞行物
	public void outOfBoundsAction(){
		//定义没有越界飞行物下标
		int index=0;
		//定义没有越界飞行物数组
		FlyingObject[] enemyLives=new FlyingObject[enemies.length];
        //遍历敌人数组
		for (int i = 0; i < enemies.length; i++) {
			//获取每一个敌人
			FlyingObject f=enemies[i];
			if (!f.OutOfBounds()) {
				//将不越界的敌人存入不越界数组
				enemyLives[index]=f;
				index++;//下标和个数
			}
		}
		//将不越界的敌人数组复制到enemies
		enemies=Arrays.copyOf(enemyLives, index);
		//定义不越界的字典下标
		index=0;
		//不越界的子弹数组
		Bullet[] bulletLives=new Bullet[bullets.length];
		//遍历子弹数组
		for (int i = 0; i < bullets.length; i++) {
			Bullet b=bullets[i];
			if (!b.OutOfBounds()) {
				bulletLives[index]=b;
				index++;
			}
		}
		bullets=Arrays.copyOf(bulletLives, index);
	}
	//定义玩家得分
	int score=0;
	//敌人与子弹碰撞分数
	public void bulletBangAction(){
		//遍历所有子弹
		for (int i = 0; i < bullets.length; i++) {
			//获取每一个子弹
			Bullet b=bullets[i];
			//遍历所有敌人
			for (int j = 0; j < enemies.length; j++) {
				//获取每一个敌人
				FlyingObject f=enemies[j];
				//判断是否碰撞
				if (f.hit(b)&&f.isLife()&&b.isLife()) {
					f.goDead();//敌人去死
					b.goDead();//子弹去死
					//碰撞之后判断类型
					if (f instanceof Score) {
						//将父类型强制转化
						Score en=(Score)f;
						//大小敌机得分
						score +=en.getScore();
					}
					if (f instanceof Award) {
						//将父类型转化
						Award aw=(Award)f;
						//获取到奖励类型
						int type=aw.getAwardType();
						switch (type) {
						case Award.DOUBLE_FIRE:
							//英雄级变双倍火力
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
	//英雄机与敌人碰撞
	public void heroBangAction(){
		//遍历所有敌人
		for (int i = 0; i < enemies.length; i++) {
			FlyingObject f=enemies[i];
			//判断是否撞上
			if (f.hit(hero)&&f.isLife()&&hero.isLife()) {
				f.goDead();
				hero.subractLife();
				hero.clearDoubleFire();
			}
		}
	}
	//检测游戏是否结束
	public void checkGameOverAction(){
		//生命值小于0
		if (hero.getLife()<=0) {
			state=GAME_OVER;
		}
	}
	//启动执行程序
	public void action(){
		//创建监听器对象
		MouseAdapter l=new MouseAdapter(){
			//重写MouseMove方法
			public void mouseMoved(MouseEvent e){
				//运行状态
				if (state==RUNNING) {
					int x=e.getX();
					int y=e.getY();		
					hero.moveTo(x, y);
				}
			}
			//重写鼠标点击事件
			public void mouseClicked(MouseEvent e){
				//根据不同的状态做出不同的处理
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
			//重写鼠标移出事件
			public void mouseExited(MouseEvent e){
				if (state==RUNNING) {
					state=PAUSE;
				}
			}
			//重写鼠标移入事件
			public void mouseEntered(MouseEvent e){
				if (state==PAUSE) {
					state=RUNNING;
				}
			}
		};
		//添加鼠标操作事件
		this.addMouseListener(l);
		//添加鼠标滑动事件			
		this.addMouseMotionListener(l);
		//定义定时器对象
		Timer timer=new Timer();
		int intervel=10;//10ms间隔
		timer.schedule(new TimerTask(){
			//重写定时任务run方法
			public void run(){
				if(state==RUNNING){
					/*大小敌机蜜蜂入场*/
					enterAction();
					/*子弹入场*/
					shootAction();
					/*飞行物移动*/
					shootAction();
					/*删除越界飞行物*/
					outOfBoundsAction();
					/*子弹于敌人碰撞*/
					bulletBangAction();
					/*英雄机与敌人碰撞*/
					heroBangAction();
					/*检测游戏是否结束*/
					checkGameOverAction();
				}
				repaint();
			}
		},intervel,intervel);	
	}
	/*重写判定方法*/
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
		/*画得分本版*/
		g.drawString("SCORE"+score, 10, 25);
		/*画生命值*/
		g.drawString("LIFE"+hero.getLife(), 10,45);
		/*画不用状态下的状态图*/
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
		/*实例化窗体对象*/
		JFrame jf=new JFrame();
		/*设置标题*/
		jf.setTitle("");
		Game gg=new Game();
		jf.add(gg);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		gg.action();
		new Music().start();
	}


}
