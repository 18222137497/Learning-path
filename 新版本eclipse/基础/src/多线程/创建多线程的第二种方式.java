package 多线程;
/**
 * Runnable接口
 * @author 123
 *
 */
public class 创建多线程的第二种方式 {
	public static void main(String[] args) {
		MyRunnable m=new MyRunnable();
		new Thread(m).start();
		for (int i = 0; i < 20; i++) {
			System.out.println(i);
		}
	}
	

}
class MyRunnable implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(Thread.currentThread().getName()+"-->"+i);
		}
	}
	
}
