package LX;

import java.sql.Time;
import java.util.Date;

public class LX {

	public static void main(String[] args) {
		P1 p=new P1();
		P2 s=new P2();
		System.out.println(p instanceof P2);
	}
	
}
class P1 extends P2{
	
}
class P2{
	
}
