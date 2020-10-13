package week01;
/**
 * 动物
 * @author 123
 *
 */
public class week1{
	/*属性*/
	private static String Name;//名字
	private static int Age;//年龄
	private static boolean Gander;//性别
	public static String Gander(boolean x){//判断性别
		Gander=x;
		if (Gander==true) {
			return "雄性";
		}else{
		return "雌性";	
		}
	}
	private static int Height;//身高
	private static int Weight;//体重
	/*行为*/
	public void eat(){
		System.out.println(Name+"在吃");
	}
	public void drink(){
		System.out.println(Name+"在喝");
	}
	public void sleep(){
		System.out.println(Name+"在睡觉");
	}
	public void run(){
		System.out.println(Name+"在跑");
	}
	public void jump(){
		System.out.println(Name+"在跳");
	}
	public static void week1(String name,int age,boolean gander,int height,int weight){//动物类的方法体
		Name =name;
		Age=age;
		Gander=gander;
		Height=height;
		Weight=weight;
		System.out.println("名字："+Name+";年龄："+age+";性别："+Gander(Gander)+";身高："+Height+"米;体重："+Weight+"斤。");
	}
	public static void main(String[] args) {//主方法
		week1 w=new week1();//实例化对象
		w.week1("猪", 2, false, 1, 500);//调用week1的属性方法并赋值
		/*调用方法*/
		w.drink();
		w.eat();
		w.jump();
		w.sleep();
		w.run();
	}
}
