package API�ڶ�����;

import java.util.Date;

/**
 * Date��
 * �й��ڶ����� �����Գ�ʼʱ��Ϊ1970-1-1-08:00:00
 * CST�й���
 * һ�������ǧ��֮һ��
 * @author 123
 *
 */
public class TextDate {
	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());//��ȡ1970 1 1 08:00:00�����ڵĺ���ֵ
		demo1();
	}

	private static void demo1() {
		Date d=new Date();
		System.out.println(d);//��д��toString��������ӡ���ǵ�ǰ����
		long l=d.getTime();
		System.out.println(l);//��ȡ��ǰʱ�����ֵ==System.currentTimeMillis();
	}
}
