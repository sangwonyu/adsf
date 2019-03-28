package openchallenge;

public class DashInsert {

	public void dashInsert(String str) {

		StringBuilder sb = new StringBuilder(str);

		for (int i = 0; i < sb.length() - 1; i++) {
			if ((int) sb.charAt(i) % 2 == 0 && (int) sb.charAt(i + 1) % 2 == 0 && (int) sb.charAt(i) != 42
					&& (int) sb.charAt(i + 1) != 42) {
				sb.insert(i + 1, "*");
			} else if ((int) sb.charAt(i) % 2 != 0 && (int) sb.charAt(i + 1) % 2 != 0 && (int) sb.charAt(i) != 45
					&& (int) sb.charAt(i + 1) != 45) {
				sb.insert(i + 1, "-");
			}
		}
		System.out.println(sb.toString());
	}

}
