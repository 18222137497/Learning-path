package TestKJ;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ע��
 * @author 123
 *
 */

@Target({ElementType.METHOD})//ע�������ڷ�����
@Retention(RetentionPolicy.RUNTIME)//�������Ҫ��    //��ǰ��������ע��ᱣ�浽class�ֽ����ļ��У�����JVM��ȡ��
public @interface Check {

}
