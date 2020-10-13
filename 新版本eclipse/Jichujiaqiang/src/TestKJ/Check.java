package TestKJ;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 注解
 * @author 123
 *
 */

@Target({ElementType.METHOD})//注解作用在方法上
@Retention(RetentionPolicy.RUNTIME)//这个必须要加    //当前被描述的注解会保存到class字节码文件中，并被JVM读取到
public @interface Check {

}
