package FS;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * ����дһ��"���"�������ڲ��ܸı�����κδ����ǰ���£����԰������Ǵ�������������
 * 	ʵ�֣�
 * 		1.�����ļ�
 * 		2.����
 * 	���裺
 * 		1.����Ҫ�����Ķ����ȫ��������Ҫִ�еķ��������������ļ���
 * 		2.�ڳ����м��ض�ȡ�����ļ�
 * 		3.ʹ�÷��似���������ļ����ڴ�
 * 		4.��������
 * 		5.ִ�з���
 * @author 123
 *
 */
public class AL {
	public static void main(String[] args) throws Exception {
		//1.���������ļ�
		//1.1����Properties����
		Properties p = new Properties();
		//1.2���������ļ�ת����һ������
		//1.2.1��ȡclassĿ¼�µ������ļ�
		/*ClassLoader getClassLoader() ������������������ļ�������java���еĹؼ�����,��jdk1.0�ʹ���*/
		ClassLoader classLoader = AL.class.getClassLoader();//��ȡ����������
		/*��������׳���ָ���쳣��Ҳ����û�ҵ��ļ����Ե��벻��Properties����
		     �ҵĽ������Ϊ��ͬ��Ŀ�´���һ���µ�Source Folder(Դ�ļ���),�������ļ��ŵ��µ�Source Folder��
		     ���ڵ�һ��ִ�д����ʱ������˿�ָ���쳣����Ϊ�ҽ������ļ��ŵ��������ͬ����Դ�ļ���*/
		/*InputStream getResourceAsStream(String name) �������ڶ�ȡָ����Դ��������������Ϊ�ļ�·�� */
		InputStream resourceAsStream = classLoader.getResourceAsStream("a.properties");
		/*void load(InputStream i)�����ֵ�Ե��ļ����У�����ֵ��Ĭ�����ӷ��ſ�����=,�ո�(��������)*/
		p.load(resourceAsStream);
		//2.��ȡ�����ļ��ж��������
		String className=p.getProperty("classname");//��ͬ��Map�����е�get������ͨ������ֵ
		String methodName=p.getProperty("methodName");
		//3.���ظ�����ڴ�
		Class c = Class.forName(className);//�����������
		//4.��������
		Object newInstance = c.getDeclaredConstructor().newInstance();//��������(�ղ���)
		//5.��ȡ����ķ���
		Method m = newInstance.getClass().getMethod(methodName);//��ȡ����ķ�����������û�в����ķ���
		//6.ִ�з���
		m.invoke(newInstance);//ִ�з���
		
		
		
		
		
		
		
		
		
		
	}
}
