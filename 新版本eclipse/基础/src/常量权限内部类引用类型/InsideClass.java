package ����Ȩ���ڲ�����������;

import ����Ȩ���ڲ�����������.Person.Heart;//�ڲ��������Ҫ��������������ʶ��

/**
 * �ڲ���
 * �ڲ������ֱ�ӷ����ⲿ������Լ�˽������
 * �ⲿ��Ҫ�����ڲ���ĳ�Ա����Ҫ�Ƚ����ڲ���Ķ���
 * �ڲ����.class�ļ�����һ��$���ţ�����Person$Heart.class
 * @author 123
 *
 */
public class InsideClass {
	public static void main(String[] args) {
		//�����ⲿ�����
		Person p=new Person();
		//�����ڲ������
		Heart h=p.new Heart();
		h.jump();
		p.setLive(false);
		h.jump();
	}
	
}
class Person{
	private boolean live=true;
	class Heart{//����
		public void jump() {//����
			if (live) {
				System.out.println("��������");
			}else {
				System.out.println("����ֹͣ����");
			}
		}
	}
	public boolean isLive() {
		return live;
	}
	public void setLive(boolean live) {
		this.live=live;
	}
}
