package Game;
/**
 * 测试类
 * @author 123
 *
 */
public class Game {
	public static void main(String[] args) {
		Weapon w=new Weapon("倚天剑",99999999);
		Armour a=new Armour("穿山甲",10000000);
		Role r=new Role("汪京",1,100);
		r.setWp(w);
		r.setAr(a);
		r.attack();
		r.wear();
		r.setF(new FaShu() {
			public void faShuAttack() {
				System.out.print("逆转乾坤	 ");
			}
		});
		r.faShuGongJi();
		System.out.println(r);
		
	}
}
