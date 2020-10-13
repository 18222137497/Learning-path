package xxxxx;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

	public class lxlx {
		public static void main(String[] args) throws IOException {
			File f=new File("C:\\Users\\123\\Desktop\\大老师语录.txt");
			FileInputStream fi=new FileInputStream(f);
			FileOutputStream fo=new FileOutputStream("‪C:\\a.txt",true);
			byte[] b=new byte[1024];
			int len=0;
			while((len=fi.read(b))!=-1) {
				fo.write(b, 0, len);
			}
			fi.close();
			fo.close();

					
			
		}
	}


