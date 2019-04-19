package jspbook.ch04;

public class Calc {
	int result=0;
	
	public Calc(int num1, int num2, int num3) {
		result = (int)(num1+num2+num3)/3;
	}
	
	public int getResult() {
		return result;
	}
} 
