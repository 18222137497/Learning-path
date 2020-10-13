package star;//声明包star

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 满天星
 * @author 123
 *
 */
public class Star {//声明类Star

	/*
	 * 案例：满天星
	 * 1.创建窗口
	 *   JFrame frame = new JFrame(); = int a=5；
	 *   //设置属性
	 * 2.创建面板
	 *   MYpane extends JPanel
	 *    
	 * 3.绘制界面
	 *    public void paint(Graphics g){
	 *        //逻辑
	 * 4.添加定时器
	 *    Timer timer = new timer();
	 *    timer.schedule
	 * 
	 * 5.添加交互事件
	 *    鼠标事件
	 *        addMouseListeren();
	 *    键盘事件：
	 *        addKeyListener();        
	 */
	
	
	public static Dimension dd = Toolkit.getDefaultToolkit().getScreenSize();
	//添加属性用于获得屏幕尺寸
	public static void main(String[] args) {//程序的入口方法
		JFrame frame = new JFrame();//创建窗口
		MYpane pane = new MYpane();//创建面板对象并添加到窗体中
	    frame.add(pane);
	    pane.action();
	    //添加一个尺寸
	    frame.setSize(dd.width, dd.height);
	    
	    frame.setUndecorated(false);//去掉窗口的边框
	    frame.setVisible(true);//设置窗口的显示
	    
	    MouseAdapter ma = new MouseAdapter(){
	    	public void mousePressed(MouseEvent e){
	    		
	    		System.out.println("鼠标点击了");
	    		int type=e.getButton();
	    		if(type==1){
	    			System.exit(0);
	    			
	    		}
	    		
	    	}	
	    	
	    
	    };
	    		frame.addMouseListener(ma);
	    		
	    	KeyAdapter ka = new KeyAdapter(){
	    		public void keyPressed(KeyEvent e){
	    			System.out.println("按空格键退出");
	    			int key=e.getKeyCode();
	    			if(key==KeyEvent.VK_SPACE);
	    			System.exit(0);
	    		}
	    	};
			frame.addKeyListener(ka);
	    	   		
	    //添加鼠标监听事件
//	    MouseAdapter ma = new MouseAdapter(){//创建事件对象
//	    	public void mousePressed(MouseEvent e){
//	    		//当鼠标按下的时候执行的动作
//	    		
//	    		System.out.println("鼠标点击了");
//	    		int type=e.getButton();//通过type的值判断单击了那个键
//	    		if(type==3){
//	    			//1表示左键
//	    			//退出程序
//	    			System.exit(0);
//	    		}
//	    		
//	    	}
//	    	
//	    };
//	    frame.addMouseListener(ma);
//    	
//	    //添加键盘监听事件
//	    KeyAdapter ka=new KeyAdapter(){
//	    	public void keyPressed(KeyEvent e){
//	    		//获取键对应的值
//	    		int key=e.getKeyCode();
//	    		System.out.println("ESC");
//	    		if(key==KeyEvent.VK_SPACE){
//	    			System.exit(0);
//	    		}
//	    	}
//	    };
//	frame.addKeyListener(ka);
	}
	}
/**
 * 通过继承使我们自定义的类具有面板功能
 * 
 */
class MYpane extends JPanel{
		//定义数组，用于存储星星的坐标
	int[] x = new int[100];
	int[] y = new int[100];
	//构造方法,与类同名，不能有返回值
	public MYpane(){
		setBackground(Color.BLACK);//设置背景色 为黑色
		//System.out.println("before:"+Arrays.toString(x));
		for(int i=0;i<x.length;i++){//设定随机数 生成坐标
			x[i]=(int)(Math.random()*Star.dd.width);
			y[i]=(int)(Math.random()*Star.dd.height);
		}
		//System.out.println("after:"+Arrays.toString(x));
		
		
		
	}
	
	public void paint(Graphics g){//绘制方法
		super.paint(g);//调用父类的paint()的方法
		//画月亮
		g.setColor(Color.red);//使用将画笔颜色设置为白色
		g.fillOval(1600, 100, 100, 100);//填充两个交互的圆
		g.setColor(Color.black);//将画笔颜色设置为黑色
		g.fillOval(1570, 100, 100, 100);//填充另一个交互圆
		
		//画星星
		//使用到坐标
		//100个星星，使用循环生成坐标，存储在数组当中
		//通过循环画一百个星星
		for(int i=0;i<x.length;i++){
			int size=(int)(Math.random()*50);//字体大小
			//构建字体
			//字体使用new Font（字体名称，字体样式，字体大小）
			g.setFont(new Font(Font.SANS_SERIF,Font.BOLD,size));
			//设置颜色
		    //new Color(255*255*255)
			g.setColor(new Color((int)(Math.random()*0xFFFFFF)));
			g.drawString("(^@^)", x[i], y[i]);
			
		}
	}
	//定义一个定时器
	Timer timer=new Timer();
	public void action(){
		timer.schedule(
				
				//定义任务
				new TimerTask(){
					public void run(){
						repaint();
						
					}
				}
				,500,500);
	}
	
	
}	
	
		
	
