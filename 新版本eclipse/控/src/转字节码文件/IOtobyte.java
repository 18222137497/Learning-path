package ת�ֽ����ļ�;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * �ļ�����תΪ�ֽ���
 * @author 123
 *
 */
public class IOtobyte {
	public static void main(String[] args) {
		File f=new File("C:\\Users\\123\\Desktop\\�ļ�����\\CMD����ָʾ��\\���޴���.txt");
		FileInputStream fi=null;
		FileOutputStream fo=null;
		try {
			fi=new FileInputStream(f);
			byte[] t=new byte[1024];
			int i=fi.read(t); 
			System.out.println("�ı����ݣ�"+t);
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
