package Stream��;

import java.util.ArrayList;

public class �Լ��Ͻ��в��� {
	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("���޼�");
		a.add("������");
		a.add("����");
		a.add("��ǿ");
		a.add("������");
		a.stream()//��ȡ���ϵ�stream��
		.filter(s->s.startsWith("��"))//����ΪPredicate�ӿڵķ�����Ŀ��Ϊ���жϣ�����ֵʽStream<T>
		.filter(s->s.length()==3)
		.forEach(s->System.out.println(s));//����ʽConsumer�ӿڵķ�����Ŀ��Ϊ���������ݣ�����ֵΪ��
		
				
	}
}
