package API�ڶ�����;

import java.util.Calendar;
import java.util.Date;

/**
 * java.util,Calendar���� 
 * Calendar  ������ 
 * Calendar���޷�ֱ�Ӵ�������������һ����̬������getInstance()��ʹ��Ĭ�ϵ�ʱ�������Ի�����ȡһ��������,�����˸�����������
 * ע�⣺
 * 		�����·��Ǵ�0��11��
 * Calendar�����ĳ��õĳ�Ա������
 * 		public void set(int year, int month, int date)  ���������ֶ� YEAR��MONTH �� DAY_OF_MONTH ��ֵ��
 * 		public int get(int year)  ���ظ��������ֶε�ֵ��
 * 		public abstract void add(int field, int amount)  ���������Ĺ���Ϊ�����������ֶ���ӻ��ȥָ����ʱ������
 * 		public Date getTime();  ����һ����ʾ�� Calendar ʱ��ֵ������Ԫ�����ڵĺ���ƫ�������� Date ����
 * 	  int field:��������ֶΣ�����ʹ��Calendar��ľ�̬��Ա������ȡ
 * 		public static final int YEAR = 1;	��
 * 		public static final int MONTH = 2;	��
 * 		public static final int DATE = 5;	��
 * 		public static final int DAY_OF_MONTH = 5;	���е�ĳһ��
 * 		public static final int HOUR = 10;		ʱ
 * 		public static final int MINUTE = 12;	��
 * 		public static final int SECOND = 13;	��
 * 
 * @author 123
 *
 */
public class TextCalendar {
	public static void main(String[] args) {
		Calendar c=Calendar.getInstance();//��̬
		Date date=c.getTime();//����һ��Date���͵�ʱ�����
		System.out.println(date);
		c.set(1998, 10, 17);
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.DATE));
		c.add(Calendar.YEAR, -1);
		System.out.println(c.get(Calendar.YEAR));
		
	}

	
}
