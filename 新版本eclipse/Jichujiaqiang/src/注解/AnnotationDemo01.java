package ע��;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * �Զ���ע��
 * 	��ʽ��
 * 	Ԫע��
 * 	public @interface ע������{
 * 			�����б�
 * }
 * 	���ʣ�ע�Ȿ���Ͼ���һ���ӿڣ��ýӿ�Ĭ�ϼ̳�Annotation�ӿ�
 * 	public interface AnnotationDemo01 extends java.lang.annotation.Annotation
 * @author 123
 * @version 1.0
 * @since 1.5
 *
 */
@Target(value= {ElementType.TYPE})//ע��ֻ�ܱ��������ϣ���Դ�룡
@Retention(RetentionPolicy.RUNTIME)//�Լ������ע��һ�㶼ʹ��RUNTIME
@Documented//����ע���Ƿ񱻳�ȡ��api�ĵ���
@Inherited//����ע���Ƿ�����̳�
public @interface AnnotationDemo01 {
	/*
	 * ���ԣ��ӿ��еĳ��󷽷�
	 * 	Ҫ��
	 * 		1.���ԵķŻ�ֵ������ȡֵ��
	 * 				������������
	 * 				String
	 * 				ö��
	 * 				ע��
	 * 				�������͵�����
	 * 		2.���������ԣ���ʹ��ʱҪ�����Ը�ֵ
	 * 			1.�����������ʱʹ��default�ؼ��ָ����Ե�����ʱvalue����ʹ��ע��ʱ�����Բ��������Ը�ֵ
	 * 			2.���ֻ��һ��������Ҫ��ֵʱ���������Ե�����ʱvalue����value����ʡ�ԣ�ֱ�Ӷ���ֵ����
	 * 			3.���鸳ֵʱ��ֵʹ��{}���������������ֻ��һ��ֵ����{}����ʡ��
	 */
	int age();
	String name();
	String name1() default "����";//name1Ĭ��Ϊ����
	Person per();//ö��
//	Override o();//ע��

}
