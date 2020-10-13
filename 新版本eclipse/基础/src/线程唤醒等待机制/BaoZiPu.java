package 线程唤醒等待机制;
/**
 * 包子铺
 * 	注意：包子铺线程与包子线程关系-->通信（互斥）
 * 		必须同时同步技术，保证两个线程只有一个在执行
 * 		锁对象必须保证唯一，可以使用包子对象作为锁对象
 * 		包子铺类和吃货类就需要把包子对象作为参数传递进来
 * 			1.需要在成员位置创建一个包子变量
 * 			2.使用带参数构造方法为这个包子赋值
 * @author 123
 *
 */
public class BaoZiPu extends Thread{
	private Baozi bz;
	public BaoZiPu(Baozi bz) {
		this.bz =bz;
	}
	//设置线程任务 ：生产包子
	@Override
		public void run() {
		int count=0;
		while(true) {
			synchronized(bz) {
				if (bz.flag==true) {
					//包子铺进入等待唤醒状态
					try {
						bz.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				if (count%2==0) {
					bz.pi="薄皮";
					bz.xian="三鲜馅";
				}else {
					bz.pi="冰皮";
					bz.xian="牛肉馅";
				}
				count++;
				System.out.println("包子铺正在生产"+bz.pi+bz.xian+"包子");
				try {//生产包子需要3秒
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				bz.flag=true;
				bz.notify();
				System.out.println(bz.pi+bz.xian+"包子已经做好，可以吃了");
				
				
			}
		}
		}
}
