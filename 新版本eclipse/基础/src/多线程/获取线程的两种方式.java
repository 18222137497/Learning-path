package 多线程;

public class 获取线程的两种方式 {
	public static void main(String[] args) {
	 MyThread m=new MyThread();
	 m.start();
	 new MyThread().start();
	 System.out.println(Thread.currentThread());
}
}
