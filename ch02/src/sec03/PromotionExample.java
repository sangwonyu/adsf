package sec03;

public class PromotionExample {

	public static void main(String[] args) {
		byte byteValue =10;
		int intValue =byteValue;
		System.out.println(intValue);
		
		char charvalue ='가';
		intValue=charvalue;
		System.out.println("가의 유니코드=" + intValue);
		
		intValue=500;
		long longValue =intValue;
		System.out.println(longValue);
		
		intValue=200;
		double doubleValue = intValue;
		System.out.println(doubleValue);
		
		longValue =123456789000L;
		float floatValue =longValue;
		System.out.println(floatValue);
		doubleValue=longValue;
		System.out.println(doubleValue);
		// TODO Auto-generated method stub

	}

}
