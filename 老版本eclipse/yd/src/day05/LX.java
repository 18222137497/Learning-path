package day05;

import java.util.Scanner;

public class LX {

	public static void main(String[] args) {
	/*	Scanner scan=new Scanner(System.in);
		int a=(int)(Math.random()*10000+1);
		System.out.println("猜吧");
		int b=scan.nextInt();
		while(b!=a){
			if(b==0){
				break;
			}
			if(b<a){
				System.out.println("太小了");
			}else{
				System.out.println("太大了");
			}
			System.out.println("继续猜！");
			b=scan.nextInt();
		}if(a==b){
			System.out.println("回答正确");
		}
		else{
			System.out.println("怎么可能是0！");

	}*/

		Scanner scan=new Scanner(System.in);
		int a=(int)(Math.random()*10000+1);
		System.out.println(a);
		int b;
		do{
			System.out.println("猜吧");
			b=scan.nextInt();
			if(b==0){
				break;
			}
			if(b>a){
				System.out.println("太大了");
			}else if(b<a){
				System.out.println("太小了");
			}
		}
		while(b!=a);
		if(a==b){
			System.out.println("恭喜你答对了！");
	}else{
		System.out.println("打错了！");
	}
	}
	}

