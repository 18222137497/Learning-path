package DemoJunit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestDemo{
	/*�÷������ڲ��Է���֮ǰ��ִ��*/
	@Before
	public void in() {
		System.out.println("��ʼ����.....");
	}
	@After
	public void ed() {
		System.out.println("��������");
	}
	/*�÷������ڲ��Է���֮��ִ��*/
	@Test
	public void TestAdd() {
		//���ԣ��Ҷ�����������3
		Assert.assertEquals(3, new Demo1().Add(1, 2));//ǰ�ߴ�����Ե�ֵ�������ǳ�������ʵ�������ֵ
		/*���һ��junit��ʾ��ɫ����һ����ʾ��ɫ��������ʾ����Ե�ֵ��ʵ�����е�ֵ*/
		System.out.println("���ڲ��Գ���.....");
	}
}
class Demo1{
	public int Add(int a,int b) {
		return a+b;
	}
}
