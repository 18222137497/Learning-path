package ����֪ʶ��;

import java.util.Scanner;

public class String��switch {

	public static void main(String[] args){ 
			System.out.println("������A-E�е�һ����ĸ");
			Scanner scan=new Scanner(System.in);
			String data=scan.next();
			data=data.toUpperCase();//ת�ɴ�д
			switch(data){
			case"A":
				System.out.println("����");
				break;
			case"B":
				System.out.println("����");
				break;
			case"C":
				System.out.println("��");
				break;
			case"D":
				System.out.println("����");
				break;
			case"E":
				System.out.println("������");
				break;
			default://������ǰ������
				System.out.println("��������");
				break;

	}

	}
}
