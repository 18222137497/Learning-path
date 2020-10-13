package com.tarena.yadx.interfaceimp;
/**
 *接口示例
 * @author 123
 *
 */
public interface Runner {
	/*
	 * 通过infterface关键字定义接口
	 * - 接口中不能定义成员变量，但可以定义常量static fianl 修饰，关键字
	 */
	public static int SCORE=100;//接口中定义的成员变量一定是常量
	int LEFT=100;
	static final int RIGHT=100;
	public void run();
	public abstract void run1();
	/*
	 * 接口中只能定义没有方法体的方法-抽象方法
	 * absteract关键字可以省略
	 */
	
}
