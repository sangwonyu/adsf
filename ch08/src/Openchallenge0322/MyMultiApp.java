package Openchallenge0322;

import java.util.*;

public class MyMultiApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(",로 구분하여 숫자를 입력하세요");
		String str = scanner.nextLine();
		String[] arr = null;
		arr = str.split(",");
		int[] arr2= null;
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = Integer.parseInt(arr[i]);
		}

		MyMulti mymul;
		mymul = new MymultiImpl();
		mymul.max(arr2);
		mymul.min(arr2);
		mymul.sum(arr2);
		mymul.avg(arr2);

	}

}
