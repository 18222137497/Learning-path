package �Լ�����С����;

import java.util.Scanner;

public class �ɼ����� {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("������ɼ���");
		double performance=scan.nextDouble();
		if(performance<60){
			System.out.println("���ĳɼ�Ϊ������");
		}else{
			if(performance>=60&&performance<70){
				System.out.println("���ĳɼ�Ϊ����");
			}else{
				if(performance>=70&&performance<80){
					System.out.println("���ĳɼ�Ϊ�еȣ�");
				}else{
					if(performance>=80&&performance<90){
					System.out.println("���ĳɼ�Ϊ���ã�");	
					}else{
						if(performance>=90&&performance<100){
							System.out.println("���ĳɼ�Ϊ���㣡");
						}else{
							if(performance==100){
								System.out.println("ţ�ƣ�");
							}
						}
					}
				}
			}
		}

	}

}
