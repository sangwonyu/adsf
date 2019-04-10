package ch15;
import java.util.*;
public class TreeMapEx1 {

	public static void main(String[] args) {
		TreeMap<Integer,String> scores = new TreeMap<Integer,String>();
		
		scores.put(new Integer(87), "홍길동");
		scores.put(new Integer(98), "이동수");
		scores.put(new Integer(75), "박길순");
		scores.put(new Integer(90), "신용권");
		scores.put(new Integer(80), "김자바");
		
		Map.Entry<Integer, String> entry = null;
		
		entry =scores.firstEntry();
		System.out.println("가장 낮은 점수: " + entry.getKey()+"-"+entry.getValue());

		entry =scores.lastEntry();
		System.out.println("가장 높은 점수: " + entry.getKey()+"-"+entry.getValue()+"\n");
		
		entry =scores.lowerEntry(new Integer(95));
		System.out.println("95점 아래 점수: " + entry.getKey()+"-"+entry.getValue());
		
		entry =scores.higherEntry(new Integer(95));
		System.out.println("95점 아래 위 점수: " + entry.getKey()+"-"+entry.getValue()+"\n");
		
		entry =scores.floorEntry(new Integer(95));
		System.out.println("95점이거나 바로 위의  점수: " + entry.getKey()+"-"+entry.getValue());
		
		entry =scores.ceilingEntry(new Integer(95));
		System.out.println("85점이거나 바로 위의 점수: " + entry.getKey()+"-"+entry.getValue()+"\n");
		
		while(!scores.isEmpty()) {
			entry=scores.pollFirstEntry();
			System.out.println(entry+ "(남은 객체수: "+scores.size()+")");
		}
	}

}
