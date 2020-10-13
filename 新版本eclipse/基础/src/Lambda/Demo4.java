package Lambda;
/**
 * 有参数有返回值的Lambda表达
 * Lambda表达式可以推到，可以省略，
 * 	可以省略的内容：
 * 		1.(参数列表):括号中参数列表的数据类型可以不写
 * 		2.(参数列表):括号中参数如果只有一个，那么类型和()都可以省略
 * 		3.{一些代码}:如果{}中的代码只有一行，无论是否有返回值，都可以省略({},return,分号)注意要省略就要一起省略⬇⬇⬇⬇⬇⬇⬇
 * @author 123
 *
 */
public class Demo4 {
	public static void main(String[] args) {
		BB(12,12,(int a,int b)->{
			return a+b;//有参数的抽象方法必须要写返回值
		});
		//省略模式
		BB(12,12,(a,b)->a+b);//有参数的抽象方法必须要写返回值⬆⬆⬆⬆⬆⬆
	}
	public static void BB(int a,int b,CC c) {
		System.out.println(c.CC(a, b));
	}
}
interface CC{
	public abstract int CC(int a,int b);
}
