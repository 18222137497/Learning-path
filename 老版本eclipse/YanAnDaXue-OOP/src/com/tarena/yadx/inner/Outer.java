package com.tarena.yadx.inner;
/**
 * 外部类
 * @author 123
 *
 */
public class Outer {
	private int time;
	private Inner inner;//inner类对象
	//构造方法
	Outer(int time){
		this.time=time;//将参数赋值属性
		inner=new Inner();//实例化内部类
		inner.timeAdd();
	}
	public void printTime(){
		System.out.println(time);
	}
	//内部类
	class Inner{
		//内部类方法
		public void timeAdd(){
			time++;//调用外部类属性（私有）
		}
	}
	public static void main(String[] args) {
		Outer outer=new Outer(100);
		outer.printTime();//101
		/*
		 * 上面代码的输出结果为101，在Outer构造方法中创建Inner对象会有一个隐式的引用指向创建它的Outer对象，
		 * 调用Inner对象的timeAdd方法及会对Outer的属性进行操作
		 */
	}

}
