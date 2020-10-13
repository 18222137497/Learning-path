package day05;

import java.util.Scanner;

//猜数字游戏
public class 猜数字 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=(int)(Math.random()*1000+1);//一到一千的随机数
		System.out.println(num);
		System.out.println("猜吧！");
		int guess=scan.nextInt();
		while(guess!=num){
			if(guess==0){
				break;
				
			}
			if(guess>num){
				System.out.println("太大了");
			}else{
				System.out.println("太小了");
			}
			System.out.println("猜吧");
			guess=scan.nextInt();
			}
		if(guess==num){
			System.out.println("恭喜您猜对了");
		}else{
			System.out.println("下次再来吧");
		}

	}

}
