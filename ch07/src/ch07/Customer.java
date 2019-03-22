package ch07;

public class Customer  {
	String name;
	String number;
	String add;
	
	public Customer(String name, String number, String add) {
		
		this.name = name;
		this.number = number;
		this.add = add;
	}
	public void show() {
		System.out.println("이름: " + name + "전화번호: " +number+ "주소: "+ add);
	}
	

}
