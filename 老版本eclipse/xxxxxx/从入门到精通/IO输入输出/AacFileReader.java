package IO�������;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * �ļ��ַ���
 *  FileReader         FileWriter
 * �ļ��ַ�������	�ļ��ַ������
 * @author 123
 *
 */
public class AacFileReader {
	public static void main(String[] args) {
		File f=new File("E:\\����\\java\\��Ƶ\\2�ڶ�ƪ ���ļ���\\6��ʮ���� IO�������\\word.txt");
		/*
		 * �ļ��ַ������
		 */
		FileWriter w=null;
		try {
			w=new FileWriter(f,true);
			String arr="�������ɼ���賿�ĵ�������𣿣���";
			w.write(arr);//��Ϊ���ַ�����������Կ���ֱ�Ӵ��ַ���
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if (w!=null) {
					w.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		/*
		 * �ļ��ַ�������
		 */
		FileReader r=null;
		try {
			r=new FileReader(f);
			 char ch[]=new char[1024];//�����ַ�������
			 int count;//�Ѷ������ַ���
			 while ((count=r.read(ch))!=-1) {//ѭ����ȡ�ļ��е�����֪���ַ�������
				 System.out.println("�ļ�����Ϊ��"+new String(ch,0,count));//ȥ�ո�
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
		e.printStackTrace();
		}finally {
			if (r!=null) {
				try {
					r.close();//�ر�
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
