package ch14;

public class MyFunctionalInterfaceExample1 {

	public static void main(String[] args) {
		MyFunctionalInterface1 fii;
		
		fii=(x) ->{
			int result = x*5;
			System.out.println(result);
		};
		fii.method1(2);
		
		fii=(x)->{System.out.println(x*5);};
		fii.method1(2);
		
		fii=(x)->System.out.println(x*5);
		fii.method1(2);
	}

}
