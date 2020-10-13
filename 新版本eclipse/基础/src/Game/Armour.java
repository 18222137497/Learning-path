package Game;
/**
 * ×°¼×
 * @author 123
 *
 */
public class Armour {
	String name;
	int protect;//·ÀÓùÖµ
	public Armour() {
	}
	public Armour(String name,int protect) {
		this.protect=protect;
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getProtect() {
		return protect;
	}
	public void setProtect(int protect) {
		this.protect = protect;
	}
	
}
