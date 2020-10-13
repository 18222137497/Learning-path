package bigfish;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


//鱼
public class BigFish {
	/**
	 * 序列化标识
	 * @param args
	 */
	BufferedImage image;//读取image缓冲区图片
	int x,y,width,height;//坐标，长宽
	int speed;//速度
	BufferedImage[]images;//构造方法
	public BigFish(String name){
		
			try {
				images=new BufferedImage[12];
				for(int i=0;i<images.length;i++){
					images[i]=ImageIO.read(
							new File("pic/fish0"+name+i+".png"));
					}
			image=images[0];
			width=image.getWidth();
			height=image.getHeight();
			x=(int)(Math.random()*500);
			y=(int)(Math.random()*550);
			speed=(int)(Math.random()*4)+3;
			}catch (Exception e) {
				e.printStackTrace();
			}
			
		
	}
	//大鱼的游动方式
	int index = 0;//循环下标
	int count = 0;//计数
	public void move(){
		image = images[index++ % images.length];//对数组长度取余，可以保证下标不越界
		x = x -speed;
		if(x<=-width/2){
			x=600 + width/2;
			y=(int)(Math.random()*500);
		}
	}//主方法
	
	
	public static void main(String[] args) {

	}

}
