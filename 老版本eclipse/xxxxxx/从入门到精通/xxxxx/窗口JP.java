package xxxxx;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class ´°¿ÚJP extends JPanel implements Runnable{
	int x;
	int y;
	Color c;
	Font f;
	Thread t;
	public ´°¿ÚJP(){
		this.setBackground(Color.black);
		t=new Thread(this);
		t.start();
		c=Factory.Ys(256);
		f=Factory.Zt(65);
		x=Factory.jfwidth;
	}
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(c);
		g.setFont(f);
		g.drawString("*", x, y);	
	}
	public void run() {
		while(true){
			y++;
			if (y>=Factory.jfheight) {
				y=0;
				c=Factory.Ys(256);
				x=Factory.Wz(Factory.jfwidth);
				f=Factory.Zt(65);
			}
			repaint();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		
	}
	
	
	

}
