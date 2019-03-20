package ch06;

public class CarExample {

	public static void main(String[] args) {
		Car car1 =new Car();
		System.out.println(car1.toString());
		Car car2 =new Car("자가용");
		System.out.println(car2.toString());
		Car car3 =new Car("자가용","빨강");
		System.out.println(car3.toString());
		Car car4 =new Car("자가용","빨강",200);
		System.out.println(car4.toString());
		
		
		// TODO Auto-generated method stub

	}

}
