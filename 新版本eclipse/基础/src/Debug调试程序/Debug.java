package Debug调试程序;
/**
 * Debug调试程序
 * 	可以让代码逐行执行，查看代码执行的过程，调试程序出现的bug
 * 使用方式：
 * 		在行号的右边，鼠标左键点击，添加断点（每个方法的第一行，哪里有bug添加到哪里）
 * 		有件选择debug执行程序
 * 		程序就会停留在添加的第一个断点处
 * 执行程序：
 * 		f8：逐行执行程序
 * 		f7：进入到方法中
 * 		shift+f2：退出debug模式，停止程序
 * 		Console：切换到控制台
 * @author 123
 *
 */
public class Debug {
	public static void main(String[] args) {
	int a=1;
	int b=1;
	int c=1;
	int d=1;
	System.out.println(a+b+c+d);
}
}
