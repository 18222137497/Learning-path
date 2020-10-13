package USB;

/**
 * ����
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
		System.out.println("���Կ�����");
	}
	public void useUSB(USB u) {
		if (u!=null) {
			u.open();
			if (u instanceof Mouse) {
				((Mouse) u).click();//����Ҳ������ת�ͣ���
			}
			if (u instanceof KeyBoard) {
				((KeyBoard) u).type();
			}
			u.close();
		}else {
			System.out.println("��USBʹ�ã�");
		}
	}
	public void close() {
		System.out.println("���Թػ���");
	}
}
