package sec12.exam03_improt.hyndai;
import sec12.exam03_improt.hankook.*;
public class Engine {
	//SnowTire a;
	SnowTire a1 = new SnowTire(true); 
	//SnowTire a2 = new SnowTire(1);
	//SnowTire a3 = new SnowTire("문자열");
	Tire b;
	
	public Engine() {
		SnowTire a= new SnowTire();
		a.field1=1;
		//a.field2=1;
		//a.field3=1;
		
		a.method1();
		//a.method2();
		//a.method3();
	}
	
	
}
