package Game;
/**
 * ������
 * @author 123
 *
 */
public class Game {
	public static void main(String[] args) {
		Weapon w=new Weapon("���콣",99999999);
		Armour a=new Armour("��ɽ��",10000000);
		Role r=new Role("����",1,100);
		r.setWp(w);
		r.setAr(a);
		r.attack();
		r.wear();
		r.setF(new FaShu() {
			public void faShuAttack() {
				System.out.print("��תǬ��	 ");
			}
		});
		r.faShuGongJi();
		System.out.println(r);
		
	}
}
