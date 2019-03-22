package exercise;

public class Ex_06_Parent {
	public String nation;
	
	public Ex_06_Parent() {
		this("대한민국");
		System.out.println("Parent() call");
	}
	public Ex_06_Parent(String nation) {
		this.nation =nation;
		System.out.println("Parent(String nation) call");
	}
}
