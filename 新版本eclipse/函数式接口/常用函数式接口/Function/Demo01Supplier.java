package Function;

import java.util.function.Supplier;

/*
 *	java.util.function.Supplier<T> �ӿڰ���һ���޲εķ�����T get();������ȡһ�����Ͳ���ָ�����͵Ķ�������
 *
 *	����ӿ�Ҳ����֮Ϊ�����ͽӿڣ�ָ���ӿڵķ�����ʲô���ͷ���ʲô���͵�����
 */
public class Demo01Supplier {
	public static void main(String[] args) {
		System.out.println(getSupplier(()->"���Լ�"));
	}
	public static String getSupplier(Supplier<String> sup) {
		return sup.get();
	}
}
