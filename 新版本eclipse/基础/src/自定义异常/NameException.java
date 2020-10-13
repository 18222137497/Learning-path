package 自定义异常;

import java.util.Scanner;

/**
 * Exception: 编译期异常
 * RuntimeException: 运行期异常（交给jvm处理）
 * @author 123
 *
 */
public class NameException extends Exception{
	static String[] Name= {"张三","李四","王五"};
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入创建的用户名");
		String name=scan.next();
		TF(name);
	}
	public static void TF(String name) {
		for (String nm:Name) {
			if (nm.equals(name)) {
				try {
				throw new RegisterException("该用户已经被注册");
				}catch(RegisterException e){
					e.printStackTrace();
					return;
				}
				}
		}
		System.out.println("恭喜您注册 成功");
	}
}
