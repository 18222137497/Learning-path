
package Stream��;
/**
 * Stream�����ڹܵ�������һ�ξ͹رգ�����û��Ҫ�ö��������
 */
import java.util.stream.Stream;

/*
 * Stream���е��ս᷽����
 * 		forEach(Consumer(<? super T> action);
 * 		long count();����Ԫ�ظ���
 * Stream���еĹ��˷�����
 * 		filter(Predicate(<? super T> predicate));
 * 		ʹ��Predicate�еķ���test�ж�ɸѡ����
 * Stream���е�ӳ�䷽����
 * 		map(Function<T,R> fun);
 * 		��һ��һ������ת������һ����������
 * Stream���н�ȡǰn��Ԫ�صķ�����
 * 		Stream<T> limit(long l);
 * Stream���е�����������
 * 		Stream<T> skip(long l);
 * 		����ǰl��Ԫ�أ��������Ԫ�ش���һ���µ�Stream��
 * Stream���еĺϲ�������
 * 		Stream<T> Stream.concat(Stream<? extends T> s1,Stream<? extends T> s2)
 */
public class Stream�еķ��� {
	public static void main(String[] args) {
		Stream.of("����","����","����","����").forEach(s->System.out.print(s+"	"));//forEach�ս᷽��
		System.out.println();
		Stream.of("����","����","����","����").filter(s->s.startsWith("��"))//filter���˷���
			  .forEach(s->System.out.println(s));
		Stream.of("1","2","3","4").map(s->Integer.parseInt(s))//mapӳ�䷽��
		.forEach(s->System.out.print(s+"	"));
		System.out.println();
		System.out.println(Stream.of("1","2","3","4").count());//count�ս᷽��������long
		Stream.of("1","2","3","4").limit(2).forEach(s->System.out.print(s+"	"));//limit��ȡ����
		System.out.println();
		Stream.of("1","2","3","4").skip(2).forEach(s->System.out.print(s+"	"));//skip��������
		System.out.println();
		Stream.concat(Stream.of("��","��"), Stream.of("1","2")).forEach(s->System.out.print(s+"	"));//concat�ϲ�����
	}
}