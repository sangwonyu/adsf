package ch08;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver =new Driver();
		
		BUs buss =new BUs();
		Taxi taxi =new Taxi();
		
		driver.drive(buss);
		driver.drive(taxi);
		
		Vehicle vehicle =new BUs();
		
		vehicle.run();
		//vehicle.checkFare();
		
		BUs bus =(BUs) vehicle;
		bus.run();
		bus.checkFare();
	}

}
