package ch11;

import java.util.*;

public class RandomExample {

	public static void main(String[] args) {
		// 선택번호
		int[] selectNumber = new int[6];
		Random random = new Random(3);
		System.out.println("선택번호:");
		for (int i = 0; i < 6; i++) {
			selectNumber[i] = random.nextInt(45) + 1;
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();
		// 당첨번호
		int[] WinningNumber = new int[6];
		random = new Random(5);
		System.out.println("당첨번호:");
		for (int i = 0; i < 6; i++) {
			WinningNumber[i] = random.nextInt(45) + 1;
			System.out.print(WinningNumber[i] + " ");
		}
		System.out.println();
		//당첨여부
		Arrays.sort(selectNumber);
		Arrays.sort(WinningNumber);
		boolean result = selectNumber.equals(WinningNumber);
		System.out.println("당첨여부");
		if(result) {
			System.out.println("1등");
		} else {
			System.out.println("no");
		}
	}

}
