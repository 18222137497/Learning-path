package day05;

import java.util.Scanner;

public class LX {

	public static void main(String[] args) {
	/*	Scanner scan=new Scanner(System.in);
		int a=(int)(Math.random()*10000+1);
		System.out.println("�°�");
		int b=scan.nextInt();
		while(b!=a){
			if(b==0){
				break;
			}
			if(b<a){
				System.out.println("̫С��");
			}else{
				System.out.println("̫����");
			}
			System.out.println("�����£�");
			b=scan.nextInt();
		}if(a==b){
			System.out.println("�ش���ȷ");
		}
		else{
			System.out.println("��ô������0��");

	}*/

		Scanner scan=new Scanner(System.in);
		int a=(int)(Math.random()*10000+1);
		System.out.println(a);
		int b;
		do{
			System.out.println("�°�");
			b=scan.nextInt();
			if(b==0){
				break;
			}
			if(b>a){
				System.out.println("̫����");
			}else if(b<a){
				System.out.println("̫С��");
			}
		}
		while(b!=a);
		if(a==b){
			System.out.println("��ϲ�����ˣ�");
	}else{
		System.out.println("����ˣ�");
	}
	}
	}

