package T2;

import java.io.File;
import java.io.FileReader;
import java.util.HashMap;

/**
 * ͳ��һ�仰�и����ַ��ĸ��������ַ���"good good study, day day up."ͳ�����и����ַ����ֵĴ�����
 * ���磺�����ַ����и����ַ��ĳ��ֵĴ���Ϊ��{g=2, u=2, d=5, t=1, s=1, p=1, a=2, o=4, y=3}��
 * 
 * @author ����
 *
 */
public class T2 {
	public static void main(String[] args) {
		File f = new File("IOFile\\a.txt");
		Count_Char(f);
	}

	public static void Count_Char(File f) {
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();// ����hashmap�������ڴ�����ż������
		try (FileReader fileReader = new FileReader(f)) {// ��ȡ�ַ�������(��������try�����������,��������try catch���������Զ��ر�)
			char[] c = new char[1];// ���û�����(����Ϊ�˷�����ö����ַ�����һ��һ����)
			while (fileReader.read(c) != -1) {// һ���ַ�һ���ַ��Ķ�
				if (hashMap.containsKey(new String(c))) {// �жϼ������Ƿ��ж�Ӧ��ͬ�ļ�
					hashMap.put(new String(c), hashMap.get(new String(c)) + 1);// ����оͽ��ü���Ӧ��ֵ+1
				} else {
					hashMap.put(new String(c), 1);// ���û�оʹ�1��ʼ����
				}
			}
			System.out.println(hashMap);// ������
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
