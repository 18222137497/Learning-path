package 集合;
/**
 * 可变参数：是JDK1.5之后出现的新特性
 * 使用前提：
 * 		当方法的参数列表数据类型已经确定，但是参数的个数不确定，就可以使用可变参数
 * 使用格式：
 * 		修饰符 返回值类型 方法名(数据类型... 变量名){}
 * 可变参数原理；
 * 		可变参数底层就是一个数组，根据传递参数个数不同，会创建不同长度的数组，来储存这些参数，传递的参数个数可以是任意个
 * @author 123
 *
 */
public class Text可变参数 {
	public static void main(String[] args) {
		System.out.println(add(10,20,30,40));
	}
	public static int add(int... a) {//这里的底层其实是一个数组
		System.out.println(a);//[I@279f2327
		int arr=0;
		for (int i : a) {//累加求和
			arr+=i;
		}
		return arr;
	}
	/*
	 * 可变参数的注意事项：
	 * 	1.一个方法的参数列表，只能有一个可变参数！！！
	 *  2.如果方法中有多个参数，那么可变参数必须写在参数列表的末尾!!!!
	 */
	public static void mod(String a,int c,double s,char...v) {
		
	}
}
