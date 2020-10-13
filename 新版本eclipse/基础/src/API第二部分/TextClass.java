package API第二部分;
/**
 * 包装类
 * Integer Character
 * 自动装箱拆箱：JDK1.5之后出现的新特性
 * @author 123
 *
 */
public class TextClass {
	public static void main(String[] args) {
		//装箱
		Integer a=new Integer(123);
		Integer b=Integer.valueOf(123);//int->Integer类型
		Integer c=Integer.valueOf("123");//字符串->Integer类型
		//拆箱
		a.intValue();//Integer->int
	/*
	 * 基本类型与字符串之间的相互转化
	 * 基本类型->字符串
	 * 		基本类型+""；最简单的方法（工作中常用）！
	 * 		包装类的静态方法:toString(int i);
	 * 		String类的静态方法:valueOf(int i);
	 * 字符串->基本类型 	
	 * 		包装类的静态方法:parseXXX("字符串");
	 */
		int z=0;
		String x=z+"";
		System.out.println(x);
		String y=Integer.toString(z);
		String v="1234";
		int m=Integer.parseInt(v);
		System.out.println(m);
		double n=Double.parseDouble(v);
		System.out.println(n);
		
	}
	
}
