package xxxxx;

public class Testperson {
	public static void main(String[] args) {
	Person p=new Person();
	System.out.println(p.toString());
	}
	}
class Person{
	String name="Íô¾©";
	int age=21;
	double salary=1000000.00;
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
			
	
}