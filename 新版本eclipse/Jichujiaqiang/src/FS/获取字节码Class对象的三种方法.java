package FS;
/**
 * 同一个字节码文件*.class在一次程序运行过程中，只会被加载一次，无论用哪种方法获取的class对象都是同一个
 * @author 123
 *
 */
public class 获取字节码Class对象的三种方法 {
	public static void main(String[] args) {
		/*1.Class.forName("全类名"):将字节码文件加载进内存，返回Class对象*/
			/*多用于配置文件，将类名定义在配置文件中，读取文件，加载类*/
		try {
			System.out.println(Class.forName("反射.Person"));//class 反射.Person
		} catch (ClassNotFoundException e) {//类找不到异常
			e.printStackTrace();
		}
		/*2.类名.class:通过类名的属性class获取*/
			/*多用于参数传递*/
		System.out.println(Person.class);//class 反射.Person
		/*3.对象.getClass();:getClass()方法再Object类中定义着*/
			/*多用于对象的获取字节码的方式*/
		Person p=new Person();
		System.out.println(p.getClass());//class 反射.Person
	}
}
