package file;

import java.io.File;
import java.io.IOException;

public class File����ɾ�����ܵķ��� {
/*
	boolean createNewFile() ���ҽ������и����Ƶ��ļ��в�����ʱ��ԭ�ӵش���һ���ɸó���·�����������µĿ��ļ��� 
	boolean delete() ɾ���ɴ˳���·������ʾ���ļ���Ŀ¼��    ��ɾ�����߻���վ������������������
	boolean mkdir() �����ɴ˳���·����������Ŀ¼��   �����������ļ��С�
	boolean mkdirs() �����ɴ˳���·����������Ŀ¼�������κα��赫�����ڵĸ�Ŀ¼��	�������༶�ļ��С� 
 */
	public static void main(String[] args) {
	File f=new File("C:\\Users\\123\\Desktop\\�ļ�����\\a.txt");
	/*boolean createNewFile()�������ɹ�����true��ʧ�ܷ���false*/
	try {
		System.out.println(f.createNewFile());
	} catch (IOException e) {
		e.printStackTrace();
	}
	/*boolean delete() ɾ���ɴ˳���·������ʾ���ļ���Ŀ¼,ɾ���ɹ�����true��ɾ��ʧ��false*/
	//System.out.println(f.delete());
	/*boolean mkdir()*/
	File a=new File("C:\\Users\\123\\Desktop\\�ļ�����\\�µ��ļ���");
	System.out.println(a.mkdir());
	/*boolean mkdirs() �����༶�ļ���*/
	File b=new File("C:\\Users\\123\\Desktop\\�ļ�����\\�µ��ļ���\\�µ��ļ���\\�µ��ļ���");
	System.out.println(b.mkdirs());
	System.out.println(b.delete());//ɾ����ײ��һ���ļ���
	System.out.println(a.delete());//��Ϊ�ļ��������ļ�����ɾ����
}
}
