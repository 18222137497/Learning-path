package com.tarena.yadx.objectandclass;

public class TestBird {
	public static void main(String[] args) {
		Bird a=new Bird();
		a.name="С��";
		a.color='��';
		a.breed="��ȸ";
		a.weight=5.00;
		//�����Խ��и�ֵ
		System.out.println(a.name);
		System.out.println(a.color);
		System.out.println(a.breed);
		System.out.println(a.weight);
		String name=a.name;
		char color=a.color;
		String breed=a.breed;
		double weight=a.weight;
		//ֵ����
		a.show(name,color,breed,weight);//��������С�񷽷�show
		
		
		
	}

}
