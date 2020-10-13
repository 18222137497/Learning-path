package T4;

/**
 * 战斗能力
 * 
 * @author 123
 *
 */
public interface Fightable {
	public static final int MAX = 10;

	public abstract void win();// 描述战斗者胜利后的行为

	public abstract int injure(int x);// 用于描述战斗者受伤之后的行为

}
