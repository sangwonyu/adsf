package ch08;

public class Car {
	/*Tire frontLeftTire =new HankookTire();
	Tire frontRightTire =new HankookTire();
	Tire BackLeftTire =new HankookTire();
	Tire BackRightTire =new HankookTire();
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		BackLeftTire.roll();
		BackRightTire.roll();
		}*/
	Tire[] tires = {
			new HankookTire(),
			new HankookTire(),
			new HankookTire(),
			new HankookTire()
	};
	
	void run() {
		for(Tire tire : tires) {
			tire.roll();
		}
	}
	
	
	
}
