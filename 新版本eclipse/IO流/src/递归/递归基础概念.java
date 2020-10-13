package 递归;

public class 递归基础概念 {
	/*
	 直接递归和间接递归
	 递归的意思就是自己调用自己，但是不能无线调用或者次数太多，不然会出现栈内存溢出状况，（每次栈的内存大小不一定）
	 构造方法不能调用自己
	 */
	public static void main(String[] args) {
	p1(1);
}
	public static void p1(int i) {
		System.out.println(i);
		if (i>10) {//设置递归次数
			return;
		}
		p1(++i);
	}
	//间接递归
	/*
	 * p1(){
	 * 		c1();
	 * }
	 * c1(){
	 * 		p1();
	 * }
	 */
}
