package com.tarena.yadx.accesscontrol;
/**
 * Static
 * @author 123
 *
 */
public class TestStatic {

	/*
	 *һ��Static���γ�Ա����
	 *  1.��Static���εĳ�Ա���������ڶ�������ݽṹ
	 *  2.static������������ı�����ͨ������ʹ������������Static��Ա
	 *  3.static��Ա�����������Ϣһ��洢�ڷ������ж������ڶ��У�һ
	 *    �����static��Ա����ֻ��1�ݣ����۸��ഴ���˶��ٶ��� 
	 *����static���η���
	 *  1.ͨ���ķ��������漰���Ծ������Ĳ�������Щ�����ڵ���ʱ����ʽ
	 *    ���ݶ��������this    
	 *     p1.sing();  p1->this
	 *  2.static���εķ�������Ҫ���ĳЩ������в����������н������
	 *  ������Ĳ����йأ�����ʱֱ��ʹ������
	 *       Person.sing();
	 *    ��static���εķ����в���ʹ��this�ؼ���
	 *  3.����static�ڵ���ʱû�о���Ķ��������static�����в��ܶԷ�
	 *    static��Ա���з��ʣ�static�����ṩһЩ�����߷�������������
	 *    ̬�������ܷ��ʷǾ�̬������
	 * ����static��
	 *  1.static�飺������Ĵ���飬��������ڼ�ִ�еĴ���飬ִֻ��һ
	 *    �Σ���������������м��ؾ�̬��Դ
	 *    static{....} 
	 *      
	 */
	static{
		System.out.println("static�顣����");
	}
	public static void sing(){
		System.out.println("sing.....static....");
	}
	public void dance(){
		System.out.println("dance.......");
		
	}
}







