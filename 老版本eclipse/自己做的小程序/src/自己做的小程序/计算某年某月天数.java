package �Լ�����С����;

import java.util.Scanner;

public class ����ĳ��ĳ������ {

	public static void main(String[] args) {
		System.out.println("������һ������£�����2019-3");
		Scanner scan=new Scanner(System.in);
		String input=scan.next();
		int year=
				Integer.parseInt(//���ַ���ת������
						input.substring(0,4 ));//��ȡ���ַ���
		int month=Integer.parseInt(
				input.substring(5));
		switch(month){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
		    System.out.println(year+"��"+month+"��31��");
		    break;
		case 4:
		case 6:
		case 9:
		case 11:
		System.out.println(year+"��"+month+"��30��");
		break;
		case 2:
		    if(year%4==0&&year%100!=0||year%400==0){
		    	System.out.println(year+"��"+month+"��29��");
		    	
		    	
		    }else{
		    	System.out.println(year+"��"+month+"��28��");
		    	
		    }
		break;
		default://������ǰ������
			System.out.println("��������");
			break;

	}

}
}
