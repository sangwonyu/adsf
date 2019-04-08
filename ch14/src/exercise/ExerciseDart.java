package exercise;

import java.util.*;

public class ExerciseDart {

	public static void main(String[] args) {
		System.out.println("다트를 시작하겠습니다.shot을 입력하세요");
		Scanner scanner = new Scanner(System.in);
		String shot = scanner.nextLine();
		
		String str = "shot";
		int bonusScoreTotal1 = 0;
		int bonusScoreTotal2 = 0;
		int bonusScoreTotal3 = 0;
		boolean run = true;
		int i = 1;
		int sum = 0;
		int bonusScore = 0;
		
		String[] arr = new String[3];
		String[] arrT = new String[3];
		int[] bonusScoreArr = new int[3];
		
		String a = "S";
		String b = "D";
		String c = "T";
		String d = "*";
		String e = "#";

		if (str.equals(shot)) {
			while (run) {
				// 첫 번째 다트 시작
				System.out.println(i + "번째 다트 shot");
				int score = (int) (Math.random() * 11);
				String[] bonus = { "S", "D", "T" };
				String randomBonus = bonus[(int) (Math.random() * 2)];
				String[] option = { "*", "#", "" };
				String randomOption = option[(int) (Math.random() * 2)];

				// 다트 점수계산
				System.out.println("빠밤: " + score + randomBonus + randomOption);
				arr[i - 1] = String.valueOf(score);
				arrT[i - 1] = score + randomBonus + randomOption;

				// s,d,t 보너스 점수 계산
				if (randomBonus.equals(a)) {
					bonusScore = 1 * score;
				} else if (randomBonus.equals(b)) {
					bonusScore = (int) (Math.pow((int) score, 2));
				} else if (randomBonus.equals(c)) {
					bonusScore = (int) (Math.pow((int) score, 3));
				}
				bonusScoreArr[i - 1] = bonusScore;
				// 옵션 계산
				if (arrT[i - 1] == arrT[0]) {
					char special = arrT[0].charAt(2);
					if (special == '*') {
						bonusScoreTotal1 = bonusScoreArr[0] * 2;
					} else if (special == '#') {
						bonusScoreTotal1 = -bonusScoreArr[0];
					}
				}

				else if (arrT[i - 1] == arrT[1]) {
					char special = arrT[1].charAt(2);
					if (special == '*') {
						bonusScoreTotal2 = bonusScoreArr[0] * 2 + bonusScoreArr[1] * 2;
					} else if (special == '#') {
						bonusScoreTotal1 = -bonusScoreArr[1];
					}
				}

				else if (arrT[i - 1] == arrT[2]) {
					char special = arrT[2].charAt(2);
					if (special == '*') {
						bonusScoreTotal3 = bonusScoreArr[1] * 2 + bonusScoreArr[2] * 2;
					} else if (special == '#') {
						bonusScoreTotal1 = -bonusScoreArr[2];
					}
				}
				i++;
				if (i == 4) {
					run = false;
				}
			}
			System.out.println();

			// 1,2,3 다트열 생성
			for (int z = 1; z < 4; z++) {
				System.out.print(arrT[z - 1]);
			}
			System.out.println();
			// total
			int sumTotal = bonusScoreTotal1 + bonusScoreTotal2 + bonusScoreTotal3;
			System.out.println("다트의 총점은 " + sumTotal);
		}
	}

}
