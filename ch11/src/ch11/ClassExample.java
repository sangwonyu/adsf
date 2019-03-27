package ch11;

public class ClassExample {

	public static void main(String[] args) {
		Car car =new Car();
		Class clazz1 = car.getClass();
		System.out.println(clazz1.getName());
		System.out.println(clazz1.getSimpleName());
		System.out.println(clazz1.getPackage().getName());
		System.out.println();
		
		
		try {
			Class claszz2 = Class.forName("ch11");
			System.out.println(clazz1.getName());
			System.out.println(clazz1.getSimpleName());
			System.out.println(clazz1.getPackage().getName());
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	

}
