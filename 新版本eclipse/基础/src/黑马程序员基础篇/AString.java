package 黑马程序员基础篇;
/**
 * String类
 * @author 123
 *
 */
public class AString {
	public static void main(String[] args) {
		String a="12a4ac6a7e9";
		/*
		 * 将指定字符串连接到该字符串的末尾
		 */
		String a1=a.concat("987654321");//个人认为等于字符串加字符串   a+b
		System.out.println(a1);
		System.out.println(a.charAt(8));//获得字符串指定下标的字符
		System.out.println(a.indexOf("3"));//获取目标在字符串第一次出现的索引,没有返回-1
		System.out.println(a.substring(2,7));//从指定位置截取字符串到字符串指定位置
		/*字符串转换*/
		char[] c=a.toCharArray();//转换为字符数组
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]+" ");
		}
		System.out.println();
		byte[] b=a.getBytes();//转换为字节数组
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println();
		/*将字符串里的字符改为其他字符*/
		String a2=a.replace("a","*");
		System.out.println(a2);
		/*字符串分割*/
		String[] a4=a.split("a");
		for (int i = 0; i < a4.length; i++) {
			System.out.print(a4[i]+" ");
		}
		
}
}
