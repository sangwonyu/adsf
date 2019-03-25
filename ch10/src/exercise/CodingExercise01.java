package exercise;

public class CodingExercise01 {

	public static void main(String[] args) {
		//시
		int sum=0;
		for(int i=0; i<=23;i++) {
			if(i%10==3) {
				sum+=i;
			}
		}System.out.println("총시간: " +sum);
		
		//분
		int sum2=0;
		for(int i=0;i<=59;i++) {
			if(i>=30&&i<=39) {
				sum2+=i;
			} else if(i%10==3) {
				sum2+=i;
			}
		}System.out.println("총 분: "+sum2);
		
		//초 환산
		int sum3=(sum*3600) + (sum2*60);
		System.out.println("초로 환산한 값은 " +sum3);
	}

}
