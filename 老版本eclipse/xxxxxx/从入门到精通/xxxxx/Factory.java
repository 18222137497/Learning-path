package xxxxx;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

public class Factory {
	public static int width=Toolkit.getDefaultToolkit().getScreenSize().width;
	public static int height=Toolkit.getDefaultToolkit().getScreenSize().height;
	public static int jfwidth=400;
	public static int jfheight=600;
	public static int jframeX=width/2-jfwidth/2;
	public static int jframeY=height/2-jfheight/2;	
	
	//���λ��
	public static int Wz(int a){
		int b=(int)(Math.random()*a);
		return b;
	}
	//������������С
	public static Font Zt(int a){
		int b=(int)(Math.random()*a);
		Font c=new Font("����",Font.BOLD,b);
		return c;
	}
	//���������ɫ
	public static Color Ys(int a){
		int R=(int)(Math.random()*a);
		int G=(int)(Math.random()*a);
		int B=(int)(Math.random()*a);
		Color c=new Color(R,G,B);
		return c;
	}

}
