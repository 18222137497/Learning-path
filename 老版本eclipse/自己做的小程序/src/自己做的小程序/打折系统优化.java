package �Լ�����С����;

import java.util.Scanner;

public class ����ϵͳ�Ż� {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("�����뵥�ۣ�");
		int a=scan.nextInt();
		System.out.print("������������");
		int b=scan.nextInt();
		System.out.print("�����븶���");
		int c=scan.nextInt();
		int d=a*b;
		if(c>=d&&d>500){
			System.out.println("Ӧ�ս�"+b*0.8+" "+"ʵ�գ�"+c+"���㣺"+(c-d*0.8));
			
			
		}else if(c>=d&&d<500){
			System.out.println("Ӧ�գ�"+d+" "+"ʵ��"+c+" "+"���㣺"+(c-d));
			
		
		}else{
			System.out.println("��Ǯ������");
		}

	}

}
