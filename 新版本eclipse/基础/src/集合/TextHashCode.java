package 集合;
/**
 * 哈希值：是一个十进制整数，由系统随机给出(就是对象的地址值，是一个逻辑地址，是模拟出来的地址，不是数据实际储存的物理地址)
 * 	在Object类中有一个方法可以获取对象的哈希值
 * 	public native int hashCode();//返回此对象得哈希值
 * 	native:代表该方法调用的是本地操作系统的方法
 * @author 123
 *
 */
public class TextHashCode {
	public static void main(String[] args) {
		Person p1=new Person();
		Person p2=new Person();
		Person p3=new Person();
		System.out.println(p1.hashCode());//804564176
		System.out.println(p2.hashCode());//1421795058
		System.out.println(p3.hashCode());//1555009629
		/*
		 * toString 的源码：
		 * 		public String toString() {
		 * 		return getClass().getName() + "@" + Integer.toHexString(hashCode());}
		 */
		System.out.println(p1);//集合.Person@2ff4acd0
		System.out.println(p2);//集合.Person@54bedef2
		/*
		 * String的hashCode方法（重写）
		 */
		String s1=new String("abc");
		String s2=new String("abc");
		System.out.println(s1.hashCode());//1179395
		System.out.println(s2.hashCode());//1179395
		
		/*！特殊！*/
		System.out.println("重地".hashCode());//1179395
		System.out.println("通话".hashCode());//1179395
	}
}
class Person{
	
}