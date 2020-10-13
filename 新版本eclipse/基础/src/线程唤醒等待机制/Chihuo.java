package 线程唤醒等待机制;

public class Chihuo extends Thread{
	private Baozi bz;
	public Chihuo(Baozi bz) {
		this.bz=bz;
	}
	@Override
	public void run() {
		while (true) {
			synchronized (bz) {
				if (bz.flag==false) {
					try {
						bz.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				//被唤醒之后执行吃包子
				System.out.println("吃货正在吃"+bz.pi+bz.xian+"包子");
				bz.flag=false;
				bz.notify();
				System.out.println("吃货已经吃完"+bz.pi+bz.xian+"包子,包子铺开始生产");
				System.out.println("-------------------------------");
			}
			
		}
	}
}
