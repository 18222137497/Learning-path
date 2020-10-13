package day06;

import java.util.Scanner;

//随机加法运算
public class Addition {

	public static void main(String[] args) {
		System.out.println("总共10题，每题一分，满分10分");
		Scanner scan=new Scanner(System.in);
		int a=0;
		for(int i=1;i<10;i++){
			int b=(int)(Math.random()*100);
			int c=(int)(Math.random()*100);
			System.out.print(b+"+"+c+"=");			
			int d=scan.nextInt();
		if(d!=b+c){
			System.out.println("错误");
			continue;
		}else{
			System.out.println("正确");
			a++;
		}
		
		}
		System.out.println("总分为"+a);

	}

}
