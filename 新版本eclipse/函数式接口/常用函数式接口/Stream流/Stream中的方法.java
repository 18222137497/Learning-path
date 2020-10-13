
package Stream流;
/**
 * Stream流属于管道流，用一次就关闭，所以没必要用对象接收流
 */
import java.util.stream.Stream;

/*
 * Stream流中的终结方法：
 * 		forEach(Consumer(<? super T> action);
 * 		long count();返回元素个数
 * Stream流中的过滤方法：
 * 		filter(Predicate(<? super T> predicate));
 * 		使用Predicate中的方法test判断筛选过滤
 * Stream流中的映射方法：
 * 		map(Function<T,R> fun);
 * 		将一个一种类型转换成另一种类型数据
 * Stream流中截取前n个元素的方法：
 * 		Stream<T> limit(long l);
 * Stream流中的跳过方法：
 * 		Stream<T> skip(long l);
 * 		跳过前l个元素，将后面的元素创建一个新的Stream流
 * Stream流中的合并方法：
 * 		Stream<T> Stream.concat(Stream<? extends T> s1,Stream<? extends T> s2)
 */
public class Stream中的方法 {
	public static void main(String[] args) {
		Stream.of("张三","李四","王五","赵六").forEach(s->System.out.print(s+"	"));//forEach终结方法
		System.out.println();
		Stream.of("张三","李四","王五","赵六").filter(s->s.startsWith("张"))//filter过滤方法
			  .forEach(s->System.out.println(s));
		Stream.of("1","2","3","4").map(s->Integer.parseInt(s))//map映射方法
		.forEach(s->System.out.print(s+"	"));
		System.out.println();
		System.out.println(Stream.of("1","2","3","4").count());//count终结方法，返回long
		Stream.of("1","2","3","4").limit(2).forEach(s->System.out.print(s+"	"));//limit截取方法
		System.out.println();
		Stream.of("1","2","3","4").skip(2).forEach(s->System.out.print(s+"	"));//skip跳过方法
		System.out.println();
		Stream.concat(Stream.of("我","你"), Stream.of("1","2")).forEach(s->System.out.print(s+"	"));//concat合并方法
	}
}