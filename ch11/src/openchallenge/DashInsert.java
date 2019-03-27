package openchallenge;

public class DashInsert {

	public void dashInsert(String str) {
		String a;
		String b;
		int[] num = new int[str.length()];

		// 짝수 홀수
		for (int i = 0; i < str.length(); i++) {
			num[i] = (int) str.charAt(i);
			if (num[i] % 2 == 0) {
				num[i] = 1;
			} else
				num[i] = 0;
		}
		for (int i = 0; i < str.length(); i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		StringBuilder strBuilder = new StringBuilder(str);
		for (int i = 0; i < str.length() - 1; i++) {
			if (num[i] == num[i + 1]) {
				if (num[i] == 1) {
					strBuilder.insert(i + 1, "*");
				} else if (num[i] == 0) {
					strBuilder.insert(i + 1, "-");
				}
			}
		}
		System.out.println(strBuilder.toString());
	}
}
