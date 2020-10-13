package IO字节流;

import java.io.FileOutputStream;
import java.io.IOException;

public class 字节输出流的换行和续写 {
	/*
	 * void FileOutputStream(File f,boolean b)//后面是判断开关，true为续写
	 * void FileOutputStream(String s,boolean b)
	 * 换行：
	 * 		windows: \r\n     \n其实也行
	 * 		Linux:	\n
	 * 		mac:	\r
	 */
	public static void main(String[] args) throws IOException {
		FileOutputStream f=new FileOutputStream("C:\\Users\\123\\Desktop\\文件集合\\a.txt",true);
		for (int i = 0; i < 3; i++) {
			f.write("不行".getBytes());
			f.write("\r\n".getBytes());
		}
		f.close();
	}
}
