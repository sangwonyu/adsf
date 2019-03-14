package ch03;

public class BiteverseOperatorExample {

	public static void main(String[] args) {
		int v1=10;
		int v2 = ~v1;
		int v3 =~v1 +1;
		System.out.println( toBinaryString(v1) + "(십진수 : "+v1+")");
		System.out.println(toBinaryString(v2) + "(십진수 : "+v2+")");
		System.out.println(toBinaryString(v3) + "(십진수 : "+v3+")");
		System.out.println();
		
		
		int v4=-10;
		int v5=~v4;
		int v6=~v4 + 1;
		// TODO Auto-generated method stub

	}

	private static String toBinaryString(int v1) {
		// TODO Auto-generated method stub
		return null;
	}

}
