package ������;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * set����
 *   HashSet
 *   //��һ��Ԫ�������ڼ�������֮�󣬲�Ҫ�޸Ŀ���ʹ����ϣֵ�ı������
 *   �˴��벻�漰��ϣֵ����������Ĭ��ΪԪ���±�
 * @author 123
 *
 */
public class AacSetHashSet {
	public static void main(String[] args) {
		Set set=new HashSet();
		Person1 p1=new Person1(1, "Сǿ");
		Person1 p2=new Person1(2, "����");
		Person1 p3=new Person1(3, "�¶�");
		Person1 p4=new Person1(4, "ɵ��");
		set.remove(3);//ɾ���±�Ϊ����Ԫ��
		set.add(p1);
		set.add(p2);
		set.add(p3);
		 
		System.out.println("���ϵĳ���Ϊ��"+set.size()+"�����Ƿ�Ϊ�գ�"+set.isEmpty());
		Iterator it=set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
			
		}
	}

}
class Person1{
	int id;
	String name;
	public Person1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person1 [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person1 other = (Person1) obj;
		if (id != other.id)//��id��ΪΨһ��ʶ
			return false;
		return true;
	}
	
}
