package file;

import java.io.File;

public class File�жϹ��ܵķ��� {
/*
	boolean exists() ���Դ˳���·������ʾ�ġ��ļ���Ŀ¼�Ƿ���ڡ��� 
	boolean isDirectory() ���Դ˳���·������ʾ���ļ��Ƿ�ΪĿ¼�� ���Ƿ�Ϊ�ļ��С�
	boolean isFile() ���Դ˳���·������ʾ���ļ����Ƿ�Ϊ��ͨ�ļ����� 
 */
	public static void main(String[] args) {
		File f=new File("C:\\Users\\123\\Desktop\\�ļ�����\\a.txt");
		System.out.println(f.exists());//�ļ����ļ����Ƿ����
		System.out.println(f.isDirectory());//�Ƿ�Ϊ�ļ���
		System.out.println(f.isFile());//�Ƿ�Ϊ�ļ�
	}
}
