package ע��;

import java.lang.reflect.Method;
/**
 * ���䰸����ע����
 * @author 123
 *
 */
@Pro(className = "ע��.Demo01", methodName = "show1")
public class Demo2 {
	public static void main(String[] args) throws Exception {
		// 1.����ע��
		// 1.1��ȡ������ֽ����ļ�����
		Class<Demo2> c = Demo2.class;
		// 2.��ȡ�����ע�Ͷ���
		Pro an = c.getAnnotation(Pro.class);// ��ʵ�������ڴ���������һ����ע��ӿڵ�����ʵ�ֶ���
		// 3.����ע���ж���ĳ��󷽷�����ȡ����ֵ
		String className = an.className();
		String methodName = an.methodName();
		// 3.1���ظ�����ڴ�
		Class f = Class.forName(className);// �����������
		// 4.��������
		Object newInstance = f.getDeclaredConstructor().newInstance();// ��������(�ղ���)
		// 5.��ȡ����ķ���
		Method m = newInstance.getClass().getMethod(methodName);// ��ȡ����ķ�����������û�в����ķ���
		// 6.ִ�з���
		m.invoke(newInstance);// ִ�з���
	}
}
