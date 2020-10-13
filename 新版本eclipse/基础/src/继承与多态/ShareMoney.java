package 继承与多态;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * 群主发拼手气红包
 * 
 * @author 123
 *
 */
public class ShareMoney {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		QunZhu z1 = new QunZhu("群主老大", 200);//设置群主属性
		System.out.print("请输入红包总金额：");
		double money = scan.nextDouble();
		System.out.print("请输入红包数量：");
		int count = scan.nextInt();
		ArrayList<Double> sendList = z1.send(money, count);//调用发红包方法，传入参数
		if (sendList == null) {//手里的钱小于要发的钱
			System.out.println("你的余额不足！！！");
			return;
		}
		Member m1 = new Member();//创建抢红包的人
		Member m2 = new Member();
		Member m3 = new Member();
		Member m4 = new Member();
		
		System.out.println(m1);//输出抢之前的属性
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		System.out.println(z1);
		
		m1.openHongBao(sendList);//代码顺序抢红包
		m2.openHongBao(sendList);
		m3.openHongBao(sendList);
		m4.openHongBao(sendList);
		z1.openHongBao(sendList);
		
		System.out.println(m1);//输出抢后的属性
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		System.out.println(z1);
	}

}

class User {//父类
	private String name;//属性
	private double leftMoney;

	public User() {//未定义的用户钱数的用户钱数为0
		leftMoney = 0;
	}

	public User(String name, double leftMoney) {//初始化属性
		this.leftMoney = leftMoney;
		this.name = name;
	}

	public void openHongBao(ArrayList<Double> l) {//抢红包
		if (l.size()==0) {//如果红包抢光了
			System.out.println(getName()+"没抢到");
			return;
		}
		Random r = new Random();//如果红包没抢光
		int index = r.nextInt(l.size());//随机获得一个集合下标
		double getmoney = l.remove(index);//获得当前下标的元素，并付给getmoney
		addMoney(getmoney);//将抢到的钱加入自己的剩余钱数
		
	}

	public void addMoney(double money) {//加钱方法 
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
	public QunZhu() {//子类属性继承父类属性
		super();
	}

	public QunZhu(String name, double leftMoney) {//子类方法继父类方法
		super(name, leftMoney);
	}

	public ArrayList<Double> send(double money, int count) {//发红包方法
		double leftMoney = getLeftMoney();
		ArrayList<Double> l = new ArrayList<>();
		Random r = new Random();
		if (money > leftMoney) {//钱是否够发红包
			return null;
		}
		setLeftMoney(leftMoney - money);//剩余钱数等于原来钱数-发出的钱数
		boolean TT = false;//设置一个开关
		int[] irr = new int[count];//设置一个容纳数组
		int z = 0;//设置一个判断数组
		do {//给每个红包分配金额百分比
			for (int i = 0; i < count; i++) {
				irr[i] = r.nextInt(100);//给容纳数组赋值
			}
			for (int i = 0; i < irr.length; i++) {
				z += irr[i];//给判断数组赋值，
			}
			if (z != 100) {//判断容纳数组的所有元素的和是否等于100，如果不是继续循环
				TT = false;
				z = 0;
			}
			if(z==100){//知道容纳数组的元素和为100，
				TT = true;
			}
		} while (TT == false);
		for (int i = 0; i < count; i++) {//将要发的钱数分成指定的份数，并给每个红包里放钱
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