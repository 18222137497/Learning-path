package �Լ�����С����;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
/**
 * �ɼ�¼��
 * @author 123
 *
 */
public class Class{
	public static void main(String[] args) {
		Map<String,Integer> m=new HashMap<String,Integer>();
		System.out.print("�����뱾��������");
		Scanner s1=new Scanner(System.in);
		int number=s1.nextInt();
		System.out.println("������ѧ����Ϣ������,�ɼ�����");
		for (int i = 0; i < number; i++) {
			Scanner s2=new Scanner(System.in);
			String name1=s2.next();
			Scanner s3=new Scanner(System.in);
			Integer i1=s3.nextInt();
			m.put(name1, i1);
		}
		Set ss=m.keySet();
		Iterator it=ss.iterator();
		Integer ZCJ = 0;
		Integer[] arr=new Integer[number]; 
		int z=0;
		while (it.hasNext()) {
			Object obj=it.next();
			System.out.println("ѧ��������"+obj+"	ѧ���ɼ���"+m.get(obj));
			ZCJ+=m.get(obj);
			arr[z]=m.get(obj);
			z++;
		}
		Arrays.sort(arr);
		Iterator c=getKeys(m,arr[0]).iterator();
		while(c.hasNext()){
			Object obj=c.next();
			System.out.println("�ɼ���͵��ǣ�"+obj+"	"+m.get(obj));
		}
		Integer PJC=ZCJ.intValue()/number;
		System.out.println("�ܳɼ�Ϊ��"+ZCJ+"	ƽ���ɼ�Ϊ��"+PJC);
		
		
	}

public static <K, V> Set<K> getKeys(Map<K, V> map, V value) {//����ֵ�Ҽ��ķ�����һֵ�ɶ�Ӧ���
    Set<K> keys = new HashSet<>();
    for (Entry<K, V> entry : map.entrySet()) {//?????????
        if (entry.getValue().equals(value)) {
            keys.add(entry.getKey());
        }
    }
    return keys;
}
class Person {
	String name;
	int grade;
	public Person(String name, int grade) {
		super();
		this.name = name;
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", grade=" + grade + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + grade;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (grade != other.grade)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	}}