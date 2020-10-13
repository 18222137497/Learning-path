package star;//������star

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
 * ������
 * @author 123
 *
 */
public class Star {//������Star

	/*
	 * ������������
	 * 1.��������
	 *   JFrame frame = new JFrame(); = int a=5��
	 *   //��������
	 * 2.�������
	 *   MYpane extends JPanel
	 *    
	 * 3.���ƽ���
	 *    public void paint(Graphics g){
	 *        //�߼�
	 * 4.��Ӷ�ʱ��
	 *    Timer timer = new timer();
	 *    timer.schedule
	 * 
	 * 5.��ӽ����¼�
	 *    ����¼�
	 *        addMouseListeren();
	 *    �����¼���
	 *        addKeyListener();        
	 */
	
	
	public static Dimension dd = Toolkit.getDefaultToolkit().getScreenSize();
	//����������ڻ����Ļ�ߴ�
	public static void main(String[] args) {//�������ڷ���
		JFrame frame = new JFrame();//��������
		MYpane pane = new MYpane();//������������ӵ�������
	    frame.add(pane);
	    pane.action();
	    //���һ���ߴ�
	    frame.setSize(dd.width, dd.height);
	    
	    frame.setUndecorated(false);//ȥ�����ڵı߿�
	    frame.setVisible(true);//���ô��ڵ���ʾ
	    
	    MouseAdapter ma = new MouseAdapter(){
	    	public void mousePressed(MouseEvent e){
	    		
	    		System.out.println("�������");
	    		int type=e.getButton();
	    		if(type==1){
	    			System.exit(0);
	    			
	    		}
	    		
	    	}	
	    	
	    
	    };
	    		frame.addMouseListener(ma);
	    		
	    	KeyAdapter ka = new KeyAdapter(){
	    		public void keyPressed(KeyEvent e){
	    			System.out.println("���ո���˳�");
	    			int key=e.getKeyCode();
	    			if(key==KeyEvent.VK_SPACE);
	    			System.exit(0);
	    		}
	    	};
			frame.addKeyListener(ka);
	    	   		
	    //����������¼�
//	    MouseAdapter ma = new MouseAdapter(){//�����¼�����
//	    	public void mousePressed(MouseEvent e){
//	    		//����갴�µ�ʱ��ִ�еĶ���
//	    		
//	    		System.out.println("�������");
//	    		int type=e.getButton();//ͨ��type��ֵ�жϵ������Ǹ���
//	    		if(type==3){
//	    			//1��ʾ���
//	    			//�˳�����
//	    			System.exit(0);
//	    		}
//	    		
//	    	}
//	    	
//	    };
//	    frame.addMouseListener(ma);
//    	
//	    //��Ӽ��̼����¼�
//	    KeyAdapter ka=new KeyAdapter(){
//	    	public void keyPressed(KeyEvent e){
//	    		//��ȡ����Ӧ��ֵ
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
 * ͨ���̳�ʹ�����Զ�����������幦��
 * 
 */
class MYpane extends JPanel{
		//�������飬���ڴ洢���ǵ�����
	int[] x = new int[100];
	int[] y = new int[100];
	//���췽��,����ͬ���������з���ֵ
	public MYpane(){
		setBackground(Color.BLACK);//���ñ���ɫ Ϊ��ɫ
		//System.out.println("before:"+Arrays.toString(x));
		for(int i=0;i<x.length;i++){//�趨����� ��������
			x[i]=(int)(Math.random()*Star.dd.width);
			y[i]=(int)(Math.random()*Star.dd.height);
		}
		//System.out.println("after:"+Arrays.toString(x));
		
		
		
	}
	
	public void paint(Graphics g){//���Ʒ���
		super.paint(g);//���ø����paint()�ķ���
		//������
		g.setColor(Color.red);//ʹ�ý�������ɫ����Ϊ��ɫ
		g.fillOval(1600, 100, 100, 100);//�������������Բ
		g.setColor(Color.black);//��������ɫ����Ϊ��ɫ
		g.fillOval(1570, 100, 100, 100);//�����һ������Բ
		
		//������
		//ʹ�õ�����
		//100�����ǣ�ʹ��ѭ���������꣬�洢�����鵱��
		//ͨ��ѭ����һ�ٸ�����
		for(int i=0;i<x.length;i++){
			int size=(int)(Math.random()*50);//�����С
			//��������
			//����ʹ��new Font���������ƣ�������ʽ�������С��
			g.setFont(new Font(Font.SANS_SERIF,Font.BOLD,size));
			//������ɫ
		    //new Color(255*255*255)
			g.setColor(new Color((int)(Math.random()*0xFFFFFF)));
			g.drawString("(^@^)", x[i], y[i]);
			
		}
	}
	//����һ����ʱ��
	Timer timer=new Timer();
	public void action(){
		timer.schedule(
				
				//��������
				new TimerTask(){
					public void run(){
						repaint();
						
					}
				}
				,500,500);
	}
	
	
}	
	
		
	
