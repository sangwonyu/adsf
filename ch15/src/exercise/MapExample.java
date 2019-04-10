package exercise;
import java.util.*;
public class MapExample {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore=0;
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator=keySet.iterator();
		while(keyIterator.hasNext()) {
			name = keyIterator.next();
			Integer value = map.get(name);
			totalScore+=value;
			if(maxScore<value) {
				maxScore=value;
			}
		}
		System.out.println("평균점수: "+ totalScore/map.size());
		System.out.println("최고점수: "+maxScore);
		System.out.println("최고점수를 받은 id: "+ getKey(map,maxScore));
	}
	public static <K, V> K getKey(Map<K, V> map, V value) {
        for (K key : map.keySet()) {
            if (value.equals(map.get(key))) {
                return key;
            }
        }
        return null;
    }
}
