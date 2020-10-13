package com.tarena.yadx.objectandclass;

public class textCreateObject {
     /*
      * 
      *  一.使用new关键字创建对象
      *  1.类定义完成后，可以使用new关键字创建对象，创建对象的过程成为类的实例化
      *  2.new关键字使用格式：
      *             new 类名()；
      *       例如：new Person();//实例化人对象
      *             new Bird();//小鸟
      *             new JFrame();//窗体话对象
      *  二，引用类型变量
      *   1.为了能够对实例化对象访问控制，需要一个特殊的变量-引用。
      *    -引用类型变量可以存放该类对象的地址信息，通常称为指向该类的对象，当一个引用类型变量指向该类的对象时，
      *     就可以通过对对象实施访问
      *    -除了八种基本类型之外，用类接口数组等声明的变量都称为引用类型变量，简称-引用
      *    如：Bird b=new Bird();
      *        Bird表示此引用的类型
      *        b：应用new Bird（）；：表示对象的实例化  
      *   三.引用类型变量的赋值
      *    1.引用类型变量存储的是变量地址信息，想偷类型的引用类型变量之间可以互相赋值
      *    2.引用类型变量之间的赋值不会创建新的对象，但有可能会使两个以上的引用指向同一个对象   
      *   四，null和NullPointerException
      *    1.对于引用类型变量可以对其赋值为null。null的含义为空，表示还没有指向任何对象
      *     Person p；//初始值为null，表示person中的值为null，没有指向任何对象。
      *     p=new person（）；//表示指向了一个person对象
      *     2.当一个引用的值为null的时候，如果通过引用访问对象成员变量或者调用方法时不符合逻辑的，此事会产生
      *     NullPointerException。"空指针异常"
      *            
      *             
      *  
      */
	/*
	 * 使用main函数让程序运行，也是程序的入口 
	 */
//	public static void main(String[] args) {
//		Person p=new Person();
//		Person p1=p;//引用传递
//		/*引用调用属性*/
//		p.name="黄河大虾";
//		p.age=16;
//		p.salary=10000.00;
//		p.sex='女';
//		p.isBoy=false;
//		System.out.println(p.name);
//		System.out.println(p.age);
//		System.out.println(p.sex);
//		System.out.println(p.sex);
//		System.out.println(p.isBoy);
//		/*引用调用方法*/
//		String name=p.name;//值传递
//		int age=p.age;
//		double salary=p.salary;
//		p.show(name, age, salary);
//		p.sing();
//		Person p4=null;
//		p4.sing();//会报空指针异常
//	}
	
}
