package API�ڶ�����;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * ��������˶�����
 * @author 123
 *
 */
public class ZERO {
	public static void main(String[] args) throws ParseException {
		Scanner s=new Scanner(System.in);
		System.out.println("���������գ�(��ʽΪ:yyyy.MM.dd)");
		String a=s.next();
		SimpleDateFormat sd=new SimpleDateFormat("yyyy.MM.dd");
		Date da=sd.parse(a);
		long z=da.getTime();
		Date x=new Date();
		long y=x.getTime();
		long v=y-z;
		ZERO(v);
		
	}
	public static void ZERO(long l) {
		l=l/(24*60*60*1000);
		int i=(int)l;
		System.out.println("���Ѿ�����"+i+"��");
	}
}
