package TestKJ;
/**
 * 被测试方法
 * @author 123
 *
 */
public class Calculator {
	@Check
	public void add() {
		String arr=null;
		arr.toString();
		System.out.println("1+0="+(1+0));
	}
	@Check
	public void sub() {
		System.out.println("1-0="+(1-0));
	}
	@Check
	public void mul() {
		System.out.println("1*0="+(1*0));
	}
	@Check
	public void div() {
		System.out.println("1/0="+(1/0));
	}
	
	public void show() {
		System.out.println("没有问题");
	}


}
