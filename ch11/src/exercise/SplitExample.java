package exercise;
import java.util.*;
public class SplitExample {

	public static void main(String[] args) {
		String str ="아이디,이름,패스워드";
		
		//방법1(split() 메소드 이용
		String[] arrstr = str.split(",");
		for(int i =0;i<arrstr.length;i++) {
			System.out.println(arrstr[i]);
		}
		System.out.println();
		
		//방법2 (StringTokenizer 이용)
		StringTokenizer stoken = new StringTokenizer(str,",");
	
		while(stoken.hasMoreTokens()) {
			String stoken2=stoken.nextToken();
			System.out.println(stoken2);
		}
	}

}
