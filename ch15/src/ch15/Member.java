package ch15;

public class Member {
	public String name;
	public int age;
	public int phon;

	public Member(String name, int age, int phon) {
		this.name = name;
		this.age = age;
		this.phon = phon;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			System.out.println(name+age);
			System.out.println(member.name+member.age);
			return member.name.equals(name) && (member.phon == phon);
			
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return name.hashCode() + phon;
	}

}
