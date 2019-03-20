package ch06;

public class CCarEx {

	public static void main(String[] args) {
		CCar myCar =new CCar();
		myCar.keyTurnOn();
		myCar.run();
		int speed =myCar.getSpeed();
		System.out.println("현재 속도: " + speed+"km/h");
		// TODO Auto-generated method stub

	}

}
