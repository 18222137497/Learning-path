package ����Ȩ���ڲ�����������;

import java.util.ArrayList;
import java.util.List;

/**
 * �ӿ���Ϊ���������ͷ���ֵ����
 * ������
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
		//��������ż���ļ���
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
