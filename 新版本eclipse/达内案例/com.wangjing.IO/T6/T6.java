package T6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class T6 {
	public static void main(String[] args) throws Exception {
		File f = new File("IOFile/����ʦ��¼.txt");// �����ļ���File����
		/* ���������ַ��������ö�ȡ��ʽΪUTF-8 */
		BufferedReader fbr = new BufferedReader(new InputStreamReader(new FileInputStream(f), "UTF-8"));
		String len = null;
		while ((len = fbr.readLine()) != null) {// һ��һ�еĶ�
			System.out.println(len);// ���������̨
		}
		fbr.close();// �ͷ���Դ
	}
}
