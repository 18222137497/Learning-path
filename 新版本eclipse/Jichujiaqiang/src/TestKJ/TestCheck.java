package TestKJ;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;
/**
 * �򵥵Ĳ��Կ��
 * 	����������ִ�к󣬻��Զ�ִ�б��������÷���(����Checkע��ķ���)���жϷ����Ƿ����쳣����¼���ļ���
 * @author 123
 *
 */
public class TestCheck {
	public static void main(String[] args) throws IOException {
		//1.������Ҫ���Ե������
		Calculator c = new Calculator();
		//2.��ȡ�ֽ����ļ�����
		Class cls = c.getClass();
		//3.��ȡ���з���
		Method[] methods = cls.getMethods();
		int number=0;
		BufferedWriter bw=new BufferedWriter(new FileWriter("bug.txt"));//�ֽڻ��������
		for (Method method : methods) {
			//4.�жϷ������Ƿ���Checkע��
			if(method.isAnnotationPresent(Check.class)) {//�жϷ������Ƿ����Checkע��
				//5.�У�ִ��
				
				try {
					method.invoke(c);//ִ�з���
				} catch (Exception e) {
					//6.�����쳣
					//7.��¼���ļ���
					number++;
					bw.write(method.getName()+"���������쳣!");//��ȡ������
					bw.newLine();//����
					bw.write("�쳣����:"+e.getClass().getSimpleName());//��ȡ�쳣�ļ������
					bw.newLine();
					bw.write("�쳣ԭ��:"+e.getCause().getMessage());//��ȡ�쳣��ԭ��
					bw.newLine();
					bw.write("-----------------------------");
					bw.newLine();;
					
				}
				
			}
		}
		bw.write("���β���һ������"+number+"���쳣");
		bw.flush();
		bw.close();
		
	}

}
