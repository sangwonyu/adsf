package exercise;

public class Ex17_Printer {
	int num;
	boolean fal;
	double num2;
	String str;
	
	int println(int num) {
		this.num=num;
		System.out.println(num);
		return num;
	}
	boolean println(boolean fal) {
		this.fal=fal;
		System.out.println(fal);
		return fal;
	}
	double println(double num2) {
		this.num2=num2;
		System.out.println(num2);
		return num2;
	}
	String println(String str) {
		this.str=str;
		System.out.println(str);
		return str;
	}

}
