package T5;

import java.io.Serializable;

public class Emp implements Serializable {// �����л�����Ҫʵ������ӿ�
	/* �涨һ�����кţ�������Եı����Ǿ�̬�����յ�long���͵����ֱ�����serialVersionUID�ϸ����ִ�Сд */
	private static final long serialVersionUID = 2l;
	public String name;
	public int age;

	public Emp() {
	}

	public Emp(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {// ������дtoString����
		return "Emp [name=" + name + ", age=" + age + "]";
	}

}
