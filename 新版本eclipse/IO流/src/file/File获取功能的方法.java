package file;

import java.io.File;

public class File��ȡ���ܵķ��� {
/*
     String getAbsolutePath() ���ش˳���·�����ġ�����·�������ַ����� 
 	 String getPath() ���˳���·����ת��Ϊ��·�������ַ����� 
 	 String getName() �����ɴ˳���·������ʾ���ļ���Ŀ¼�ġ����ơ��� 
	 long length() �����ɴ˳���·������ʾ���ļ��Ĵ�С�� 
 */
	public static void main(String[] args) {
		P1();
	}
	public static void P1() {
		File f=new File("C:\\Users\\123\\Desktop\\�ļ�����\\a.txt");
		System.out.println(f.getAbsolutePath());//���ؾ���·��
		System.out.println(f.getPath());//����·��
		System.out.println(f.getName());//�����ļ�����
		System.out.println(f.length());//�����ļ���С
	}
	
}
