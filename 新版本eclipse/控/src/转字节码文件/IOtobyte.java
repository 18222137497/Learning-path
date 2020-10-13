package 转字节码文件;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件内容转为字节码
 * @author 123
 *
 */
public class IOtobyte {
	public static void main(String[] args) {
		File f=new File("C:\\Users\\123\\Desktop\\文件集合\\CMD命令指示符\\无限窗口.txt");
		FileInputStream fi=null;
		FileOutputStream fo=null;
		try {
			fi=new FileInputStream(f);
			byte[] t=new byte[1024];
			int i=fi.read(t); 
			System.out.println("文本内容："+t);
			String a=t.toString();
			byte[] b=a.getBytes();
			System.out.println(a);
			fo=new FileOutputStream(f,false);
			fo.write(t);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (fi!=null) {
				try {
					fi.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
}
