package day06;

import java.util.Scanner;

//����ӷ�����
public class Addition {

	public static void main(String[] args) {
		System.out.println("�ܹ�10�⣬ÿ��һ�֣�����10��");
		Scanner scan=new Scanner(System.in);
		int a=0;
		for(int i=1;i<10;i++){
			int b=(int)(Math.random()*100);
			int c=(int)(Math.random()*100);
			System.out.print(b+"+"+c+"=");			
			int d=scan.nextInt();
		if(d!=b+c){
			System.out.println("����");
			continue;
		}else{
			System.out.println("��ȷ");
			a++;
		}
		
		}
		System.out.println("�ܷ�Ϊ"+a);

	}

}
