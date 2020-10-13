package Function;

import java.util.function.Predicate;

/*
 * java.util.function.Predicate<T>接口
 * 作用：对某种数据类型的数据进行判断，结果返回一个布尔值
 * 	接口中的一个抽象方法：
 * 		boolean test(T t)
 * 				符合返回true
 *  			不符合返回false
 *  接口中的一个默认方法：
 *  	p1.and(p2).test(T t);
 *  	相当于&&,同时满足返回true
 *  接口中的另一个默认方法：
 *  	p1.or(p2).test(T t);
 *  	相当于||,同时不满足返回false            这里就不代码实现了！
 *  接口中的最后一个默认方法:
 *  	p1.negate().test(T t);
 *  	相当与!,就是非的意思，不满足就返回true
 */
public class Demo03Predicate {
	public static void main(String[] args) {
		String ar="abcdfe";
		System.out.println(TestPredicate(ar, (str)->str.length()>=6));
		//str.contains("a")    判断长度大于2且包含字符串"a"
		System.out.println(AndTestPredicate(ar, (str)->str.length()>3,(str)->str.contains("a")));
		System.out.println(NegateTestPredicate(ar,(str)->str.length()>3));
	}
	public static boolean TestPredicate(String str,Predicate<String> pre) {//test
		return pre.test(str);
	}
	public static boolean AndTestPredicate(String str,Predicate<String> p1,Predicate<String> p2) {//and
		return p1.and(p2).test(str);
	}
	public static boolean NegateTestPredicate(String str,Predicate<String> pre) {//negate
		return pre.negate().test(str);
	}
	
}
