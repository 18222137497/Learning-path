package IO�������;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * �ļ��ַ�������
 *   BufferedReader     BufferedWriter
 * �ļ��ַ����뻺����  �ļ��ַ����������
 * @author 123
 *
 */
public class AaeBufferedReader {
	/*
	 * �ļ��ַ����뻺����
	 */
	public static void main(String[] args) {
		File f=new File("E:\\����\\java\\��Ƶ\\2�ڶ�ƪ ���ļ���\\6��ʮ���� IO�������\\word.txt");//��ȡ�ļ�
		long state=System.currentTimeMillis();//��ȡ��ǰʱ��
		FileReader fr=null;//�����ַ�������
		BufferedReader br=null;//�����ַ�������������
		try {
			fr=new FileReader(f);//ʵ�����ַ�������
			br=new BufferedReader(fr);//ʵ�����ַ�������������
//			char ch[]=new char[1024];
//			int tmp;
//			while ((tmp=br.read(ch))!=-1) {
//				System.out.println(new String(ch));
//				
//			}
			
			String tmp=null;
			int i=1;
			while ((tmp=br.readLine())!=null) {//���ж��ַ�
				System.out.println("��"+i+"��	"+tmp);
				i++;
			}
			long end=System.currentTimeMillis();//��ȡ��ǰʱ��
			System.out.println("�����ļ���ʱ��"+(end-state)+"����");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (fr!=null) {
				try {
					fr.close();//�ر��ַ�������
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (br!=null) {
				try {
					br.close();//�ر��ַ����뻺����
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}			
	}
}
class BufferedWrite{
	/*
	 * �ļ��ַ����������
	 */
	public static void main(String[] args) {
	File f=new File("E:\\����\\java\\��Ƶ\\2�ڶ�ƪ ���ļ���\\6��ʮ���� IO�������\\word.txt");//��ȡ�ļ�
	FileWriter fw=null;//�����ļ��ַ������
	BufferedWriter bw=null;//�����ļ��ַ������������
	try {
		fw=new FileWriter(f);//ʵ�����ļ��ַ������
		bw=new BufferedWriter(fw);//ʵ�����ļ��ַ������������
		String a="����һֱСë¿���Ҵ���Ҳ���";//������ַ���
		String b="������������";
		bw.write(a);//����ַ���
		bw.newLine();//��������
		bw.write(b);//��������ַ���
		bw.flush();//ˢ��
	} catch (IOException e) {
		e.printStackTrace();
	}finally {//˭���ȴ����ģ�˭���رգ������������� �ȴ�����ر�
		if (fw!=null) {
			try {
				fw.close();//�ر��ַ������
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		if (bw!=null) {
			try {
				bw.close();//�ر��ַ������������
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
