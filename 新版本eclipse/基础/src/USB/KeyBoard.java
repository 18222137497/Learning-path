package USB;
/**
 * ¼üÅÌ
 * @author 123
 *
 */
public class KeyBoard implements USB{
	public void open() {
		System.out.println("¼üÅÌµÆÁÁÁË£¡");
	}
	public void close() {
		System.out.println("¼üÅÌµÆÃğÁË£¡");
	}
	public void type() {
		System.out.println("¼üÅÌ´ò×ÖÁË£¡");
	}

}
