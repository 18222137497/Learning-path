package �̳����̬;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Ⱥ����ƴ�������
 * 
 * @author 123
 *
 */
public class ShareMoney {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		QunZhu z1 = new QunZhu("Ⱥ���ϴ�", 200);//����Ⱥ������
		System.out.print("���������ܽ�");
		double money = scan.nextDouble();
		System.out.print("��������������");
		int count = scan.nextInt();
		ArrayList<Double> sendList = z1.send(money, count);//���÷�����������������
		if (sendList == null) {//�����ǮС��Ҫ����Ǯ
			System.out.println("������㣡����");
			return;
		}
		Member m1 = new Member();//�������������
		Member m2 = new Member();
		Member m3 = new Member();
		Member m4 = new Member();
		
		System.out.println(m1);//�����֮ǰ������
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		System.out.println(z1);
		
		m1.openHongBao(sendList);//����˳�������
		m2.openHongBao(sendList);
		m3.openHongBao(sendList);
		m4.openHongBao(sendList);
		z1.openHongBao(sendList);
		
		System.out.println(m1);//������������
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		System.out.println(z1);
	}

}

class User {//����
	private String name;//����
	private double leftMoney;

	public User() {//δ������û�Ǯ�����û�Ǯ��Ϊ0
		leftMoney = 0;
	}

	public User(String name, double leftMoney) {//��ʼ������
		this.leftMoney = leftMoney;
		this.name = name;
	}

	public void openHongBao(ArrayList<Double> l) {//�����
		if (l.size()==0) {//������������
			System.out.println(getName()+"û����");
			return;
		}
		Random r = new Random();//������û����
		int index = r.nextInt(l.size());//������һ�������±�
		double getmoney = l.remove(index);//��õ�ǰ�±��Ԫ�أ�������getmoney
		addMoney(getmoney);//��������Ǯ�����Լ���ʣ��Ǯ��
		
	}

	public void addMoney(double money) {//��Ǯ���� 
		leftMoney += money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getLeftMoney() {
		return leftMoney;
	}

	public void setLeftMoney(double leftMoney) {
		this.leftMoney = leftMoney;
	}

	public String toString() {
		return "User [name=" + name + ", leftMoney=" + leftMoney + "]";
	}

}

class QunZhu extends User {
	public QunZhu() {//�������Լ̳и�������
		super();
	}

	public QunZhu(String name, double leftMoney) {//���෽���̸��෽��
		super(name, leftMoney);
	}

	public ArrayList<Double> send(double money, int count) {//���������
		double leftMoney = getLeftMoney();
		ArrayList<Double> l = new ArrayList<>();
		Random r = new Random();
		if (money > leftMoney) {//Ǯ�Ƿ񹻷����
			return null;
		}
		setLeftMoney(leftMoney - money);//ʣ��Ǯ������ԭ��Ǯ��-������Ǯ��
		boolean TT = false;//����һ������
		int[] irr = new int[count];//����һ����������
		int z = 0;//����һ���ж�����
		do {//��ÿ�����������ٷֱ�
			for (int i = 0; i < count; i++) {
				irr[i] = r.nextInt(100);//���������鸳ֵ
			}
			for (int i = 0; i < irr.length; i++) {
				z += irr[i];//���ж����鸳ֵ��
			}
			if (z != 100) {//�ж��������������Ԫ�صĺ��Ƿ����100��������Ǽ���ѭ��
				TT = false;
				z = 0;
			}
			if(z==100){//֪�����������Ԫ�غ�Ϊ100��
				TT = true;
			}
		} while (TT == false);
		for (int i = 0; i < count; i++) {//��Ҫ����Ǯ���ֳ�ָ���ķ���������ÿ��������Ǯ
			l.add((double) (irr[i] / 100.0 * money));
		}
		return l;
	}
}

class Member extends User {
	public Member() {
		super();
	}

	public Member(String name, double leftMoney) {
		super(name, leftMoney);
	}
}