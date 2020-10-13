package Swing程序设计;

import java.util.Date;

public class TIME {
	public static void main(String[] args) {
		Date date = new Date();//时间
		String str=String.format("%tF",date);
		
		System.out.println(str);
		
		String year=String.format("%tY",date);
		String month=String.format("%tB",date);
		String day=String.format("%td", date);
		
		System.out.print(year+"年");
		System.out.print(month+"月");
		System.out.print(day+"日");
		
		String hour=String.format("%tH",date);
		String minute=String.format("%tM", date);
		String second=String.format("%tS", date);
		
		System.out.print(hour+"点");
		System.out.print(minute+"分");
		System.out.print(second+"秒");

	}

}
