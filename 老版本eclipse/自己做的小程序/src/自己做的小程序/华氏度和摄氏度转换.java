package �Լ�����С����;

import java.util.Scanner;

public class ���϶Ⱥ����϶�ת�� {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("�������¶ȣ�n C/F��");
		int n=scan.nextInt();
		char a=scan.next().trim().charAt(0);
		if(a=='c'||a=='C'){
			double b=9*n/5.0+32;
			int c=(int)(b+0.5);
			System.out.println("��������ǣ�"+n+"	"+a);
			System.out.println("ת����"+c+"F");
			
		}else if(a=='f'||a=='F'){
			double b=5*(n-32)/9.0;
			int c=(int)(b+0.5);
			System.out.println("��������ǣ�"+n+"	"+a);
			System.out.println("ת����"+c+"C");
			
		}else{
			System.out.println("ע���ʽ��");
		}

	}

}
