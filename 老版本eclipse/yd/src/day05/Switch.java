package day05;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("���������룺");
		int a=scan.nextInt();
		switch(a){
		case 10086:
			System.out.println("��ȷ��");
			break;
		case 10085:
			System.out.println("�Ͳ�һ����ˣ�");
			break;
		default:
			System.out.println("����");
			
		}

	}

}
