package API�ղ�;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
/**
 * ����ֵ�Ҽ�
 * @author 123
 *
 */
public class GetKeys {
	public static <K, V> Set<K> getKeys(Map<K, V> map, V value) {//����ֵ�Ҽ��ķ�����һֵ�ɶ�Ӧ���
	    Set<K> keys = new HashSet<>();
	    for (Entry<K, V> entry : map.entrySet()) {//?????????
	        if (entry.getValue().equals(value)) {
	            keys.add(entry.getKey());
	        }
	    }
	    return keys;
	}
}
