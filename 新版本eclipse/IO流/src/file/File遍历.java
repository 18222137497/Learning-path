package file;

import java.io.File;

public class File���� {
	/*
	String[] list() ����һ���ַ������飬�����ɴ˳���·������ʾ��Ŀ¼�е��ļ���Ŀ¼��  
	File[] listFiles() ����һ������·�������飬��ʾ�ɸó���·������ʾ��Ŀ¼�е��ļ��� 
 */
	public static void main(String[] args) {
		File f=new File("C:\\Users\\123\\Desktop\\�ļ�����");
		
		
		for (String arr:f.list()) {
			System.out.println(arr);
		}
		
		
		for (File a : f.listFiles()) {
			System.out.println(a);
		}
		
	}
}
