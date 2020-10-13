package AirplaneWar;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class Music extends Thread{
	public void run(){
		//创建文件输入流
		try {
			FileInputStream fis=new FileInputStream("逮吓户.mp3");
			//创建缓冲输入流
			BufferedInputStream bis=new BufferedInputStream(fis);
			//定义音乐播放器
			Player shootPlayer=new Player(bis);//牵扯导入外部架包
			shootPlayer.play();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
