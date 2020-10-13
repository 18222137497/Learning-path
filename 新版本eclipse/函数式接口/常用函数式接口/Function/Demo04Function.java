package Function;

import java.util.function.Function;

/*
 * java.util.function<T,R>接口用来根据一个类型的数据得到另一个类型的数据。前者为前置条件，后者为后置条件
 * Function中的最重要的抽象方法为：
 * 		R apply(T t),根据T类型的参数获取类型R的结果
 * 		使用场景例如：
 * 				将String类型转换成Integer类型
 * Function中的默认方法为
 * 		R/T/...  f1.AndThen(f2).apply(T t)
 * 
 */
public class Demo04Function {
	public static void main(String[] args) {
		String b="赵丽颖,20";
		String a = "123456";
		System.out.println(ApplyFunction(a, (s) -> Integer.parseInt(s)));
		/*将String转成Integer然后给数值减10000再转换回来*/
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
