package week01;
/**
 * ����
 * @author 123
 *
 */
public class week1{
	/*����*/
	private static String Name;//����
	private static int Age;//����
	private static boolean Gander;//�Ա�
	public static String Gander(boolean x){//�ж��Ա�
		Gander=x;
		if (Gander==true) {
			return "����";
		}else{
		return "����";	
		}
	}
	private static int Height;//���
	private static int Weight;//����
	/*��Ϊ*/
	public void eat(){
		System.out.println(Name+"�ڳ�");
	}
	public void drink(){
		System.out.println(Name+"�ں�");
	}
	public void sleep(){
		System.out.println(Name+"��˯��");
	}
	public void run(){
		System.out.println(Name+"����");
	}
	public void jump(){
		System.out.println(Name+"����");
	}
	public static void week1(String name,int age,boolean gander,int height,int weight){//������ķ�����
		Name =name;
		Age=age;
		Gander=gander;
		Height=height;
		Weight=weight;
		System.out.println("���֣�"+Name+";���䣺"+age+";�Ա�"+Gander(Gander)+";��ߣ�"+Height+"��;���أ�"+Weight+"�");
	}
	public static void main(String[] args) {//������
		week1 w=new week1();//ʵ��������
		w.week1("��", 2, false, 1, 500);//����week1�����Է�������ֵ
		/*���÷���*/
		w.drink();
		w.eat();
		w.jump();
		w.sleep();
		w.run();
	}
}
