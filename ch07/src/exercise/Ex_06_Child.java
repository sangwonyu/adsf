package exercise;

public class Ex_06_Child extends Ex_06_Parent{
	private String name;
	
	public Ex_06_Child() {
		this("홍길동");
		System.out.println("Child() call");
	}
	public  Ex_06_Child(String name) {
		this.name=name;
		System.out.println("Child(Stirng name) call");
	}
}
