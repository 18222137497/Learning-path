package com.tarena.yadx.objectandclass;

public class TestConstructor {
	/*
	 * 一.构造方法的语法结构
	 *   1.构造方法是在类中定义的方法，不同于其他方法，构造方法的定义有如下两种规则
	 *       -构造方法的方法名必须与类名形同
	 *       -构造方法没有返回值，但也不能写void
	 *   2.语法格式：
	 *       -[访问修饰符] 类名(){
	 *          //构造方法方法体
	 *          }    
	 * 二.通过构造方法初始化成员变量
	 *       构造方法的主要作用就是对于成员变量参数的初始化。创建对象时构造方法写在new关键字
	 *       后，可以理解为new创建了对象而构造方法是对于该对象进行了初始化 
	 * 三.this关键字的使用
	 *     this关键字用在方法体中    用于指向调用该方法的当前对象，简单的说就是那个对象调用
	 *   方法this关键字指的就是那个对象，严格来讲在方法中需要通过this关键字知名当前对象
	 *     在构造方法中，用来初始化成员变量的参数一般和成员变量取相同的名字，这样有利于代码
	 *   的可读性，但此处就必须通过this来区分成员变量和成员的参数了
	 * 四.默认的构造方法   
	 *   1.任何一个类都必须含有构造方法；
	 *   2.如果源程序中没有定义编译器在编译时将会为其添加一个无参的空的构造方法，称为默认的构造方法
	 *   3.当定义了构造方法之后java编译器将不再添加默认的构造方法    
	 */
	String name;
	public TestConstructor(String name){
		this.name=name;
		
		
	}
	public void personSing(){
		System.out.println("得不到的永远在骚动。。。");
	}
	public static void main(String[] args) {
		/*
		 * 假设：当我们使用new关键字创建对象的实例时，程序就执行了new 关键字后跟随的
		 * （0个或多个参数的构造方法）
		 * 假设：我需要在实例化是实体类之后，就需要对于类中的公共属性进行初始化赋值，
		 * 那麽通过假设1，就可以在实例化对象时对属性进行赋值
		 * 假设：我们当前的属性时name，我需要对name进行赋值，我们可以使用构造方法的参数
		 * 进行赋值，且我们可以将类中的属性用关键字this调用，this指这个
		 * 结论：构造方法的主要作用：初始化参数
		 */
		TestConstructor tc=new TestConstructor("草原特");
		System.out.println(tc.name);
				
	}
	
	

}
