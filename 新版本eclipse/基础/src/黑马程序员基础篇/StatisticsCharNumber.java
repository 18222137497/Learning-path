package 黑马程序员基础篇;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 统计字符个数
 * @author 123
 *
 */
public class StatisticsCharNumber {
	private static String name;
	static{//静态代码块的意义就是给变量进行初始化赋值
		name ="我";
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
