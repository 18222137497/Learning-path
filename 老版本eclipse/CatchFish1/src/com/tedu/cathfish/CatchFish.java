package com.tedu.cathfish;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CatchFish extends JPanel{
	/**
	 * 序列标识
	 */
	public static final long serialVersionUID = -1010;
	
	/**
	 * 背景音乐
	 * @param args
	 */
	MusicUtil mu;
	
	/**
	 * 定义鱼和渔网
	 * @param args
	 */
	int score;
	Fish[] fishs;
	Net net;
	BufferedImage background;//背景图片
	
	
	/**
	 * 定义构造方法
	 * @param args
	 */
	public CatchFish(){
		try {
			mu = new MusicUtil("xx.wav");
			fishs = new Fish[9];
			for(int i = 0;i<fishs.length;i++){
				fishs[i] = new Fish(i+1+"_0");
				net = new Net();
				background = ImageIO.read(new File("./pic/bg.jpg"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 自定义绘制逻辑
	 * @param args
	 */
	public void paint(Graphics g){
		//画图片
		g.drawImage(background,  0, 0, null); 
		//画鱼
		for(int i=0;i<fishs.length;i++){
			Fish f = fishs[i];
			g.drawImage(f.image, f.x-f.width/2, f.y-f.height/2, null);
			
			
		}
		if(net.show){
			g.drawImage(net.image, net.x-net.width/2, net.y-net.height/2, null);
			
			
		}
		g.setColor(Color.RED);//改画笔颜色
		g.setFont(new Font("",Font.BOLD,25));//改字体
		g.drawString(score+"",  30,  40);;
	}
	/**
	 * 鼠标交互
	 * @param args
	 */
	public void mouseAction(){
		MouseAdapter ma = new MouseAdapter(){
			//鼠标移出
			public void mouseExited(MouseEvent e){
				net.show = false;
			}
			//鼠标移入
            public void mouseEntered(MouseEvent e){
            	net.show = true;
            	
            }
            //跟随鼠标移动
            public void mouseMoved(MouseEvent e){
            	int x = e.getX();
            	int y = e.getY();
            	net.moveTo(x, y);
            	
            }
            //鼠标按下
            public void mousePressed(MouseEvent e){
            	for(int i = 0;i<fishs.length;i++){
            		Fish f = fishs[i];
            		if(net.catchFish(f)){
            			f.x = 700 + f.width/2;
            			f.y = (int)(Math.random()*500);
            			score += f.width/2;
            			
            		}
            	}
            }
		};
		this.addMouseListener(ma);
		this.addMouseMotionListener(ma);
	}
	/**
	 * 重新定义
	 * @param args
	 */
		public void actionl(){
			mu.play(30*1000);
			mouseAction();
			Thread t = new Thread(
					new Runnable(){
						@Override
						public void run(){
							while(true){
								for(int i = 0;i<fishs.length;i++){
									Fish f = fishs[i];
									f.move();
								}
								repaint();
								try {
									Thread.sleep(100);
								} catch (Exception e) {}
								}
							}
						
					
						
					}
					
					
					);
			t.start();
		}
		/**
		 * 程序的主业务流程
		 * @param args
		 */
		public void action(){
			mu.play(30*1000);
			mouseAction();
			Timer timer = new Timer();
			TimerTask task = new TimerTask(){
				public void run(){
					for(int i = 0;i<fishs.length;i++){
						Fish f = fishs[i];
						f.move();
						
					}
				repaint();
				}
			};
		timer.schedule(task, 100,100);
		
		}	
		
		
	public static void main(String[] args)throws Exception{
		JFrame frame = new JFrame();
		CatchFish pane = new CatchFish();
		frame.add(pane);
		pane.action();
		frame.setSize(700, 500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
		
	}
	
	
	


