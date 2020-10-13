package 注解;
/**
 * 元注解：用于描述注解的注解
 * 		1.@Target:描述注解能作用的位置
 * 			ElementType取值：
 * 				TYPE:可以被作用在类上
 * 				METHOD:可以被作用在方法上
 * 				FIELD:可以被作用在成员变量上
 * 		2.@Retention:描述注解被保留的阶段
 * 			@Retention(RetentionPolicy.RUNTIME):当前被描述的注解会保存到class字节码文件中，并被JVM读取到，一般都要加这个
 * 		3.@Documented:描述注解是否被抽取到api文档中
 * 		4.@Inherited:描述注解是否被子类继承
 * 		
 * @author 123
 *
 */
public class 元注解 {

}
