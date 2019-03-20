package ch06;

public class CalcluatorStaticEx {

	public static void main(String[] args) {
		double result1=10*10*CalcluatorStatic.pi;
		int result2 = CalcluatorStatic.plus(10, 5);
		int result3 = CalcluatorStatic.minus(10, 5);
		
		
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);
		
		CalcluatorStatic myCalc = new CalcluatorStatic();
		int result4=myCalc.plus(3,4);
		System.out.println("result4: " + result4);
		myCalc.setColor("Navy");
		System.out.println("color: " +myCalc.color);
		// TODO Auto-generated method stub

	}

}
