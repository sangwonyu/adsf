package exercise;

public class Ex_05_Child extends Ex_05_Parent{
	private int studentNo;

	public Ex_05_Child(String name, int studentNo) {
		super(name);//부모 생성자 호출
		this.studentNo = studentNo;
	}
	
	

}
