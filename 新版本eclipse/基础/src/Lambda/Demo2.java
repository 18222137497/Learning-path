package Lambda;

public class Demo2 {
	public static void main(String[] args) {
	Aa(()->{
		System.out.println("�Է���");
	});
	}
public static void Aa(Mmo m) {
		m.makeFood();
	}
}
interface Mmo{
	public abstract void makeFood();
}