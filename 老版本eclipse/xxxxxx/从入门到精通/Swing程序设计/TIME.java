package Swing�������;

import java.util.Date;

public class TIME {
	public static void main(String[] args) {
		Date date = new Date();//ʱ��
		String str=String.format("%tF",date);
		
		System.out.println(str);
		
		String year=String.format("%tY",date);
		String month=String.format("%tB",date);
		String day=String.format("%td", date);
		
		System.out.print(year+"��");
		System.out.print(month+"��");
		System.out.print(day+"��");
		
		String hour=String.format("%tH",date);
		String minute=String.format("%tM", date);
		String second=String.format("%tS", date);
		
		System.out.print(hour+"��");
		System.out.print(minute+"��");
		System.out.print(second+"��");

	}

}
