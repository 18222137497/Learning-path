package LX;

import java.sql.Date;
import java.util.Calendar;
import java.util.Scanner;

public class LX1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入生产日期(yyyy-MM-dd):");
		String dd=scan.next();
		Date d=Date.valueOf(dd);
		System.out.println("请输入保质期时长:");
		long l=scan.nextInt();
		Date ddd=new Date(d.getTime()+(l*24*60*60*1000)-(14*24*60*60*1000));
		Calendar c=Calendar.getInstance();
		c.setTime(ddd);
		int i=c.get(Calendar.DAY_OF_WEEK);
		switch (i) {
		case 1: {
			System.out.println("促销日为:"+new Date(ddd.getTime()-(4*24*60*60*1000)));
			break;
		}case 2:{
			System.out.println("促销日为:"+new Date(ddd.getTime()+(2*24*60*60*1000)));
			break;
		}case 3:{
			System.out.println("促销日为:"+new Date(ddd.getTime()+(1*24*60*60*1000)));
			break;
		}case 4:{
			System.out.println("促销日为:"+new Date(ddd.getTime()));
			break;
	    }case 5:{
	    	System.out.println("促销日为:"+new Date(ddd.getTime()-(1*24*60*60*1000)));
	    	break;
	    }case 6:{
	    	System.out.println("促销日为:"+new Date(ddd.getTime()-(2*24*60*60*1000)));
	    	break;
	    }case 7:{
	    	System.out.println("促销日为:"+new Date(ddd.getTime()-(3*24*60*60*1000)));
	    	break;
}
	}
	}
}
