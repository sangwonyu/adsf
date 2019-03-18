package exercise;

import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		int max = 0;
		int avg = 0;
		int sum = 0;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수|2.점수 입력|3.점수리스트|4.분석||5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택>");

			int selectNo = Integer.parseInt(scanner.nextLine());

			if (selectNo == 1) {
				System.out.print("학생수를 입력하세요>");
				studentNum = Integer.parseInt(scanner.nextLine());
				scores = new int[studentNum];
			} else if (selectNo == 2) {

				for (int i = 0; i < studentNum; i++) {
					System.out.print("각각 학생의 점수를 입력하세요");
					scores[i] = Integer.parseInt(scanner.nextLine());
				}
			} else if (selectNo == 3) {
				for (int i = 0; i < studentNum; i++) {
					System.out.print("점수 리스트는" + scores[i] + ", ");
				}
				System.out.println();
			} else if (selectNo == 4) {
				for (int i = 0; i < studentNum; i++) {
					if (max < scores[i]) {
						max = scores[i];
					}
				}
				System.out.println("분석결과 최고 점수는" + max);

				// 평균
				for (int i = 0; i < studentNum; i++) {
					sum += scores[i];
				}
				avg = sum/studentNum;
				System.out.println("평균은" + avg);

			} else if (selectNo == 5) {
				run = false;
			}
		}
		// TODO Auto-generated method stub
		System.out.println("프로그램 종료");
	}

}
