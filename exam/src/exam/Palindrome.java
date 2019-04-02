package exam;

public class Palindrome {

	public static void main(String[] args) {
		isPalindrome(2);
	}
	
	static boolean isPalindrome(int number) {
		int mul = 0;
		int maxMul=0;
		
		for (int i = 100; i <= 999; i++) {
			for (int z = 100; z <= 999; z++) {
				mul = i * z;
				String mulStr = String.valueOf(mul);
				char[] arr = new char[mulStr.length()];
				for (int j = 0; j < mulStr.length(); j++) {
					arr[j] = mulStr.charAt(j);
				}
				if (mulStr.length() == 6) {
					if (arr[0] == arr[5] && arr[1] == arr[4] && arr[2] == arr[3]) {
						if(maxMul<mul) {
							maxMul =mul;
						}
					}
				}
			}
		}
		System.out.println(maxMul);
		return false;
	}

}
