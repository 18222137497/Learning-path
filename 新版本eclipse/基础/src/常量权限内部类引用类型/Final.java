package 常量权限内部类引用类型;
/**
 * final修饰的变量只能赋值一次
 * 被final修饰的变量名都要大写（书写规范）
 * @author 123
 *
 */
public class Final {
	public static void main(String[] args) {
		final String a=new String();//定义final修饰的String
	  //a=new String();   (错误！)常量修饰的局部变量不能修改地址值，但不影响内部成员变量的值的修改
		a.strip();//字符串分割
	}
}
