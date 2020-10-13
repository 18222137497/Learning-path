package Function;

import java.util.ArrayList;
import java.util.function.Predicate;

public class 信息筛选 {
	public static void main(String[] args) {
		String[] arr = { "迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男" };
		for (String s : SX(arr, (String s) -> s.split(",")[0].length() == 4,
				(String s) -> s.split(",")[1].contains("女"))) {
			System.out.println(s);
		}
	}

	public static ArrayList<String> SX(String[] arr, Predicate<String> p1, Predicate<String> p2) {
		ArrayList al = new ArrayList<String>();
		for (String s : arr) {
			boolean b = p1.and(p2).test(s);
			if (b) {
				al.add(s);
			}
		}
		return al;
	}

}