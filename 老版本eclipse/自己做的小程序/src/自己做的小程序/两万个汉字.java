package �Լ�����С����;

public class ��������� {

	public static void main(String[] args) {
		char a='\u4e00';
		for(int i=1;i<=20000;i++){
			System.out.print((char)(a+i));
			if(i%50==0){
				System.out.println("	");
			}
				
		}
		

	}

}
