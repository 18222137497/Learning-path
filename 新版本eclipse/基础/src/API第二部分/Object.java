package API�ڶ�����;

import java.util.Objects;

public class Object {
	public static void main(String[] args) {
		Person p1=new Person("����",21);
		Person p2=new Person("����", 21);
		boolean a=Objects.equals(p1,p2);//Objects.equals�������Է�ֹ���ֱȽϵĿ�ָ���쳣������鿴Դ��		
		System.out.println(a);
	}
}
class Person{
	String name ;
	int age;
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public boolean equals(java.lang.Object obj) {//��дequals����
		if (this == obj)//��ߴ���Ч��
			return true;
		if (obj == null)//��ߴ���Ч��
			return false;
		if (getClass() != obj.getClass())//����
			return false;
		Person other = (Person) obj;//����ת�ͣ���ֹ��̬��ɵĲ��ܵ�������������Լ�����������
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}