package 转字节码文件;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 将字节码文件翻译成字符文件
 * @author 123
 *
 */
public class IOtoString {
	public static void main(String[] args) {
		File f=new File("C:\\Users\\123\\Desktop\\文件集合\\CMD命令指示符\\关机.bat");
		FileInputStream fi=null;
		FileOutputStream fo=null;
		try {
			fi=new FileInputStream(f);
			fo=new FileOutputStream(f);
			byte[] b=new byte[1024];
			int i=fi.read(b);
			System.out.println();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
