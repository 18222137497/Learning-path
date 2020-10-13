package API第二部分;

import java.util.Calendar;
import java.util.Date;

/**
 * java.util,Calendar日历 
 * Calendar  抽象类 
 * Calendar类无法直接创建对象，里面有一个静态方法叫getInstance()【使用默认的时区和语言环境获取一个日历】,返回了该类的子类对象
 * 注意：
 * 		西方月份是从0到11月
 * Calendar方法的常用的成员方法：
 * 		public void set(int year, int month, int date)  设置日历字段 YEAR、MONTH 和 DAY_OF_MONTH 的值。
 * 		public int get(int year)  返回给定日历字段的值。
 * 		public abstract void add(int field, int amount)  根据日历的规则，为给定的日历字段添加或减去指定的时间量。
 * 		public Date getTime();  返回一个表示此 Calendar 时间值（从历元至现在的毫秒偏移量）的 Date 对象。
 * 	  int field:日历类的字段，可以使用Calendar类的静态成员变量获取
 * 		public static final int YEAR = 1;	年
 * 		public static final int MONTH = 2;	月
 * 		public static final int DATE = 5;	日
 * 		public static final int DAY_OF_MONTH = 5;	月中的某一天
 * 		public static final int HOUR = 10;		时
 * 		public static final int MINUTE = 12;	分
 * 		public static final int SECOND = 13;	秒
 * 
 * @author 123
 *
 */
public class TextCalendar {
	public static void main(String[] args) {
		Calendar c=Calendar.getInstance();//多态
		Date date=c.getTime();//返回一个Date类型的时间对象
		System.out.println(date);
		c.set(1998, 10, 17);
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.DATE));
		c.add(Calendar.YEAR, -1);
		System.out.println(c.get(Calendar.YEAR));
		
	}

	
}
