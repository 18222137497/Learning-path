package ����;

import java.util.ArrayList;
import java.util.Collection;

/**
 * java.util.Collection           û������!
 * Collection�еĹ��Է�����˭�����ã���һ����
 * 	clear(); ���Ԫ�ص���ɾ�����ϣ�
 *  contains(E e); �жϵ�ǰ�����Ƿ����������
 *  isEmpty(); �жϼ����Ƿ�Ϊ��
 *  size(); ���ؼ�����Ԫ�صĸ���
 *  public Object[] toArray(); �Ѽ����е�Ԫ�ش���������
 * @author 123
 *
 */
public class TextCollection {
	public static void main(String[] args) {
		Collection<String> c=new ArrayList<String>();
		c.add("����");//���
		c.add("����");
		c.add("����");
		c.add("����");
		c.add("����");//ArrayList���Դ��ظ���Ԫ��
		c.remove("����");//ɾ��
		System.out.println(c);
		System.out.println(c.contains("����"));//����
		System.out.println(c.isEmpty());//�Ƿ�Ϊ��
		System.out.println(c.size());//Ԫ�ظ���
		Object[] obj=c.toArray();//��������
		for (int i = 0; i < obj.length; i++) {
			System.out.print(obj[i]+"	");
		}
		System.out.println();
		c.clear();//���Ԫ��
		System.out.println(c);
	}
}
