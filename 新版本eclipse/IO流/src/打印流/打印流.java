package ��ӡ��;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class ��ӡ�� {
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("���ǿ���̨");
		PrintStream p=new PrintStream("C:\\Users\\123\\Desktop\\bb.txt");
		p.println("�����ļ���");
		System.setOut(p);//���������Ŀ�ĵظ�Ϊ��ӡ����Ŀ�ĵ�
		System.out.println("��Ҳ���ļ���");
		
		
	}
	
}
