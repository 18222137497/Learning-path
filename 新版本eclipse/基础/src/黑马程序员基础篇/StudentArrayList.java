package 黑马程序员基础篇;

import java.util.ArrayList;

/**
 * ArrayList ，学生属性
 * @author 汪京
 *
 */
public class StudentArrayList {
	public static void main(String[] args) {
		//创建学生数组
		ArrayList<String> a=new ArrayList<>();
		//创建学生对象
		String s1="刘备";
		String s2="曹操";
		String s3="孙权";
		//打印学生ArrayList集合
		System.out.println(a);
		//把学生当作元素添加到就集合中
		a.add(s1);
		a.add(s2);
		a.add(s3);
		//打印ArrayList集合
		System.out.println(a);
		//获得集合长度
		System.out.println(a.size());
		//获取指定下标的元素
		System.out.println(a.get(0));
		//删除指定下标元素
		a.remove(0);
		//打印集合
		System.out.println(a);
	}
}
