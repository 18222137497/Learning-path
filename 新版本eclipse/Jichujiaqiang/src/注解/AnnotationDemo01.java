package 注解;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解
 * 	格式：
 * 	元注解
 * 	public @interface 注解名称{
 * 			属性列表
 * }
 * 	本质：注解本质上就是一个接口，该接口默认继承Annotation接口
 * 	public interface AnnotationDemo01 extends java.lang.annotation.Annotation
 * @author 123
 * @version 1.0
 * @since 1.5
 *
 */
@Target(value= {ElementType.TYPE})//注解只能被用在类上，看源码！
@Retention(RetentionPolicy.RUNTIME)//自己定义的注解一般都使用RUNTIME
@Documented//描述注解是否被抽取到api文档中
@Inherited//描述注解是否被子类继承
public @interface AnnotationDemo01 {
	/*
	 * 属性：接口中的抽象方法
	 * 	要求：
	 * 		1.属性的放回值有下列取值：
	 * 				基本数据类型
	 * 				String
	 * 				枚举
	 * 				注解
	 * 				以上类型的数组
	 * 		2.定义了属性，在使用时要给属性赋值
	 * 			1.如果定义属性时使用default关键字给属性的名称时value，则使用注解时，可以不进行属性赋值
	 * 			2.如果只有一个属性需要赋值时，并且属性的名称时value，则value可以省略，直接定义值即可
	 * 			3.数组赋值时，值使用{}包裹。如果数组中只有一个值，则{}可以省略
	 */
	int age();
	String name();
	String name1() default "张三";//name1默认为张三
	Person per();//枚举
//	Override o();//注解

}
