package 字符流;

import java.io.FileWriter;
import java.io.IOException;

public class Writer的方法 {
/*
 * 步骤：
 * 	1.创建FileWriter对象，
 *  2.使用FileWriter中的write方法，把数据写入到内存缓冲区中，(字符转换成字节的过程)   这个和字节流不同!!!!!!!!!!
 *  3.使用flush(刷新)或者close，把内存缓冲区的内容刷新到文件中
 *  4.释放内存
 */
	public static void main(String[] args) throws IOException {
		FileWriter f=new FileWriter("C:\\Users\\123\\Desktop\\文件集合\\a.txt",true);
		f.write(97);
		f.flush();
		f.write(98);
		f.close();
	}
}
