package ת�ֽ����ļ�;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ���ֽ����ļ�������ַ��ļ�
 * @author 123
 *
 */
public class IOtoString {
	public static void main(String[] args) {
		File f=new File("C:\\Users\\123\\Desktop\\�ļ�����\\CMD����ָʾ��\\�ػ�.bat");
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
