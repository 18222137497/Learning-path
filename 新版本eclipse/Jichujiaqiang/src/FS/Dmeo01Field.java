package FS;

import java.lang.reflect.Field;

public class Dmeo01Field {
	public static void main(String[] args) throws Exception  {
		Class<Person> c=Person.class;
		/*
		  获取成员变量门
		  Field[] getFields();//获取类中的所有公共成员变量，返回Field对象
		  Field getField(String name);//获取指定的公共成员变量，返回Field对象
		  Field[] getDeclaredFields();//返回所有的成员变量，返回Field对象
		  Field getDeclaredField(String name);//返回指定的成员变量，返回Field对象
		 */
		Field[] f=c.getFields();//获取类中的所有公共成员变量，返回Field对象
		for (Field field : f) {
			System.out.println(field);//public int 反射.Person.age   就一个公共的成员变量
		}
		System.out.println("------------------------");
			Field f1 = c.getField("age");//获取指定的公共成员变量，返回Field对象 ,这里需要处理两个异常
			System.out.println(f1);
			Person p=new Person();
			/*Object Field.get(Object object)*/
			Object object = f1.get(p);//获取age变量的值，返回object对象
			/*参数需要传入一个object值，如果这个成员变量是static修饰的可以直接传null，这样会直接返回该Field对象的成员方法值！！！*/
			System.out.println(object);//0
			System.out.println("------------------------");
		Field[] ff=c.getDeclaredFields();//返回所有的成员变量，返回Field对象
		for (Field field : ff) {
			System.out.println(field);//private java.lang.String 反射.Person.name
			                          //public static int 反射.Person.age
		}
		Field f2 = c.getDeclaredField("name");
		System.out.println(f2);
		System.out.println("------------------------");
		/*设置成员变量的值*/
		/*第一个参数为对象，第二个是设置成员变量的值,如果这个成员变量是static修饰的可以直接传null，这样会直接返回该Field对象的成员方法值！！！*/
		f1.set(null, 1);
		System.out.println(p);//Person [name=null, age=1]
		f2.setAccessible(true);//忽略访问权限修饰符的安全检查               暴力反射！！！！！
		f2.set(p, "我自己");
		System.out.println(p);//Person [name=我自己, age=1]
	}
}
