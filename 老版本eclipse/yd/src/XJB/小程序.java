package XJB;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class С���� {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=1;
		int b=2;
		int c=3;
		int d=4;
		int e=5;
		int f=6;
		boolean q=true;
		for(int k=100000;k>1;k--){
		System.out.println("��ӭ����");
		System.out.println("�����̳�:(������true��false)");
		boolean l=scan.nextBoolean();
		if(l==q){		
		for(int z=100;z>0;z--){
			System.out.println("ѡ����Ʒ�ţ�");
			int y=scan.nextInt();
			if(y==a){
				System.out.println("���޲��ϣ�����Ϊ��100");
				System.out.println("���빺��������");
				int x=scan.nextInt();
				System.out.println("��Ҫ������ǣ����޲���"+x+"��Ƿ��򣺣�������true����false��");			
				boolean o=scan.nextBoolean();
				if(o==q){
					System.out.println("���޲���"+x+"��ܹ�"+x*100+"Ԫ");
					System.out.println("�Ƿ�������򣿣�������true��false��");
					boolean m=scan.nextBoolean();					
				}else{
					System.out.println("���¹���(������true��false)");
					boolean n=scan.nextBoolean();
					if(n==q){
						continue;
					}else{
						break;
					}
				}
			}
				
			
		}
		
		
		
		

	}else{
		break;
		}
		}
		System.out.println("��ӭ�´�������");
	}
	}


