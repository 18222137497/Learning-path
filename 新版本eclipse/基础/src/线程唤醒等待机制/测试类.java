package 线程唤醒等待机制;

public class 测试类 {
	public static void main(String[] args) {
	Baozi bz=new Baozi();
	new BaoZiPu(bz).start();
	new Chihuo(bz).start();
}
}
