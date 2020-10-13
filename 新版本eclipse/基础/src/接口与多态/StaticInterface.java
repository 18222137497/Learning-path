package 接口与多态;

/**
 * 接口的方法调用
 * 接口无法定义成员变量，但可以定义常量，用public static final修饰
 * @author 123
 *
 */
public class StaticInterface {
	public static void main(String[] args) {
		//Demo.run;（错误）无法继承方法，也无法调用
		IF.run();//接口没有构造方法，不能实例化=不能创建对象！！！！
		Demo d=new Demo();
		CF c=new CF() {
			public void sing() {//接口可以被实例化，但必须重写他的抽象方法
				System.out.println("cfsing");
			}
		};
		d.eat();//默认方法只能用实现类的对象调用，不能通过接口调用,也不能通过实现类调用
		d.sing();
	}
}

class Demo implements IF,CF {//接口的多实现
	public void sing() {//必须重写接口的所以抽象方法，如果实现的接口有名字相同的抽象方法，只需重写一次
		System.out.println("唱歌！");
	}
	public void eat() {//如果默认方法有重名，则！！！必须！！！重写一次 
		System.out.println("吃");
	}
//	public static void run(){        !!!!!!因为和.class文件有关，所以不可重写接口中的静态方法!!!!!!!!
//		System.out.println("跑起来!");
//	}

}
interface CF{
	public abstract void sing();
	public default void eat() {
		System.out.println("吃！");
	}
}
