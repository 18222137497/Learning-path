package �������Ա����ƪ;
/**
 * ���飬ѧ������
 * @author ����
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
		//����ѧ������
		Student[] student=new Student[3];
		//����ѧ������
		Student s1=new Student("����",30);
		Student s2=new Student("����",20);
		Student s3=new Student("�ŷ�", 15);
		student[0]=s1;
		student[1]=s2;
		student[2]=s3;
		//����ѧ������
		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i].getName()+"----"+student[i].getAge());
		}
	}
	
}

