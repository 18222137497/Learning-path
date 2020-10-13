package TestKJ;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;
/**
 * 简单的测试框架
 * 	当主方法被执行后，会自动执行被检测的所用方法(加了Check注解的方法)，判断方法是否有异常，记录到文件中
 * @author 123
 *
 */
public class TestCheck {
	public static void main(String[] args) throws IOException {
		//1.创建需要测试的类对象
		Calculator c = new Calculator();
		//2.获取字节码文件对象
		Class cls = c.getClass();
		//3.获取所有方法
		Method[] methods = cls.getMethods();
		int number=0;
		BufferedWriter bw=new BufferedWriter(new FileWriter("bug.txt"));//字节缓冲输出流
		for (Method method : methods) {
			//4.判断方法上是否有Check注解
			if(method.isAnnotationPresent(Check.class)) {//判断方法上是否存在Check注解
				//5.有，执行
				
				try {
					method.invoke(c);//执行方法
				} catch (Exception e) {
					//6.捕获异常
					//7.记录到文件中
					number++;
					bw.write(method.getName()+"方法出现异常!");//获取方法名
					bw.newLine();//换行
					bw.write("异常名称:"+e.getClass().getSimpleName());//获取异常的简短类名
					bw.newLine();
					bw.write("异常原因:"+e.getCause().getMessage());//获取异常的原因
					bw.newLine();
					bw.write("-----------------------------");
					bw.newLine();;
					
				}
				
			}
		}
		bw.write("本次测试一共出现"+number+"次异常");
		bw.flush();
		bw.close();
		
	}

}
