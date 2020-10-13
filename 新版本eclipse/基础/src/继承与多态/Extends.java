package 继承与多态;
/**
 * 继承以及多态
 * 构造方法的作用是初始化成员变量，子类构造方法时，必须先执行父类的构造方法super();
 * @author 123
 *
 */
public class Extends {
	public static void main(String[] args) {
		//Person p=new Person("郑路",28);//抽象类不能被实例化
		Teather t=new Teather("崔林立",40);
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
		System.out.println("社会人称："+name);
	}
	public abstract void run();//抽象类可以没有抽象方法，但由抽象方法的类一定是抽象类
	
	
}
class Teather extends Person{
	int age;
	String name;
	public Teather() {
		super();//先执行父类的构造方法！！！！！！！！！！！！
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
		System.out.println("现在是老师");
	}
	public void run() {
		System.out.println("跑");
		
	}
	
}