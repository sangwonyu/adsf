package exam;

public class Person {
	//필드
	private int id;
	private String name;
	private int score;
	
	//생성자
	public Person(int id, String name, int score) {
		this.id = id;
		this.name = name;
		this.score = score;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}
	
	
}
