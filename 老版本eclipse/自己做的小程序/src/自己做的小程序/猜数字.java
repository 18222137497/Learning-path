package �Լ�����С����;

import java.util.Scanner;

public class ������ {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
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

	}

	}
}
