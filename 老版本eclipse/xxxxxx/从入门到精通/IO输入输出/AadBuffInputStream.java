package IO�������;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * �����ֽ���
 *  BuffInputStream    BuffOutputStream 
 *    �����ֽ�������     �����ֽ������
 * 
 * @author 123
 *
 */

public class AadBuffInputStream {
	/*
	 * �ֽ����뻺����
	 */
	public static void main(String[] args) {
		File f = new File("C:\\Users\\123\\Desktop\\����ͳ����������.docx");//ʵ�����ļ�
		long state = System.currentTimeMillis();//��õ�ǰ������
		BufferedInputStream bf=null;//�����ֽ����뻺��������ֵΪ�գ�������������д��try catch�������
		FileInputStream fi = null;//�����ֽ�����������ֵΪ��
		try {
			fi = new FileInputStream(f);//ʵ�����ļ��ֽ������������������File�ļ���
			bf=new BufferedInputStream(fi);//ʵ�����ֽ����뻺�����������������������
			byte by[]=new byte[1024];//�涨�����ֽ���
			while(bf.read(by)!=-1){//���涨�����ֽ��������ֽ�
				
			}
			long end=System.currentTimeMillis();//��õ�ǰ������
			System.out.println("��Ҫʱ��Ϊ��"+(end-state)+"����");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (fi!=null) {
				try {
					fi.close();//�ر��ֽ�������
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (bf!=null) {
				try {
					bf.close();//�ر��ֽ����뻺����
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
class  BuffOutputStream{
	/*
	 *	�ֽ���������� 
	 */
	public static void main(String[] args) {
		File f=new File("E:\\����\\java\\��Ƶ\\2�ڶ�ƪ ���ļ���\\6��ʮ���� IO�������\\word.txt");
		FileOutputStream fo=null;//�����ļ��ֽ����������ֵΪ��
		BufferedOutputStream bo=null;//�����ļ��ֽ��������������ֵΪ��
		try {
			fo=new FileOutputStream(f);//ʵ�����ļ��ֽ��������������File�ļ���
			bo=new BufferedOutputStream(fo);//ʵ�����ļ��ֽ���������������������ļ��ֽ��������
			String arr="�����Ǹ������ӣ�";//���������
			byte by[]=arr.getBytes();//�õ���������ݵ��ַ������ֽ���
			bo.write(by);//����ֽ���
			bo.flush();//ˢ�£�������ǿ�ƽ�������������д���ļ��У���ʹ������û������
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (fo!=null) {
				try {
					fo.close();//�ر��ֽ������
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (bo!=null) {
				try {
					bo.close();//�ر��ֽ������������
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
 	}
	
}
