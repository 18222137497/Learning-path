package cn.tedu.demo;

import java.util.Scanner;

public class Demo {

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
			

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//		System.out.println("������һ������£�����2019-3");
//		Scanner scan=new Scanner(System.in);
//		String input=scan.next();
//		int year=
//				Integer.parseInt(//���ַ���ת������
//						input.substring(0,4 ));//��ȡ���ַ���
//		int month=Integer.parseInt(
//				input.substring(5));
//		switch(month){
//		case 1:
//		case 3:
//		case 5:
//		case 7:
//		case 8:
//		case 10:
//		case 12:
//		    System.out.println(year+"��"+month+"��31��");
//		    break;
//		case 4:
//		case 6:
//		case 9:
//		case 11:
//		System.out.println(year+"��"+month+"��30��");
//		break;
//		case 2:
//		    if(year%4==0&&year%100!=0||year%400==0){
//		    	System.out.println(year+"��"+month+"��29��");
//		    	
//		    	
//		    }else{
//		    	System.out.println(year+"��"+month+"��28��");
//		    	
//		    }
//		break;

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//		System.out.println("������A-E�е�һ����ĸ");
//		Scanner scan=new Scanner(System.in);
//		String data=scan.next();
//		data=data.toUpperCase();//ת�ɴ�д
//		switch(data){
//		case"A":
//			System.out.println("����");
//			break;
//		case"B":
//			System.out.println("����");
//			break;
//		case"C":
//			System.out.println("��");
//			break;
//		case"D":
//			System.out.println("����");
//			break;
//		case"E":
//			System.out.println("������");
//			break;
//		default://?????
//			System.out.println("��������");
//			break;
//			
			
			
			
			
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//		Scanner scan=new Scanner(System.in);
//		System.out.print("�����뵥�ۣ�");
//		int a=scan.nextInt();
//		System.out.print("������������");
//		int b=scan.nextInt();
//		System.out.print("�����븶���");
//		int c=scan.nextInt();
//		int d=a*b;
//		if(c>=d&&d>500){
//			System.out.println("Ӧ�ս�"+b*0.8+" "+"ʵ�գ�"+c+"���㣺"+(c-d*0.8));
//			
//			
//		}else if(c>=d&&d<500){
//			System.out.println("Ӧ�գ�"+d+" "+"ʵ��"+c+" "+"���㣺"+(c-d));
//			
//		
//		}else{
//			System.out.println("��Ǯ������");
//		}
//		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//		System.out.println("��������ֵ���ÿո����");
//		Scanner scan=new Scanner(System.in);
//		int a=scan.nextInt();
//		int b=scan.nextInt();
//		int c=scan.nextInt();
//		if(a<b){
//			int temp=a;
//			a=b;
//			b=temp;
//			
//		}
//		if(a<c){
//			a=a+c;
//			c=a-c;
//			a=a-c;
//			
//		}
//		System.out.println("���ֵ�ǣ�"+a);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Scanner scan=new Scanner(System.in);
//		System.out.print("�����뵱ǰ�¶ȣ�n c/f����");
//		int n=scan.nextInt();
//		char temp=scan.next().trim().charAt(0);
//		//next()�����ַ���                   ��������
//		//trim()ȥ���ַ������ҿո�           ��������
//		//charAt(0)�ǽ��ַ�����һge�ַ�����  ��������
//		if(temp=='c'||temp=='C'){
//			//	F=9C/5+32
//			double result=
//					9*n/5.0+32;
//			//����С������������ɸ�����
//			//������������
//			int data=(int)(result+0.5);//�������룡����������
//			System.out.println("������¶���"+n+"	"+temp);
//			System.out.println("ת����:"+data+"F");
//		}else if(temp=='f'||temp=='F'){
//			double result=5*(n-32)/9.0;
//			int data=(int)(result+0.5);
//			System.out.println("������¶���"+n+"	"+temp);
//			System.out.println("ת����"+data+"C");
//			
//		}else{
//			System.out.println("��������ȷ���¶ȸ�ʽ(n C/F)");
//			
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		byte flight=11;
//		//���㺽��
//		//ÿ����һ���к���
//		String[] data={"����","��һ","�ܶ�","����","����","����","����"};
//		//00001011
//		//��һ ����
//		for(int i=0;i<7;i++){
//			if((flight&(1<<i))!=0){
//				System.out.print(data[i]+"	");
//			
//			}
//			
//		}

		
		
		
		
		
		
		
		
		
		
//		char ch='\u4e00';
//		for(int i=1;i<=20000;i++){//��������
//			System.out.print((char)(ch+i));
//			if(i%50==0){
//			System.out.println("	");
//			}
//		
//		}
//			
//		double b1 =3.0;
//		double b2 =2.5;
//		//�����������ͨ��2��n�η���ʾ���������Ԥ�ڵ�
//		System.out.println(b1-b2);
//		char a='��';
//		a=2000;//ͨ���������壬���ܳ�����Χ
//		a='\u4e00';//ǰ׺��16������
////		int A,b,c;
//		int a1=10,b1=20,c1;
		//�����
	/*	{
			int score=90;
			System.out.println(score);
			//�ӱ�����������������Ž���
		}*/
		//System.out.println(score);
		

	}//������age

}
