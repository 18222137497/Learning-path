package ����;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class �����ַ�����ÿһ���ַ����ֵĴ��� {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("�������ַ�����");
		String a=scan.next();
		HashMap<Character,Integer> h=new HashMap<Character, Integer>();
		for (char c: a.toCharArray()) {//���ַ�������ַ�����
			if (h.containsKey(c)) {//�жϼ������Ƿ���������        //true
				//key����
				Integer value=h.get(c);
				value++;
				h.put(c, value);
			}else {//false
				h.put(c,1);
			}
		}
		Set<Map.Entry<Character, Integer>> s=h.entrySet();
		for (Map.Entry<Character, Integer> entry : s) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}
