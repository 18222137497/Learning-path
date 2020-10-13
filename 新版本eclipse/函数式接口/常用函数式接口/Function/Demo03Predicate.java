package Function;

import java.util.function.Predicate;

/*
 * java.util.function.Predicate<T>�ӿ�
 * ���ã���ĳ���������͵����ݽ����жϣ��������һ������ֵ
 * 	�ӿ��е�һ�����󷽷���
 * 		boolean test(T t)
 * 				���Ϸ���true
 *  			�����Ϸ���false
 *  �ӿ��е�һ��Ĭ�Ϸ�����
 *  	p1.and(p2).test(T t);
 *  	�൱��&&,ͬʱ���㷵��true
 *  �ӿ��е���һ��Ĭ�Ϸ�����
 *  	p1.or(p2).test(T t);
 *  	�൱��||,ͬʱ�����㷵��false            ����Ͳ�����ʵ���ˣ�
 *  �ӿ��е����һ��Ĭ�Ϸ���:
 *  	p1.negate().test(T t);
 *  	�൱��!,���Ƿǵ���˼��������ͷ���true
 */
public class Demo03Predicate {
	public static void main(String[] args) {
		String ar="abcdfe";
		System.out.println(TestPredicate(ar, (str)->str.length()>=6));
		//str.contains("a")    �жϳ��ȴ���2�Ұ����ַ���"a"
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
