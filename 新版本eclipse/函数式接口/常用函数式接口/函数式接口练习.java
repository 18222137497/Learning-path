
public class 函数式接口练习 {
	public static void main(String[] args) {
		String a="ababababababababa";
		String b="b";
		String c = sss(new SS() {
			@Override
			public String ss(String arr, String arr1) {
				String replaceAll = a.replaceAll("a", b);
				return replaceAll;
			}
		}, a, b);
		System.out.println(c);
	}
	public static String sss(SS s,String a1,String a2) {
		return s.ss(a1, a2);
	}
}
interface SS{
	public String ss(String arr,String arr1);
}
