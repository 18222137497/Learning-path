package file;

import java.io.File;

public class File�Ĺ��췽�� {
	/*
	File(String pathname) ͨ����������·�����ַ���ת��Ϊ����·�����������µ� Fileʵ����  
	File(File parent, String child) �Ӹ�����·��������·�����ַ��������µ� Fileʵ����  
	File(String parent, String child) �Ӹ�·�����ַ�������·�����ַ��������µ� Fileʵ����  
	File(URI uri) ͨ���������� file: URIת��Ϊ����·�����������µ� Fileʵ����  
*/
	public static void main(String[] args) {
		//P1();
		P2();
	}
	//File(String pathname) ͨ����������·�����ַ���ת��Ϊ����·�����������µ� Fileʵ����  
	public static void P1(){
		File F=new File("C:\\Users\\123\\Desktop\\�ļ�����\\a.txt");
		System.out.println(F);
	}
	//File(File parent, String child) �Ӹ�����·��������·�����ַ��������µ� Fileʵ����
	//File(String parent, String child) �Ӹ�·�����ַ�������·�����ַ��������µ� Fileʵ����
	public static void P2() {
		File F=new File("C:\\Users\\123\\Desktop\\�ļ�����"    ,   "a.txt");
		System.out.println(F);
	}
	
} 
