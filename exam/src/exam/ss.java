package exam;
import java.util.Scanner;
public class ss {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("0~99사이의 숫자를 입력하세요>");
		int num = Integer.parseInt(scanner.nextLine());
		if (num < 0 || num > 99) {
			System.out.println("숫자가 너무 작거나 큽니다. 다시입력하세요");
			num = Integer.parseInt(scanner.nextLine());
		}

		int value10 = 0;
		int value1 = 0;
		int i = 0;
		int tmp = num;
		boolean a = true;
		
		// 합한 값의 일의 자리수와 기존의 일의 자리수의 합이 이루어져야함.
		value10 = num / 10;
		while (a) {
			if (num >= 10) {
				value1 = num % 10;
			} else
				value1 = num;
			num = value10 + value1;
			if (tmp==(((value1*10)+num))) {
				a = false;
			}
			value10 = value1;
			i++;
		}
		System.out.println("입력숫자의 사이클 길이 : " + i);
	}
}
