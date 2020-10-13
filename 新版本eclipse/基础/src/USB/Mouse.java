package USB;
/**
 * 鼠标
 * @author 123
 *
 */
public class Mouse implements USB{
	public void open() {
		System.out.println("鼠标灯亮了！");
	}
	public void close() {
		System.out.println("鼠标等灭了！");
	}
	public void click() {
		System.out.println("鼠标点击！");
	}

}
