package ����;

public class Person1 implements Comparable<Person1>{//��ӷ���Ϊ����
	String name;
	int age;
	public Person1() {
	}
	public String toString() {
		return "Person1 [name=" + name + ", age=" + age + "]";
	}
	public Person1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int compareTo(Person1 o) {//��дcompareTo����
		//return 0;//����0������ΪԪ�ض�����ͬ��
		return this.getAge()-o.getAge();//�����������򣬷�֮�ǽ���
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
