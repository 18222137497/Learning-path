package 自己做的小程序;

import java.util.Scanner;

public class If成绩评定 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入成绩");
		double a=scan.nextDouble();
		if(a>=90){
			System.out.println("A类");
			}else if(a>=80){
				System.out.println("B类");
			}else if(a>=70){
				System.out.println("B类");
			}else if(a>=60){
				System.out.println("C类");
			}else{
				System.out.println("D类");
			}
		}

	}


