package week01;

import java.awt.AWTException;
import java.awt.Robot;

/**
 * ��Ŀ��������갲����������˫�����˫�����ҵĵ���
 * @author 123
 *
 */
public class MouseMove1 {
	public static void main(String[] args) throws AWTException {
		Robot b=new Robot();//��������
		b.delay(2000);//�ӳٵȴ�����
		b.mouseMove(1500,11);
		b.mousePress(16);//��갴��
		b.mouseRelease(16);//����ͷ�
		b.delay(2000);
		b.mouseMove(100, 50);
		b.delay(2);
		b.mousePress(16);//��갴��	
		b.mouseRelease(16);//����ͷ�
		b.mousePress(16);//��갴��
		b.mouseRelease(16);//����ͷ�
		
	}

}
