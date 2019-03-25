package exercise;

import java.util.*;

public class CodingExercise02 {

	public static void main(String[] args) {
		System.out.println("원하는 숫자 10글자 아래로 작성하시오");
		Scanner scanner = new Scanner(System.in);
		int num = Integer.parseInt(scanner.nextLine());
		int tmp;
		boolean a=false;
		
		int length = (int) (Math.log10(num) + 1);
		if (length > 10) {
			System.out.println("10글자까지만 입력하세요");
		}
		int[] num2 = new int[length];
		for (int i = 0; i < length; i++) {
			num2[i] = (int) ((num / Math.pow(10, i)) % 10);

		}
		
		//올림차순정렬
		for (int i = 0; i < length; i++) {
			for (int z = i + 1; z < length; z++) {
				if (num2[i] > num2[z]) {
					tmp = num2[i];
					num2[i] = num2[z];
					num2[z] = tmp;
				}
			}
		}
		System.out.print("입력한 수 "+num);
		//크기비교
		for(int i=0;i<length;i++) {
			if(num2[i]==num2[(i+1)]) {
				a=true;
				System.out.print(a+", ");
			}
		} System.out.print(a);
	}

}
