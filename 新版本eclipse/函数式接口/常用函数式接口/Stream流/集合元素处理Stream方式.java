package Stream��;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ����Ԫ�ش���Stream��ʽ {
	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("�����Ȱ�");
		list1.add("��Զ��");
		list1.add("���Ǻ�");
		list1.add("ʯ����");
		list1.add("ʯ����");
		list1.add("����");
		list1.add("����");
		list1.add("���߹�");
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("��������");
		list2.add("���޼�");
		list2.add("����ӱ");
		list2.add("������");
		list2.add("�����˹����");
		list2.add("���찮");
		list2.add("�Ŷ���");
		list2.add("������");
		Stream.concat(list1.stream().filter(s->s.length()==3).limit(3), list2.stream().filter(s->s.startsWith("��")).skip(2)).forEach(s->System.out.println(new Person(s)));
				
	}
}
class Person{
	private static String name;
	public Person(String name) {
		this.name=name;
	}
	public String toString() {
		return "Person ["+name+"]";
	}
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		Person.name = name;
	}
}
