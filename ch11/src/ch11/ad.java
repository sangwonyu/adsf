package ch11;

import java.util.Arrays;

public class ad {

	public static void main(String[] args) {
		String[] names = {"홍길동","박동수","김민수"};
		
		Arrays.sort(names);
		int index =Arrays.binarySearch(names, "홍길동");
		System.out.println("인"+index);
		
	}

}
