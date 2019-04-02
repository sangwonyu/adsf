package exam;

public class Student extends Person{
	public Student(int id, String name, int score) {
		super(id, name, score);
	}
	
	@Override
	public int hashCode() {
		if(String.valueOf(getId())==getName()) {
			String name ="1";
			int id =1;
		}
		return 1;
	}
	
	
}
