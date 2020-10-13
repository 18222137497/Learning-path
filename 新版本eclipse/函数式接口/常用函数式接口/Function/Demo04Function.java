package Function;

import java.util.function.Function;

/*
 * java.util.function<T,R>�ӿ���������һ�����͵����ݵõ���һ�����͵����ݡ�ǰ��Ϊǰ������������Ϊ��������
 * Function�е�����Ҫ�ĳ��󷽷�Ϊ��
 * 		R apply(T t),����T���͵Ĳ�����ȡ����R�Ľ��
 * 		ʹ�ó������磺
 * 				��String����ת����Integer����
 * Function�е�Ĭ�Ϸ���Ϊ
 * 		R/T/...  f1.AndThen(f2).apply(T t)
 * 
 */
public class Demo04Function {
	public static void main(String[] args) {
		String b="����ӱ,20";
		String a = "123456";
		System.out.println(ApplyFunction(a, (s) -> Integer.parseInt(s)));
		/*��Stringת��IntegerȻ�����ֵ��10000��ת������*/
		System.out.println(AndThenApplyFunction(a,(s)->Integer.parseInt(s)-10000,(s)->String.valueOf(s)));
		System.out.println(FT(b,(s)->b.split(",")[1],(s)->Integer.parseInt(s),(s)->s-2));
	}
	public static Integer ApplyFunction(String s, Function<String, Integer> f) {
		return f.apply(s);
	}
	public static String AndThenApplyFunction(String s, Function<String, Integer> f1, Function<Integer, String> f2) {
		return f1.andThen(f2).apply(s);
	}
	public static Integer FT(String s,Function<String,String> f1,Function<String,Integer> f2,Function<Integer,Integer> f3) {
		return f1.andThen(f2.andThen(f3)).apply(s);
	}
}
