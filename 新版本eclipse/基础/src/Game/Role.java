package Game;
/**
 * ��Ϸ��ɫ
 * @author 123
 *
 */
public class Role {
	String name;
	int id;
	int blood;
	FaShu f;
	public Role() {
	}
	public Role(String name,int id,int blood) {
		this.name=name;
		this.blood=blood;
		this.id=id;
	}
	
	public FaShu getF() {
		return f;
	}
	public void setF(FaShu f) {
		this.f = f;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBlood() {
		return blood;
	}
	public void setBlood(int blood) {
		this.blood = blood;
	}
	Weapon wp;
	Armour ar;
	public Weapon getWp() {
		return wp;
	}
	public void setWp(Weapon wp) {
		this.wp = wp;
	}
	public Armour getAr() {
		return ar;
	}
	public void setAr(Armour ar) {
		this.ar = ar;
	}
	public void faShuGongJi() {
		System.out.print("����������");
		f.faShuAttack();
		System.out.println("�ͷ���ϣ�");
	}
	public void attack() {
		System.out.println( "Role [name=" + name + ", id=" + id + ", blood=" + blood + ",ʹ��"+wp.getName()+"�����"+wp.getHurt()+"���˺�");
	}
	public void wear() {
		System.out.println("Role [name=" + name + ", id=" + id + ", blood=" + blood + ",ʹ��"+ar.getName()+"�ֵ���"+ar.getProtect()+"���˺�");
	}
	public String toString() {
		return "Role [name=" + name + ", id=" + id + ", blood=" + blood + ", wp=" + wp.getName() + ", ar=" + ar.getName() + "]";
	}
	
	
}
