package AirplaneWar;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class Music extends Thread{
	public void run(){
		//�����ļ�������
		try {
			FileInputStream fis=new FileInputStream("���Ż�.mp3");
			//��������������
			BufferedInputStream bis=new BufferedInputStream(fis);
			//�������ֲ�����
			Player shootPlayer=new Player(bis);//ǣ�������ⲿ�ܰ�
			shootPlayer.play();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
