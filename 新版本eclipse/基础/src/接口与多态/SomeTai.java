package �ӿ����̬;
/**
 * ��̬      instanceof�ؼ���
 * @author 123
 *
 */
public class SomeTai {
	public static void main(String[] args) {
		ZA f=new ZA();
		Fu F=new ZB();//����ת��
	  //Fu ff=new Fu();//�����಻�ܱ�ʵ����             
		ZB z=(ZB)F;//����ת�ͣ�����ת�ͺ���ܵ���������еķ���
		z.ABC();
		f.ABC();
	  //F.ABC();(����)���ֶ�̬��ʽֻ�ܵ���������д�ĸ��෽�������ܵ��������ж�����û�еķ���
		showMe(f);
		showMe(F);
		System.out.println(f instanceof Fu);//������  instanceof ��������
		
	}
	public static void showMe(Fu f){//��̬
		f.run();
	}
}
abstract class Fu{
	public abstract void run();
}
class ZA extends Fu{
	public void run() {
		System.out.println("100m/s");
	}
	public void ABC() {
		System.out.println("ABC");
	}
}
class ZB extends Fu{
	public void run() {
		System.out.println("200m/s");
	}
	public void ABC() {
		System.out.println("ABC");
	}
}
