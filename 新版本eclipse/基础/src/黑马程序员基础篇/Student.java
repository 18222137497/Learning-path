package 黑马程序员基础篇;
/**
 * 数组，学生属性
 * @author 汪京
 *
 */
public class Student {
	private String name;
	private int age;
	public Student(){
	}
	public Student(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
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
	public static void main(String[] args) {
		//创建学生数组
		Student[] student=new Student[3];
		//创建学生对象
		Student s1=new Student("刘备",30);
		Student s2=new Student("关于",20);
		Student s3=new Student("张飞", 15);
		student[0]=s1;
		student[1]=s2;
		student[2]=s3;
		//遍历学生数组
		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i].getName()+"----"+student[i].getAge());
		}
	}
	
}

