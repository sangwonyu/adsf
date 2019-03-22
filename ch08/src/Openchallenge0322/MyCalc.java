package Openchallenge0322;

public class MyCalc implements Calculator {
	// add 실체 메소드
	public void add(int a, int b) {
		int c=a+b;
		System.out.println("add : " +c );
	}
	//substract 실체 메소드
	public void substract(int a, int b) {
		int c=a-b;
		System.out.println("substract : " +c );
	}
	//multiply 실체메소드
	public void multiply(int a, int b) {
		int c=a*b;
		System.out.println("multiply : " +c );
	}
}
