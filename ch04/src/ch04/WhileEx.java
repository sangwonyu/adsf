package ch04;

public class WhileEx {

	public static void main(String[] args) {
		int i =1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		
		int sum =0;
		int j =1;
		
		while(i<=100) {
			sum+=j;
			j++;
		}
		System.out.println("1~" + (i-1) + "합:" +sum);
		// TODO Auto-generated method stub

	}

}
