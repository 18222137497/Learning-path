package 常量权限内部类引用类型;

import 常量权限内部类引用类型.Person.Heart;//内部类调用需要导包！！！长见识了

/**
 * 内部类
 * 内部类可以直接访问外部类对象以及私有属性
 * 外部内要访问内部类的成员必须要先建立内部类的对象
 * 内部类的.class文件会有一个$符号，例：Person$Heart.class
 * @author 123
 *
 */
public class InsideClass {
	public static void main(String[] args) {
		//创建外部类对象
		Person p=new Person();
		//创建内部类对象
		Heart h=p.new Heart();
		h.jump();
		p.setLive(false);
		h.jump();
	}
	
}
class Person{
	private boolean live=true;
	class Heart{//心脏
		public void jump() {//跳动
			if (live) {
				System.out.println("心脏跳动");
			}else {
				System.out.println("心脏停止跳动");
			}
		}
	}
	public boolean isLive() {
		return live;
	}
	public void setLive(boolean live) {
		this.live=live;
	}
}
