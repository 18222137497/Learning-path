package day06;

public class ForDemo {

	public static void main(String[] args) {
	
		
		int b=0;
		for(int a=1;a<=100;a++){
			if(b+a==3){
				continue;
			}else{
				b+=a;
			}
			
		}
	System.out.println("b="+b);
		
	}

}























