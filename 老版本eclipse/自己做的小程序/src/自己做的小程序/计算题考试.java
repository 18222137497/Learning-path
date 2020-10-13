package 自己做的小程序;

import java.util.Scanner;

//随机加法运算
public class 计算题考试 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=0;
		for(int i=1;i<10;i++){
			int b=(int)(Math.random()*1000+1);
			int c=(int)(Math.random()*1000+1);
			System.out.println("("+i+")"+b+"+"+c+"=");
			System.out.print("请输入答案：");
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
