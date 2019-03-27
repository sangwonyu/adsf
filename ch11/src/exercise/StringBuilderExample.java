package exercise;

public class StringBuilderExample {

	public static void main(String[] args) {
		String str="";
		for(int i=1; i<=100;i++) {
			str+=i;
		}
		System.out.println(str);
		
		//개선 코드
		String str2 = "1";
		StringBuilder strBuilder = new StringBuilder();
		for(int i=1;i<=100;i++) {
			strBuilder.append(i);	
		}
		System.out.println(strBuilder);
		
		
	}

}
