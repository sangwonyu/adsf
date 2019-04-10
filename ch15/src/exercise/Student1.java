package exercise;

import ch15.Person;

public class Student1 implements Comparable<Student1>{
	public String id;
	public int score;
	
	public Student1(String id, int score) {
		this.id = id;
		this.score = score;
	}
	@Override
	public int compareTo(Student1 o) {
		if(this.score<o.score)return -1;
		else if(this.score==o.score)return 0;
		else return 1;
	}
}
