package Game;
/**
 * ÎäÆ÷
 * @author 123
 *
 */
public class Weapon {
	String name;
	int hurt;
	public Weapon() {
	}
	public Weapon(String name ,int hurt) {
	this.hurt=hurt;
	this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHurt() {
		return hurt;
	}
	public void setHurt(int hurt) {
		this.hurt = hurt;
	}
	
	
}
