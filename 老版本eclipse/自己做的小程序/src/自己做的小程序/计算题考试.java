package �Լ�����С����;

import java.util.Scanner;

//����ӷ�����
public class �����⿼�� {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=0;
		for(int i=1;i<10;i++){
			int b=(int)(Math.random()*1000+1);
			int c=(int)(Math.random()*1000+1);
			System.out.println("("+i+")"+b+"+"+c+"=");
			System.out.print("������𰸣�");
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
