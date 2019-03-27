package ch11;

import java.util.StringTokenizer;

public class Split {

	public static void main(String[] args) {
		String path= System.getenv("PATH");
		StringTokenizer st =new StringTokenizer(path,";");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		
	}	

}
