package file;

import java.io.File;

/**
 * file���ļ�
 * directory���ļ���/Ŀ¼
 * path��·��
 * @author 123
 *
 */
public class FileDemo {

/*
 	static String pathSeparator ��ϵͳ��ص�·���ָ����ַ���Ϊ�����������ʾΪ�ַ�����  
	static char pathSeparatorChar ��ϵͳ��ص�·���ָ�����  
	
	static String separator ��ϵͳ��ص�Ĭ������ - �ָ����ַ����Է���ķ�ʽ��ʾΪ�ַ�����  
	static char separatorChar ��ϵͳ��ص�Ĭ�����Ʒָ�����  

 */
	public static void main(String[] args) {
		String pathSeparator=File.pathSeparator;//·���ָ�� windows:�ֺ�; 	Linux:ð��:
		System.out.println(pathSeparator);
		/*	һ���ļ�·��д��C:\develop\a\a.txt   windows
		 				C:/develop/a/a.txt	 Linux
		 	ͳ���ļ�·��д�� ��: 	"C:"+File.separator+"develop"+File.separator+"a"+File.separator+"a.txt"
		*/
		String Separator=File.separator;//�ļ��ָ�� windows:��б��\ 		Linux:��б��/
		System.out.println(Separator);
		
	}
	
}
