package ch13;

public class BoundedTypeParameterExample {

	public static void main(String[] args) {
		//String str =Util.compare("a","b");
		
		int result1 = Util2.compare(10, 20);
		System.out.println(result1);
		
		int result2=Util2.compare(4.5, 3);
		System.out.println(result2);
	}

}
