package day05;

import java.util.Scanner;

//��������Ϸ
public class ������ {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=(int)(Math.random()*1000+1);//һ��һǧ�������
		System.out.println(num);
		System.out.println("�°ɣ�");
		int guess=scan.nextInt();
		while(guess!=num){
			if(guess==0){
				break;
				
			}
			if(guess>num){
				System.out.println("̫����");
			}else{
				System.out.println("̫С��");
			}
			System.out.println("�°�");
			guess=scan.nextInt();
			}
		if(guess==num){
			System.out.println("��ϲ���¶���");
		}else{
			System.out.println("�´�������");
		}

	}

}
