package �̳����̬;
/**
 * �̳��Լ���̬
 * ���췽���������ǳ�ʼ����Ա���������๹�췽��ʱ��������ִ�и���Ĺ��췽��super();
 * @author 123
 *
 */
public class Extends {
	public static void main(String[] args) {
		//Person p=new Person("֣·",28);//�����಻�ܱ�ʵ����
		Teather t=new Teather("������",40);
		t.Show();
		Teather t1=new Teather();
		t.run();
	}
}
abstract class Person{
	int age;
	String name;
	public Person() {
		System.out.println("fu");
	}
	public Person(String name,int age) {
		this.age=age;
		this.name=name;
	}
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	public void Show() {
		System.out.println("����˳ƣ�"+name);
	}
	public abstract void run();//���������û�г��󷽷������ɳ��󷽷�����һ���ǳ�����
	
	
}
class Teather extends Person{
	int age;
	String name;
	public Teather() {
		super();//��ִ�и���Ĺ��췽��������������������������
		System.out.println("zi");
	}
	public Teather(String name,int age) {
		super();
		this.age=age;
		this.name=name;
		super.name=name;
	}
	public String toString() {
		return "Teather [age=" + age + ", name=" + name + "]";
	}
	public void Show() {
		super.Show();
		System.out.println("��������ʦ");
	}
	public void run() {
		System.out.println("��");
		
	}
	
}