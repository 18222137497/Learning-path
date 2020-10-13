package T2;

import java.io.File;
import java.io.FileReader;
import java.util.HashMap;

/**
 * 统计一句话中各个字符的个数现有字符串"good good study, day day up."统计其中各个字符出现的次数。
 * 例如：上述字符串中各个字符的出现的次数为：{g=2, u=2, d=5, t=1, s=1, p=1, a=2, o=4, y=3}。
 * 
 * @author 汪京
 *
 */
public class T2 {
	public static void main(String[] args) {
		File f = new File("IOFile\\a.txt");
		Count_Char(f);
	}

	public static void Count_Char(File f) {
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();// 建立hashmap集合用于储存符号及其个数
		try (FileReader fileReader = new FileReader(f)) {// 获取字符输入流(将流放在try后面的括号里,流可以在try catch语句结束后自动关闭)
			char[] c = new char[1];// 设置缓冲区(这里为了方便调用读的字符让流一个一个读)
			while (fileReader.read(c) != -1) {// 一个字符一个字符的读
				if (hashMap.containsKey(new String(c))) {// 判断集合中是否有对应相同的键
					hashMap.put(new String(c), hashMap.get(new String(c)) + 1);// 如果有就将该键对应的值+1
				} else {
					hashMap.put(new String(c), 1);// 如果没有就从1开始计算
				}
			}
			System.out.println(hashMap);// 输出结果
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
