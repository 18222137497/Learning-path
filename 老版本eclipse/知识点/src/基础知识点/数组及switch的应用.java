package ����֪ʶ��;

import java.util.Scanner;

public class ���鼰switch��Ӧ�� {

	public static void main(String[] args) {
		System.out.println("������һ�����֣�1��ʾ���죬2��ʾ���죬3��ʾ���죬4��ʾ����");
		Scanner scan=new Scanner(System.in);
		String[] arr={"����","����","����","����"};
		int index=scan.nextInt();
		switch(arr[index-1]){//�����±��0��ʼ���������3�͵��������еĵ�4λ����Ҫ��һ
		case"����":
			System.out.println("1��3��");
			break;
		case"����":
			System.out.println("4�µ�6��");
			break;
		case"����":
			System.out.println("7�µ�9��");
			break;
		case"����":
			System.out.println("10�µ�12��");
			break;
		default://������ǰ������
			System.out.println("��������");
			break;

	}

}
}
