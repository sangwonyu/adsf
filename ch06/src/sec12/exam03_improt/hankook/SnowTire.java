package sec12.exam03_improt.hankook;

public	class SnowTire {
	SnowTire a1 = new SnowTire(true); 
	SnowTire a2 = new SnowTire(1);
	SnowTire a3 = new SnowTire("문자열");
	
	public SnowTire(boolean b) {}
	SnowTire(int b){}
	private SnowTire(String s) {}
	
	public int field1;
	int field2;
	private int field3;
	
	public SnowTire() {
		field1 = 1;
		field2 = 1;
		field3 = 1;
		
		
		method1();
		method3();
		method2();
	}
	
	public void method1() {}
	void method2() {}
	private void method3() {}
}
