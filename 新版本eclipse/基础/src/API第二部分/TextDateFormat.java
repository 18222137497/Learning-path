package API第二部分;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期格式化类 java.text.DateFormat 抽象类不能创建对象，一般使用其子类
 * 作用：
 * 		格式化（日期————文本），解析（文本————日期）
 * 成员方法：
 * 		String format(Date date) 按照指定的模式，把Date日期转换成对应的字符串形式
 * 		Date parse(String source) 把符合模式的字符串解析为Date日期
 * 	java.text.SimpleDateFormat extends DateFormat
 * 	构造方法：
 * 		SimpleDateFormat(String pattern)
 *  	用给定的模式和默认语言环境的日期格式符号构造 SimpleDateFormat
 *  	参数：
 *  		String pattern:传递指定的模式
 *  	模式：区分大小写
 *  		y	年
 *  		M	月
 *  		d	日
 *  		H	时
 *  		m	分
 *  		s	秒
 *  		S	毫秒
 *  	例："yyyy-MM-dd HH:mm:ss"
 * @author 123
 *
 */
public class TextDateFormat {
	public static void main(String[] args) throws ParseException {
		Date d=new Date();
		SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//时间格式化
		String date=s.format(d);
		System.out.println(date);
		System.out.println(s.parse(date));//时间的解析
		
				
	}
}
