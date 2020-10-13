package 常量权限内部类引用类型;

import java.util.ArrayList;
import java.util.List;

/**
 * 接口作为方法参数和返回值类型
 * 测试类
 * @author 123
 *
 */
public class InterfaceType {
	public static void main(String[] args) {
		ArrayList<Integer> srcList=new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			srcList.add(i);
		}
		List list=getEvenNum(srcList); 
		System.out.println(list);
	}
	public static List<Integer> getEvenNum(List<Integer> list){
		//创建保存偶数的集合
		ArrayList<Integer> evenList=new ArrayList<Integer>();
		for (int i = 0; i < list.size(); i++) {
			Integer integer=list.get(i);
			if (integer%2==0) {
				evenList.add(integer);
			}
		}
		return evenList;
	}
}
