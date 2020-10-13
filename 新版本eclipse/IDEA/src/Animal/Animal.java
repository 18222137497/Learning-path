package Animal;

import java.util.Arrays;

public class Animal {
	String name;
	String like;
	int age;
	double weight;
	double height;
	int[] site;//λ��
	boolean live;
	public Animal() {
		name=null;
		like=null;
		age=0;
		weight=0;
		height=0;
		site=new int[3];
		for (int i = 0; i < site.length; i++) {
			site[i]=0;
		} 
		live=false;
	}
	public Animal(String name,String like,int age,double weight,double height,int[] site,boolean live) {
		this.name=name;
		this.like=like;
		this.age=age;
		this.weight=weight;
		this.height=height;
		this.site=site;
		this.live=live;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getlike() {
		return like;
	}
	public void setLike(String like) {
		this.like = like;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public int[] getSite() {
		return site;
	}
	public void setSite(int[] site) {
		this.site = site;
	}
	public boolean isLive() {
		return live;
	}
	public void setLive(boolean live) {
		this.live = live;
	}
	public String toString() {
		return "����[����=" + name + ", ϲ��=" + like + ", ����=" + age + ", ����=" + weight + ", ���=" + height
				+ ", λ��=" + Arrays.toString(site) + ", ����״̬��=" + live + "]";
	}
	

}
