package openchallenge;

import java.util.Scanner;

public class Open04 {

	public static void main(String[] args) {
		System.out.println("원하는 숫자를 입력하세요>");
		Scanner scanner = new Scanner(System.in);
		int num = Integer.parseInt(scanner.nextLine());
		int sum = 0;
		int sum2 = 0;

		for (int i = 1; i <= num; i++) {
			sum += i * i;
		}

		for (int i = 1; i <= num; i++) {
			sum2 += i;
		}
		sum2 *= sum2;
		System.out.println("제곱의 합: " + sum);
		System.out.println("합의 제곱: " + sum2);
		System.out.println(sum2 - sum);
	}

}
