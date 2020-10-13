package T7;

/**
 * 收费接口
 * 
 * @author 123
 *
 */
public interface Charge {
	public static final int MAX = 10000;// 每次收取费用的最大值

	public abstract double getFee(int distance);// 行驶的公里数
}
