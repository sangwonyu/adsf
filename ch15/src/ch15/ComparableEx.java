package ch15;
import java.util.*;
public class ComparableEx {

	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		Person p1=new Person("홍길동",45);
		Person p4=new Person("홍길동",45);
		if(p1.equals(p4))
			System.out.println("equals true");
		System.out.println("p1.hashCode(): "+ p1.hashCode());
		System.out.println("p4.hashCode(): "+ p4.hashCode());
		
		treeSet.add(new Person("홍길동",45));
		treeSet.add(new Person("김자바",25));
		treeSet.add(new Person("박지원",31));
		
		Iterator<Person> iterator =treeSet.iterator();
		while(iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println(person.name+":"+person.age);
		}
	}

}
