package ch06;

public class CarSta {
	int speed;
	
	void run() {
		System.out.println(speed +"으로 달립니다.");
	}
	
public static void main(String[] args) {
	CarSta myCar =new CarSta();
	myCar.speed=60;
	myCar.run();
}
}
