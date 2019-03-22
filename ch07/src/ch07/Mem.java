package ch07;

public class Mem extends Customer{
	String cusnum;
	String mi;
	
	public Mem(String name, String number, String add, String cusnum, String mi) {
		super(name, number, add);
		this.cusnum = cusnum;
		this.mi = mi;
	}
	@Override
	public void show() {
		System.out.println("이름: " + name + "전화번호: " +number+ "주소: "+ add +
				"고객번호: "+cusnum+"마일리지: " + mi);
	}

}
