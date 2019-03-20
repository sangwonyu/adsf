package exercise;

public class ClassEx1 {
	//Field
	String name;
	double math;
	double engl;
	double scie;
	double avg;
	
	
	
	
	//생성자
	ClassEx1(String name,double math,double engl,double scie) {
		this.name=name;
		this.math=math;
		this.engl=engl;
		this.scie=scie;
	}

	
	double average() {
		double average=(math+engl+scie)/3;
		return average;
	}
	
	@Override
	public String toString() {
		return "ClassEx1 [name=" + name + ", math=" + math + ", engl=" + engl + ", scie=" + scie +  "]";
	}
	

}
