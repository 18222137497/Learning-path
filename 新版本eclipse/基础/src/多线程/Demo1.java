package 多线程;

public class Demo1 {
	public static void main(String[] args) {
		//创建自定义线程对象
	MyThread m=new MyThread();
		//开启新线程
	m.start();
		//在主方法中执行for循环
	for (int i = 0; i < 10; i++) {
		System.out.println("main线程！"+i);
	}
	
}
}
