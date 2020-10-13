package Properties属性集;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
/**
 * java.util.Properties extends Hashable<k,v> implements Map<k,v>
 * @author 123
 *
 */
public class 用法 {
	/*
	 * Properties类表示了一个持久的属性集，Properties可保存在流中或从流中加载
	 * 是唯一一个可以和流结合的集合
	 * 	可以使用集合中的store方法，把集中的临时数据，持久化写入到硬盘中储存
	 * 	void store(OutputStream out,String comments);
	 * 	void store(Writer w,String comments); 
	 * 		参数：
	 * 			字符输出流可以写中文，字节不行，后面的comments参数是解释说明保存的文件是干什么用的，
	 * 								不能用中文，因为默认是Unicode编码，一般使用""空字符代替
	 * 	可以使用集合中的load，把硬盘中保存的文件(键值对),读取到集合中使用
	 *  void load(InputStream i);
	 * 	void load(Reader r); 
	 * 		注意：
	 * 			1.储存键值对的文件当中，键与值的默认连接符号可以是=,空格(其他符号)
	 * 			2.储存键值对的文件当中，可以使用#号注释键与值，备注是的不会被读取
	 * 			3.储存键值对的文件当中，键与值默认的都是字符串，所以 不用加""
	 * 	
	 * 	集合的key value都是String类型字符串
	 */
	public static void main(String[] args) throws IOException {
		//P1();
		//P2();
		P3();
	}
	public static void P1() {
		Properties p=new Properties();//和map集合用法差不多，但是泛型默认为String
		p.setProperty("汪京", "18");//等于map.put();
		p.setProperty("汪wowo", "17");
		p.setProperty("owow京", "12");
		Set<String> arr=p.stringPropertyNames();//等于 map.keyset();获取键列表，返回set集合
		for (String s : arr) {
			String ar=p.getProperty(s);//等一map.get();
			System.out.println("key:"+s+" value:"+ar);}
							}
	public static void P2() throws IOException {
		Properties p=new Properties();
		p.setProperty("汪京", "18");
		p.setProperty("汪wowo", "17");
		p.setProperty("owow京", "12");
		FileWriter w=new FileWriter("C:\\Users\\123\\Desktop\\文件集合\\a.txt");
		p.store(w, "111");
//		#111
//		#Sat Mar 14 17:28:51 CST 2020
//		owow京=12
//		汪wowo=17
//		汪京=18
		p.store(new FileOutputStream("C:\\Users\\123\\Desktop\\文件集合\\a.txt"), "222");
//		#222
//		#Sat Mar 14 17:30:35 CST 2020
//		owow\u4EAC=12                                                                                               中文变成乱码
//		\u6C6Awowo=17
//		\u6C6A\u4EAC=18
	}
	public static void P3() throws FileNotFoundException, IOException {
		Properties p=new Properties();
		p.load(new FileInputStream("C:\\Users\\123\\Desktop\\文件集合\\a.txt"));
		Set<String> s=p.stringPropertyNames();//等于 map.keyset();获取键列表，返回set集合
		for (String string : s) {
			String ar=p.getProperty(string);
			System.out.println("key:"+string+"	value:"+ar);
		}
//		key:???	value:17
//		key:?¤§	value:18
//		key:?±?	value:12
	}
}
