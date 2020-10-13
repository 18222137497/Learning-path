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
	 * ���б�ʶ
	 */
	public static final long serialVersionUID = -1010;
	
	/**
	 * ��������
	 * @param args
	 */
	MusicUtil mu;
	
	/**
	 * �����������
	 * @param args
	 */
	int score;
	Fish[] fishs;
	Net net;
	BufferedImage background;//����ͼƬ
	
	
	/**
	 * ���幹�췽��
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
	 * �Զ�������߼�
	 * @param args
	 */
	public void paint(Graphics g){
		//��ͼƬ
		g.drawImage(background,  0, 0, null); 
		//����
		for(int i=0;i<fishs.length;i++){
			Fish f = fishs[i];
			g.drawImage(f.image, f.x-f.width/2, f.y-f.height/2, null);
			
			
		}
		if(net.show){
			g.drawImage(net.image, net.x-net.width/2, net.y-net.height/2, null);
			
			
		}
		g.setColor(Color.RED);//�Ļ�����ɫ
		g.setFont(new Font("",Font.BOLD,25));//������
		g.drawString(score+"",  30,  40);;
	}
	/**
	 * ��꽻��
	 * @param args
	 */
	public void mouseAction(){
		MouseAdapter ma = new MouseAdapter(){
			//����Ƴ�
			public void mouseExited(MouseEvent e){
				net.show = false;
			}
			//�������
            public void mouseEntered(MouseEvent e){
            	net.show = true;
            	
            }
            //��������ƶ�
            public void mouseMoved(MouseEvent e){
            	int x = e.getX();
            	int y = e.getY();
            	net.moveTo(x, y);
            	
            }
            //��갴��
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
	 * ���¶���
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
		 * �������ҵ������
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
	
	
	


