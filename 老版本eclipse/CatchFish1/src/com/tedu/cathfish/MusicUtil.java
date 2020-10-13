package com.tedu.cathfish;

import java.io.File;
import java.io.FileInputStream;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 * ±≥æ∞“Ù¿÷
 * @author 123
 *
 */
public class MusicUtil {
	File file;
	FileInputStream fis;
	AudioStream as;
	boolean flag = true;
	
	public MusicUtil(String name){
		try {
			file = new File(name);
			fis = new FileInputStream(file);
			as = new AudioStream(fis);
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}
	//≤•∑≈
	public void play(long second){
		flag = true;
		int position =(int)file.length();
		as.mark(position);
		Thread t = new Thread(){
			public void run(){
				while(flag){
					AudioPlayer.player.start(as);
					try {
						Thread.sleep(second);
						as.reset();
						
						
					} catch (Exception e) {}
						
					}
				}
			};
			t.start();
		}
	
	//Õ£÷π
	public void stop(){
		flag = false;
		if(as !=null){
			AudioPlayer.player.stop(as);
			
		}
		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		MusicUtil mu = new MusicUtil("xx.wav");
		mu.play(4000);
		Thread.sleep(6000);
		mu.stop();
		

	}

}
