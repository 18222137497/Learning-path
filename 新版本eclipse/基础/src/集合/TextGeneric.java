package ����;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ���͵ĸ߼��÷�
 * <? extends E>ֻ��ʹ��E��E����������
 * <? super E>ֻ��ʹ��E��E�ĸ�������
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
	  //getElement1(c2);      String���Ͳ���Number������
		getElement1(c3);
	  //getElement1(c4);      Object���Ͳ���Number������
		
	  //getElement2(c1);	  Integer����Number�ĸ���
      //getElement2(c2);	  String����Number�ĸ���
		getElement2(c3);
		getElement2(c4);
	}
	public static void getElement1(Collection<? extends Number> c) {}//����Number��Number������
	public static void getElement2(Collection<? super Number> c) {}//����Number��Number�ĸ���
}
