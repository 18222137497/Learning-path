package com.tarena.yadx.inner;
/**
 * �ⲿ��
 * @author 123
 *
 */
public class Outer {
	private int time;
	private Inner inner;//inner�����
	//���췽��
	Outer(int time){
		this.time=time;//��������ֵ����
		inner=new Inner();//ʵ�����ڲ���
		inner.timeAdd();
	}
	public void printTime(){
		System.out.println(time);
	}
	//�ڲ���
	class Inner{
		//�ڲ��෽��
		public void timeAdd(){
			time++;//�����ⲿ�����ԣ�˽�У�
		}
	}
	public static void main(String[] args) {
		Outer outer=new Outer(100);
		outer.printTime();//101
		/*
		 * ��������������Ϊ101����Outer���췽���д���Inner�������һ����ʽ������ָ�򴴽�����Outer����
		 * ����Inner�����timeAdd���������Outer�����Խ��в���
		 */
	}

}
