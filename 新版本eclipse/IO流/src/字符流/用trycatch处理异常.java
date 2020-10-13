package 字符流;

import java.io.FileReader;
import java.io.IOException;

/**
 * 推荐使用jdk7的新特性
 * 将 流实例化在try后面的括号里，这样就不用主动使用close方法释放资源，当trycatch处理完异常之后会自动关闭流释放资源，方便
 * @author 123
 *
 */
public class 用trycatch处理异常 {
	public static void main(String[] args) {
		try(FileReader f=new FileReader("C:\\Users\\123\\Desktop\\文件集合\\a.txt")){//注意这里
			char[] c=new char[1024];
			int len =0;
			while((len=f.read(c))!=-1) {
				System.out.println(new String(c,0,len));
			}
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}
