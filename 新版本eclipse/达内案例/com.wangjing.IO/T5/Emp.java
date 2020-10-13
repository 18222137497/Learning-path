package T5;

import java.io.Serializable;

public class Emp implements Serializable {// 被序列化的类要实现这个接口
	/* 规定一个序列号，这个属性的必须是静态的最终的long类型的名字必须是serialVersionUID严格区分大小写 */
	private static final long serialVersionUID = 2l;
	public String name;
	public int age;

	public Emp() {
	}

	public Emp(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {// 必须重写toString方法
		return "Emp [name=" + name + ", age=" + age + "]";
	}

}
