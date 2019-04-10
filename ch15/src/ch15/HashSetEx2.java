package ch15;
import java.util.*;
public class HashSetEx2 {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("홍길동",30,010-3841-6401));
		set.add(new Member("홍길동",26,010-3841-6401));
		
		System.out.println("총 객체수: " + set.size());
		
	}

}
