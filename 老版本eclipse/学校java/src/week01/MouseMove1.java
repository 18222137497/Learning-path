package week01;

import java.awt.AWTException;
import java.awt.Robot;

/**
 * 题目：根据鼠标安技案例继续双击鼠标双击打开我的电脑
 * @author 123
 *
 */
public class MouseMove1 {
	public static void main(String[] args) throws AWTException {
		Robot b=new Robot();//机器对象
		b.delay(2000);//延迟等待两秒
		b.mouseMove(1500,11);
		b.mousePress(16);//鼠标按下
		b.mouseRelease(16);//鼠标释放
		b.delay(2000);
		b.mouseMove(100, 50);
		b.delay(2);
		b.mousePress(16);//鼠标按下	
		b.mouseRelease(16);//鼠标释放
		b.mousePress(16);//鼠标按下
		b.mouseRelease(16);//鼠标释放
		
	}

}
