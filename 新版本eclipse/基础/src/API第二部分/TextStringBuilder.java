package API�ڶ�����;
/**
 * java.lang.StringBuilder�ַ���������
 * ����String��StringBuilderû�б�final���Σ����Գ����ǿ��Ըı��
 * ��������Ŀ�ľ������Ч��
 * StringBuilder��ʼ����Ϊ16���ַ�   byte[] value=new byte[16];����������Զ�����
 * append����:
 * 		����������͵����ݵ��ַ�����ʽ�������ص�ǰ������
 * @author 123
 *
 */
public class TextStringBuilder {
	public static void main(String[] args) {
		StringBuilder a=new StringBuilder("S");//���ַ������StringBuilder
		StringBuilder b=a.append(1);//����Դ�ַ������������µĶ�����ַ�����Դ�����ַ����ĵ�ֵַ��ͬ����Ч
		System.out.println(a);
		System.out.println(a==b);//�Ƚϵ�ֵַ true
		//ʹ��append����������շ���ֵ
		//��ʵ����ʽ���
		a.append("1").append(false).append(2.0).append(1);	
		System.out.println(a);
		System.out.println(a.toString());//��StringBuilder���String
		
		
	}
}
