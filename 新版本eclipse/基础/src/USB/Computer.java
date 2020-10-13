package USB;

/**
 * 电脑
 * @author 123
 *
 */
public class Computer {
	public static void main(String[] args) {
		Computer c=new Computer();
		Mouse m=new Mouse();
		KeyBoard k=new KeyBoard();
		c.open();
		c.useUSB(m);
		c.close();
	}
	public void open() {
		System.out.println("电脑开机！");
	}
	public void useUSB(USB u) {
		if (u!=null) {
			u.open();
			if (u instanceof Mouse) {
				((Mouse) u).click();//这样也是向下转型！！
			}
			if (u instanceof KeyBoard) {
				((KeyBoard) u).type();
			}
			u.close();
		}else {
			System.out.println("无USB使用！");
		}
	}
	public void close() {
		System.out.println("电脑关机！");
	}
}
