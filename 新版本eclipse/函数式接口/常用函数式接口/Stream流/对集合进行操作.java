package Stream流;

import java.util.ArrayList;

public class 对集合进行操作 {
	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("张无忌");
		a.add("周芷若");
		a.add("赵敏");
		a.add("张强");
		a.add("张三丰");
		a.stream()//获取集合的stream流
		.filter(s->s.startsWith("张"))//参数为Predicate接口的方法，目的为了判断，返回值式Stream<T>
		.filter(s->s.length()==3)
		.forEach(s->System.out.println(s));//参数式Consumer接口的方法，目的为了消费数据，返回值为空
		
				
	}
}
