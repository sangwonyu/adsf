package openchallenge;

public class Open01 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 10; i <= 99; i++) {
			sum += (i / 10) * (i % 10);
		}
		for (int i = 100; i <= 999; i++) {
			sum += (i / 100) * ((i % 100) / 10) * (i % 10);
		}
		System.out.println(sum);
	}

}
