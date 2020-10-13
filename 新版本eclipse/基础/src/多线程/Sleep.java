package 多线程;
/**
 * Thread.sleep(long 毫秒)，使线程睡眠（时隔多少毫秒启动一次）
 * @author 123
 *
 */
public class Sleep {
	public static void main(String[] args) {
	for (int i = 1; i < 61; i++) {
		System.out.println(i);
		try {
			Thread.sleep(1000);//一千毫秒等于一秒
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
}
