package 接口与多态;

public interface IF {
	public static void run(){
		System.out.println("跑起来");
	}
	public default void eat() {
		System.out.println("吃！");
	}
	public abstract void sing();
}
