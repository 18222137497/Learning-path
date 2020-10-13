package API收藏;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
/**
 * 根据值找键
 * @author 123
 *
 */
public class GetKeys {
	public static <K, V> Set<K> getKeys(Map<K, V> map, V value) {//根据值找键的方法，一值可对应多键
	    Set<K> keys = new HashSet<>();
	    for (Entry<K, V> entry : map.entrySet()) {//?????????
	        if (entry.getValue().equals(value)) {
	            keys.add(entry.getKey());
	        }
	    }
	    return keys;
	}
}
