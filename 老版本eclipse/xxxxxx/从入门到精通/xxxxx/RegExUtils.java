package xxxxx;
/**
 * 身份证识别正则表达式
 * @author 123
 *
 */
public class RegExUtils {
	public static String ID;
	public static boolean RegExUtils(String x){                                       
		ID="\\d{6}([1]\\d{3}||[2][0][0-1]\\d)(([1][02]([0][\\d&&[^0]]||[12]\\d||[3][01]))||([0][\\d&&[^2469]([0][\\d&&[^0]]||[12]\\d]||[3][01]))||([0][\\d&&[^13578]]([0][\\d&&[^0]]||[12]\\d]||[3][0])))\\d{3}[\\w&&[^a-wy-zA-WY-Z_]]"; 
		boolean a=x.matches(ID);
		return a;	
	}
	public static void main(String[] args) {
		String my="340824199810174218";
		new RegExUtils();
		System.out.println(RegExUtils.RegExUtils(my));		
	}

}
