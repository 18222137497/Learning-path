package �Լ�����С����;

import java.util.Scanner;

public class ����ָ�����ȷ�Χ������ {
	
	public static void generateArray(int length,int range){
		int[] arr=new int[length];//10
		for (int i = 0; i < arr.length; i++) {
			arr[i] =  (int)(Math.random()*range);//100
			 
		}
		
		
	}
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("���������");
		int length=scan.nextInt();//10
		System.out.println("���뷶Χ��");
		int range=scan.nextInt();//100
	     ����ָ�����ȷ�Χ������.generateArray(length, range);//10  100
	}

}
