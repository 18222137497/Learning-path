package 集合;

public class Person1 implements Comparable<Person1>{//添加泛型为该类
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
	public int compareTo(Person1 o) {//重写compareTo方法
		//return 0;//返回0代表认为元素都是相同的
		return this.getAge()-o.getAge();//年龄升序被排序，反之是降序
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
