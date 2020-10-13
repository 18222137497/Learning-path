package 自己做的小程序;

public class 两万个汉字 {

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
