package ����֪ʶ��;

import java.util.Scanner;

public class �������뼰�ַ���ɾ���ո� {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("�����뵱ǰ�¶ȣ�n c/f����");
		int n=scan.nextInt();
		char temp=scan.next().trim().charAt(0);
		//next()�����ַ���                   ��������
		//trim()ȥ���ַ������ҿո�           ��������
		//charAt(0)�ǽ��ַ�����һge�ַ�����  ��������
		if(temp=='c'||temp=='C'){
			//	F=9C/5+32
			double result=
					9*n/5.0+32;
			//����С������������ɸ�����
			//������������
			int data=(int)(result+0.5);//�������룡����������
			System.out.println("������¶���"+n+"	"+temp);
			System.out.println("ת����:"+data+"F");
		}else if(temp=='f'||temp=='F'){
			double result=5*(n-32)/9.0;
			int data=(int)(result+0.5);
			System.out.println("������¶���"+n+"	"+temp);
			System.out.println("ת����"+data+"C");
			
		}else{
			System.out.println("��������ȷ���¶ȸ�ʽ(n C/F)");
			
		}
		

	}

}
