package �������Ա����ƪ;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ͳ���ַ�����
 * @author 123
 *
 */
public class StatisticsCharNumber {
	private static String name;
	static{//��̬������������Ǹ��������г�ʼ����ֵ
		name ="��";
		List<String> l=new ArrayList<>();
		l.add(name);
	}
	public StatisticsCharNumber() {	
	}
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		String s=scan.nextLine();
		int Bigchar=0;
		int Smallchar=0;
		int number=0;
		for (int i = 0; i < s.length(); i++) {
			char c=s.charAt(i);
			if (c>='0'&&c<='9') {
				number++;
			}
			if (c>='a'&&c<='z') {
				Smallchar++;
			}
			if (c>='A'&&c<='Z') {
				Bigchar++;
			}
		}
		System.out.println("[Bigchar=" + Bigchar + ", Smallchar=" + Smallchar + ", number=" + number + "]");
		
	}
	
}
