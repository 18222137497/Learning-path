package �������Ա����ƪ;

import java.util.ArrayList;

/**
 * ArrayList ��ѧ������
 * @author ����
 *
 */
public class StudentArrayList {
	public static void main(String[] args) {
		//����ѧ������
		ArrayList<String> a=new ArrayList<>();
		//����ѧ������
		String s1="����";
		String s2="�ܲ�";
		String s3="��Ȩ";
		//��ӡѧ��ArrayList����
		System.out.println(a);
		//��ѧ������Ԫ����ӵ��ͼ�����
		a.add(s1);
		a.add(s2);
		a.add(s3);
		//��ӡArrayList����
		System.out.println(a);
		//��ü��ϳ���
		System.out.println(a.size());
		//��ȡָ���±��Ԫ��
		System.out.println(a.get(0));
		//ɾ��ָ���±�Ԫ��
		a.remove(0);
		//��ӡ����
		System.out.println(a);
	}
}
