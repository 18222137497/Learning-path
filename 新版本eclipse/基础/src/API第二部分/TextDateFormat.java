package API�ڶ�����;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ���ڸ�ʽ���� java.text.DateFormat �����಻�ܴ�������һ��ʹ��������
 * ���ã�
 * 		��ʽ�������ڡ��������ı������������ı������������ڣ�
 * ��Ա������
 * 		String format(Date date) ����ָ����ģʽ����Date����ת���ɶ�Ӧ���ַ�����ʽ
 * 		Date parse(String source) �ѷ���ģʽ���ַ�������ΪDate����
 * 	java.text.SimpleDateFormat extends DateFormat
 * 	���췽����
 * 		SimpleDateFormat(String pattern)
 *  	�ø�����ģʽ��Ĭ�����Ի��������ڸ�ʽ���Ź��� SimpleDateFormat
 *  	������
 *  		String pattern:����ָ����ģʽ
 *  	ģʽ�����ִ�Сд
 *  		y	��
 *  		M	��
 *  		d	��
 *  		H	ʱ
 *  		m	��
 *  		s	��
 *  		S	����
 *  	����"yyyy-MM-dd HH:mm:ss"
 * @author 123
 *
 */
public class TextDateFormat {
	public static void main(String[] args) throws ParseException {
		Date d=new Date();
		SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//ʱ���ʽ��
		String date=s.format(d);
		System.out.println(date);
		System.out.println(s.parse(date));//ʱ��Ľ���
		
				
	}
}
