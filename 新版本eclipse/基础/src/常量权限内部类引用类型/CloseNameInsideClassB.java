package 常量权限内部类引用类型;
/**
 * CloseNameInsideClass的简化版本
 * @author 123
 *
 */
public class CloseNameInsideClassB {
	public static void main(String[] args) {
		show(new FlyAble() {
			public void fly() {
				System.out.println("我飞了");
			}
		});
	}
	public static void show(FlyAble f) {
		f.fly();
	}
}
