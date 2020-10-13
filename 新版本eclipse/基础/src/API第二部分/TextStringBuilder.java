package API第二部分;
/**
 * java.lang.StringBuilder字符串缓冲区
 * 不像String，StringBuilder没有被final修饰，所以长度是可以改变的
 * 缓冲区的目的就是提高效率
 * StringBuilder初始长度为16个字符   byte[] value=new byte[16];如果超出会自动扩容
 * append方法:
 * 		添加任意类型的数据的字符串形式，并返回当前对象本身
 * @author 123
 *
 */
public class TextStringBuilder {
	public static void main(String[] args) {
		StringBuilder a=new StringBuilder("S");//将字符串变成StringBuilder
		StringBuilder b=a.append(1);//返回源字符串本身，所以新的对象的字符串和源对象字符串的地址值相同，高效
		System.out.println(a);
		System.out.println(a==b);//比较地址值 true
		//使用append方法无需接收返回值
		//可实现链式编程
		a.append("1").append(false).append(2.0).append(1);	
		System.out.println(a);
		System.out.println(a.toString());//将StringBuilder变成String
		
		
	}
}
