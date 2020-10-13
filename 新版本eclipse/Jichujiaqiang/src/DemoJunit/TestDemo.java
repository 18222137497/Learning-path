package DemoJunit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestDemo{
	/*该方法会在测试方法之前被执行*/
	@Before
	public void in() {
		System.out.println("开始测试.....");
	}
	@After
	public void ed() {
		System.out.println("结束测试");
	}
	/*该方法会在测试方法之后被执行*/
	@Test
	public void TestAdd() {
		//断言，我断言这个结果是3
		Assert.assertEquals(3, new Demo1().Add(1, 2));//前者传你断言的值，后者是程序运行实际输出的值
		/*如果一样junit显示绿色，不一样显示红色，并且显示你断言的值和实际运行的值*/
		System.out.println("正在测试程序.....");
	}
}
class Demo1{
	public int Add(int a,int b) {
		return a+b;
	}
}
