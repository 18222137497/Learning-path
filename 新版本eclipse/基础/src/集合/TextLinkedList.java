package ����;

import java.util.LinkedList;

/**
 * java.util.LinedList    implements List�ӿ�
 * 	�ص㣺
 * 		1.�ײ�������
 * 		2.�����������������λԪ�صķ���
 * 		ע�⣺ʹ��LinkedList�������еķ���������ʹ�ö�̬
 * 	public void push(E e);//��Ԫ��������б�����ʾ�Ķ�ջ,��Ч��addFirst
 * 	public E pop();//�Ӵ��б�����ʾ�Ķ�ջ�е���һ��Ԫ�أ���Ч��removeFirst
 * 	public boolean isEmpty();//����б�����Ԫ�أ��򷵻�true
 * 	clear();//���Ԫ��
 * @author 123
 *
 */
public class TextLinkedList {
	public static void main(String[] args) {
	LinkedList<String> l=new LinkedList<>();
	l.add("1");
	l.add("2");
	l.push("3");//��Ԫ�ش����һ��λ��
	l.push("4");
	l.pop();//ɾ����һ��Ԫ��
	System.out.println(l);
	}
}
