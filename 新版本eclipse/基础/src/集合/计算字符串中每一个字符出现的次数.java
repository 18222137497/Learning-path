package 集合;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class 计算字符串中每一个字符出现的次数 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("请输入字符串：");
		String a=scan.next();
		HashMap<Character,Integer> h=new HashMap<Character, Integer>();
		for (char c: a.toCharArray()) {//将字符串变成字符数组
			if (h.containsKey(c)) {//判断集合中是否存在这个键        //true
				//key存在
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
