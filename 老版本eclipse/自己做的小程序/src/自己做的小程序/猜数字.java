package 自己做的小程序;

import java.util.Scanner;

public class 猜数字 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
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

	}

	}
}
