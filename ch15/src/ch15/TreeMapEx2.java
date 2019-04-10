package ch15;
import java.util.*;
public class TreeMapEx2 {

	public static void main(String[] args) {
		TreeMap<Integer,String> scores = new TreeMap<Integer,String>();
		
		scores.put(new Integer(87), "홍길동");
		scores.put(new Integer(98), "이동수");
		scores.put(new Integer(75), "박길순");
		scores.put(new Integer(90), "신용권");
		scores.put(new Integer(80), "김자바");
		
		NavigableMap<Integer,String> ascendingMap = scores.descendingMap();
		Set<Map.Entry<Integer, String>> ascendingEntrySet = ascendingMap.entrySet();
		for(Map.Entry<Integer, String> entry :ascendingEntrySet) {
			System.out.println(entry.getKey()+"-"+entry.getValue()+" ");
		}
	}

}
