package star1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.util.Timer;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class StarOne {
public static Dimension dd=Toolkit.getDefaultToolkit().getScreenSize();
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		MYpane pane = new MYpane();
		frame.add(pane);
		pane.action();
		frame.setSize(dd.width, dd.height);
	}

}
/**
 * 通过继承使我们自定义的类具有面板功能	
 * @author 123
 *
 */
class MYpane extends JPanel{
	int[]x=new int[100];
	int[]y=new int[100];
	public MYpane(){
		setBackground(Color.black);
		for(int i=0;i<x.length;i++){
		x[i]=(int)(Math.random()*StarOne.dd.width);
	    y[i]=(int)(Math.random()*StarOne.dd.height);
	     
		}
}
	public void paint(Graphics g){
		super.paint(g);
	    g.setColor(Color.white);
	    g.fillOval(1750, 100, 100, 100);
	    g.setColor(Color.black);
	    g.fillOval(1700, 100, 100, 100);
	    
	}

     Timer timer=new Timer();
    	 
}    
