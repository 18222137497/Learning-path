package Function;

import java.util.ArrayList;
import java.util.function.Predicate;

public class ��Ϣɸѡ {
	public static void main(String[] args) {
		String[] arr = { "�����Ȱ�,Ů", "��������,Ů", "�������,��" };
		for (String s : SX(arr, (String s) -> s.split(",")[0].length() == 4,
				(String s) -> s.split(",")[1].contains("Ů"))) {
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