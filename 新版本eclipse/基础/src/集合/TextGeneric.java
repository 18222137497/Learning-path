package 集合;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 泛型的高级用法
 * <? extends E>只能使用E或E的子类类型
 * <? super E>只能使用E或E的父类类型
 * @author 123
 *
 */
public class TextGeneric {
	public static void main(String[] args) {
		Collection<Integer> c1=new ArrayList<Integer>();
		Collection<String> c2=new ArrayList<String>();
		Collection<Number> c3=new ArrayList<Number>();
		Collection<Object> c4=new ArrayList<Object>();
		getElement1(c1);
	  //getElement1(c2);      String类型不是Number的子类
		getElement1(c3);
	  //getElement1(c4);      Object类型不是Number的子类
		
	  //getElement2(c1);	  Integer不是Number的父类
      //getElement2(c2);	  String不是Number的父类
		getElement2(c3);
		getElement2(c4);
	}
	public static void getElement1(Collection<? extends Number> c) {}//接收Number和Number的子类
	public static void getElement2(Collection<? super Number> c) {}//接受Number和Number的父类
}
