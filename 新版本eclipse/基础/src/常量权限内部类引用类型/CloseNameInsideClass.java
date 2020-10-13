package 常量权限内部类引用类型;
/**
 * 匿名内部类
 * 匿名内部类必须继承一个父类或实现一个父接口
 * @author 123
 *
 */
public class CloseNameInsideClass {
	public static void main(String[] args) {
		FlyAble f=new FlyAble() {
			public void fly() {
				System.out.println("飞翔");
			}
		};
		f.fly();
		showFly(f);
	}
	public static void showFly(FlyAble f) {
		f.fly();
	}
}
abstract class FlyAble{//定义一个抽象类
	public abstract void fly();
}
