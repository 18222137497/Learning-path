package work;

import java.util.Scanner;

public class HelloWordWangJing {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		while(true){
		System.out.println("��ѡ����Ʒ���ͺţ�1.ˮ��;2.�߲�;3.��ʳ");
		int trade=scan.nextInt();
		switch(trade){
		case 1:
			System.out.println("ˮ���У�1.ƻ��(2.5/��);2.��(3/��);3.����(7/��);4.�������ϼ�");
			int mark=scan.nextInt();
			switch(mark){
			case 1:
				System.out.println("�����빺��������");
				double number=scan.nextDouble();
				System.out.println("��Ҫ�������ƻ��"+number+"���֧��"+number*2.5);
				System.out.println("��֧����");
				double money=scan.nextDouble();
				if(money>=2.5*number){
					if(money==2.5*number){
						System.out.println("Ǯ����");
						
					}else{
						System.out.println("����:"+(money-number*2.5)+"Ԫ");
						
					}
				}else{
					System.out.println("��Ǯ��������"+(number*2.5-money)+"Ԫ");
				}
				break;
			case 2:
				System.out.println("�����빺��������");
				double number1=scan.nextDouble();
				System.out.println("��Ҫ���������"+number1+"���֧��"+number1*3);
				System.out.println("��֧����");
				double money1=scan.nextDouble();
				if(money1>=3*number1){
					if(money1==3*number1){
						System.out.println("Ǯ����");
						
					}else{
						System.out.println("����:"+(money1-number1*3)+"Ԫ");
						
					}
				}else{
					System.out.println("��Ǯ��������"+(number1*3-money1)+"Ԫ");
				}
				break;
			case 3:
				System.out.println("�����빺��������");
				double number2=scan.nextDouble();
				System.out.println("��Ҫ�����������"+number2+"���֧��"+number2*7);
				System.out.println("��֧����");
				double money2=scan.nextDouble();
				if(money2>=7*number2){
					if(money2==7*number2){
						System.out.println("Ǯ����");
						
					}else{
						System.out.println("����:"+(money2-number2*7)+"Ԫ");
						
					}
				}else{
					System.out.println("��Ǯ��������"+(number2*7-money2)+"Ԫ");
				}
				break;
			case 4:
				break;
				
				
				
			}
			break;
		case 2:
			System.out.println("�߲���:1.���ܲ�(1.25/��);2.�ƹ�(1.5/��);3.������(1.0/��);4.������һ��");
			int mark1=scan.nextInt();
			switch(mark1){
			case 1:
				System.out.println("�����빺��������");
				double number=scan.nextDouble();
				System.out.println("��Ҫ������Ǻ��ܲ�"+number+"���֧��"+number*1.25);
				System.out.println("��֧����");
				double money=scan.nextDouble();
				if(money>=1.25*number){
					if(money==2.5*number){
						System.out.println("Ǯ����");
						
					}else{
						System.out.println("����:"+(money-number*1.25)+"Ԫ");
						
					}
				}else{
					System.out.println("��Ǯ��������"+(number*1.25-money)+"Ԫ");
				}
				break;
			case 2:
				System.out.println("�����빺��������");
				double number1=scan.nextDouble();
				System.out.println("��Ҫ������ǻƹ�"+number1+"���֧��"+number1*1.5);
				System.out.println("��֧����");
				double money1=scan.nextDouble();
				if(money1>=1.5*number1){
					if(money1==3*number1){
						System.out.println("Ǯ����");
						
					}else{
						System.out.println("����:"+(money1-number1*1.5)+"Ԫ");
						
					}
				}else{
					System.out.println("��Ǯ��������"+(number1*1.5-money1)+"Ԫ");
				}
				break;
			case 3:
				System.out.println("�����빺��������");
				double number2=scan.nextDouble();
				System.out.println("��Ҫ�������������"+number2+"���֧��"+number2*1);
				System.out.println("��֧����");
				double money2=scan.nextDouble();
				if(money2>=1*number2){
					if(money2==1*number2){
						System.out.println("Ǯ����");
						
					}else{
						System.out.println("����:"+(money2-number2*1)+"Ԫ");
						
					}
				}else{
					System.out.println("��Ǯ��������"+(number2*1-money2)+"Ԫ");
				}
				break;
			case 4:
				break;
				
			
			
			
			
			
			
			
			
		}
			break;
		case 3:
			System.out.println("��ʳ��:1.����(3/��);2.������(1/��);3.�Ӱ�(6/��);4.�������ϼ�");
			int mark3=scan.nextInt();
			switch(mark3){
			case 1:
				System.out.println("�����빺��������");
				double number=scan.nextDouble();
				System.out.println("��Ҫ�����������"+number+"������֧��"+number*3);
				System.out.println("��֧����");
				double money=scan.nextDouble();
				if(money>=3*number){
					if(money==3*number){
						System.out.println("Ǯ����");
						
					}else{
						System.out.println("����:"+(money-number*3)+"Ԫ");
						
					}
				}else{
					System.out.println("��Ǯ��������"+(number*3-money)+"Ԫ");
				}
				break;
			case 2:
				System.out.println("�����빺��������");
				double number1=scan.nextDouble();
				System.out.println("��Ҫ������Ƿ�����"+number1+"������֧��"+number1*1);
				System.out.println("��֧����");
				double money1=scan.nextDouble();
				if(money1>=1*number1){
					if(money1==1*number1){
						System.out.println("Ǯ����");
						
					}else{
						System.out.println("����:"+(money1-number1*1)+"Ԫ");
						
					}
				}else{
					System.out.println("��Ǯ��������"+(number1*1-money1)+"Ԫ");
				}
				break;
			case 3:
				System.out.println("�����빺��������");
				double number2=scan.nextDouble();
				System.out.println("��Ҫ��������Ӱ�"+number2+"������֧��"+number2*6);
				System.out.println("��֧����");
				double money2=scan.nextDouble();
				if(money2>=6*number2){
					if(money2==6*number2){
						System.out.println("Ǯ����");
						
					}else{
						System.out.println("����:"+(money2-number2*6)+"Ԫ");
						
					}
				}else{
					System.out.println("��Ǯ��������"+(number2*6-money2)+"Ԫ");
				}
				break;
			case 4:
				break;
				
			
		}
			break;
		
	}

	}
	}
}
