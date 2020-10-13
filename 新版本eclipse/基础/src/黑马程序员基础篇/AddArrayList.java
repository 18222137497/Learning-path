package 黑马程序员基础篇;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 数值添加到集合
 * @author 123
 *
 */
public class AddArrayList {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		Random r=new Random();
		
		for (int i = 0; i < 6; i++) {
			int x=r.nextInt(33);
			l.add(x);
		}
		System.out.println(l);
		for (int i = 0; i < l.size(); i++) {
			System.out.println("下标为"+i+"的值为："+l.get(i));
		}
	}
	
}
