package openchallenge;

import java.util.Scanner;

public class Open05 {

	public static void main(String[] args) {
		System.out.println("문자열과 숫자를 입력하세요(예:ROSE 5)>");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		
		String[] strArr = str.split(" ");
		int[] secret = new int[strArr[0].length()];
		
		for (int i = 0; i < strArr[0].length(); i++) {
			secret[i] = (int)(strArr[0].charAt(i));
			secret[i] += Integer.parseInt(strArr[1]);
			char a = (char)secret[i];
			System.out.print(a);
			
		}
	}

}
