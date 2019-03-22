package exercise;

public class Ex_07_SnowTireEx {

	public static void main(String[] args) {
	/*	Ex_07_SnowTire snowTire = new Ex_07_SnowTire();
		Ex_07_Tire tire =snowTire;*/
		Ex_07_Tire tire =new Ex_07_Tire();
		Ex_07_Tire snowTire =tire;
		
		snowTire.run();
		tire.run();
	}

}
