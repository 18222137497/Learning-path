package 方法的引用;

public class Demo1 {
	public static void main(String[] args) {
		PP(Person::pl);//用方法引用调用成员方法
	    PA(Person::new);//用方法引用调用构造方法
	    new Demo1().PZ();//用方法引用调用this方法
	    ARR(2,int[]::new);//用方法引用构造数组
	    ARR(2,r->new int[r]);//这个和上面相同，上面的是方法引用写法
	}
	public static void PP(CCC c) {
		c.Pri();
	}
	public void PZ() {
		PP(this::PC);
	}
	public static void PA(AAA c) {
		System.out.println(c.AA("你好").getName());
	}
	public void PC() {
		System.out.println("今高兴");
	}
	public static int[] ARR(int i,BBB b) {
		return b.IN(i);
	}
}
