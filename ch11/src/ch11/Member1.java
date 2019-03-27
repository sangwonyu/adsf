package ch11;

public class Member1 implements Comparable<Member>{
	String name;
	Member1(String name) {
		this.name =name;
	}
	@Override
	public int compareTo(Member o) {
		return name.compareTo(o.name);
	}

}
