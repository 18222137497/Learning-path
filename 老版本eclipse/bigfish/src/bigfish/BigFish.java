package bigfish;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


//��
public class BigFish {
	/**
	 * ���л���ʶ
	 * @param args
	 */
	BufferedImage image;//��ȡimage������ͼƬ
	int x,y,width,height;//���꣬����
	int speed;//�ٶ�
	BufferedImage[]images;//���췽��
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
	//������ζ���ʽ
	int index = 0;//ѭ���±�
	int count = 0;//����
	public void move(){
		image = images[index++ % images.length];//�����鳤��ȡ�࣬���Ա�֤�±겻Խ��
		x = x -speed;
		if(x<=-width/2){
			x=600 + width/2;
			y=(int)(Math.random()*500);
		}
	}//������
	
	
	public static void main(String[] args) {

	}

}
