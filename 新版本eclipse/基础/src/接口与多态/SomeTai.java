package 接口与多态;
/**
 * 多态      instanceof关键字
 * @author 123
 *
 */
public class SomeTai {
	public static void main(String[] args) {
		ZA f=new ZA();
		Fu F=new ZB();//向上转型
	  //Fu ff=new Fu();//抽象类不能被实例化             
		ZB z=(ZB)F;//向下转型，向下转型后才能调用子类独有的方法
		z.ABC();
		f.ABC();
	  //F.ABC();(错误！)这种多态形式只能调用子类重写的父类方法，不能调用子类有而父类没有的方法
		showMe(f);
		showMe(F);
		System.out.println(f instanceof Fu);//变量名  instanceof 变量类型
		
	}
	public static void showMe(Fu f){//多态
		f.run();
	}
}
abstract class Fu{
	public abstract void run();
}
class ZA extends Fu{
	public void run() {
		System.out.println("100m/s");
	}
	public void ABC() {
		System.out.println("ABC");
	}
}
class ZB extends Fu{
	public void run() {
		System.out.println("200m/s");
	}
	public void ABC() {
		System.out.println("ABC");
	}
}
