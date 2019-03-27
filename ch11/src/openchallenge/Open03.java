package openchallenge;

import java.util.Scanner;

public class Open03 {

	public static void main(String[] args) {
		System.out.println("원하는 숫자를 입력하세요>");
		Scanner scanner = new Scanner(System.in);
		int num = Integer.parseInt(scanner.nextLine());
		int sum = 0;

		for (int i = 2; i <= num; i++) {
			for (int z = 1; z < i; z++) {
				if (i % z == 0) {
					sum += z;
				}
			}
			if (sum == i) {
				System.out.print(sum + " ");
			}
			sum = 0;
		}
	}

}
