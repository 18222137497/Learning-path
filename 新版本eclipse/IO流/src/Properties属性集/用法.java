package Properties���Լ�;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
/**
 * java.util.Properties extends Hashable<k,v> implements Map<k,v>
 * @author 123
 *
 */
public class �÷� {
	/*
	 * Properties���ʾ��һ���־õ����Լ���Properties�ɱ��������л�����м���
	 * ��Ψһһ�����Ժ�����ϵļ���
	 * 	����ʹ�ü����е�store�������Ѽ��е���ʱ���ݣ��־û�д�뵽Ӳ���д���
	 * 	void store(OutputStream out,String comments);
	 * 	void store(Writer w,String comments); 
	 * 		������
	 * 			�ַ����������д���ģ��ֽڲ��У������comments�����ǽ���˵��������ļ��Ǹ�ʲô�õģ�
	 * 								���������ģ���ΪĬ����Unicode���룬һ��ʹ��""���ַ�����
	 * 	����ʹ�ü����е�load����Ӳ���б�����ļ�(��ֵ��),��ȡ��������ʹ��
	 *  void load(InputStream i);
	 * 	void load(Reader r); 
	 * 		ע�⣺
	 * 			1.�����ֵ�Ե��ļ����У�����ֵ��Ĭ�����ӷ��ſ�����=,�ո�(��������)
	 * 			2.�����ֵ�Ե��ļ����У�����ʹ��#��ע�ͼ���ֵ����ע�ǵĲ��ᱻ��ȡ
	 * 			3.�����ֵ�Ե��ļ����У�����ֵĬ�ϵĶ����ַ��������� ���ü�""
	 * 	
	 * 	���ϵ�key value����String�����ַ���
	 */
	public static void main(String[] args) throws IOException {
		//P1();
		//P2();
		P3();
	}
	public static void P1() {
		Properties p=new Properties();//��map�����÷���࣬���Ƿ���Ĭ��ΪString
		p.setProperty("����", "18");//����map.put();
		p.setProperty("��wowo", "17");
		p.setProperty("owow��", "12");
		Set<String> arr=p.stringPropertyNames();//���� map.keyset();��ȡ���б�����set����
		for (String s : arr) {
			String ar=p.getProperty(s);//��һmap.get();
			System.out.println("key:"+s+" value:"+ar);}
							}
	public static void P2() throws IOException {
		Properties p=new Properties();
		p.setProperty("����", "18");
		p.setProperty("��wowo", "17");
		p.setProperty("owow��", "12");
		FileWriter w=new FileWriter("C:\\Users\\123\\Desktop\\�ļ�����\\a.txt");
		p.store(w, "111");
//		#111
//		#Sat Mar 14 17:28:51 CST 2020
//		owow��=12
//		��wowo=17
//		����=18
		p.store(new FileOutputStream("C:\\Users\\123\\Desktop\\�ļ�����\\a.txt"), "222");
//		#222
//		#Sat Mar 14 17:30:35 CST 2020
//		owow\u4EAC=12                                                                                               ���ı������
//		\u6C6Awowo=17
//		\u6C6A\u4EAC=18
	}
	public static void P3() throws FileNotFoundException, IOException {
		Properties p=new Properties();
		p.load(new FileInputStream("C:\\Users\\123\\Desktop\\�ļ�����\\a.txt"));
		Set<String> s=p.stringPropertyNames();//���� map.keyset();��ȡ���б�����set����
		for (String string : s) {
			String ar=p.getProperty(string);
			System.out.println("key:"+string+"	value:"+ar);
		}
//		key:???	value:17
//		key:?���	value:18
//		key:?��?	value:12
	}
}
