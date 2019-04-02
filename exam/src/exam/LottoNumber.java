package exam;

import java.util.Arrays;

public class LottoNumber {

	public static void main(String[] args) {
		int[] lottoArray = getLottoNumber();
		System.out.println(Arrays.toString(lottoArray));
	}
	
	static int[] getLottoNumber() {
		int[] random = new int[6];
		for(int i=0;i<6;i++) {
			random[i]=(int)(Math.random()*45+1);
		
		}
		return random;
	}
}
