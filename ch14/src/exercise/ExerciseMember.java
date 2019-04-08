package exercise;
import java.util.Scanner;
public class ExerciseMember {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("멤버1의 이름를 입력하세요>");
		String name = scanner.nextLine();
		System.out.println("멤버1의 id를 입력하세요>");
		String id = scanner.nextLine();
		System.out.println("멤버1의 password를 입력하세요>");
		String password = scanner.nextLine();
		System.out.println("멤버1의 age를 입력하세요>");
		int age = Integer.parseInt(scanner.nextLine());
		
		System.out.println("멤버2의 이름를 입력하세요>");
		String name2 = scanner.nextLine();
		System.out.println("멤버2의 id를 입력하세요>");
		String id2 = scanner.nextLine();
		System.out.println("멤버2의 password를 입력하세요>");
		String password2 = scanner.nextLine();
		System.out.println("멤버2의 age를 입력하세요>");
		int age2 = Integer.parseInt(scanner.nextLine());
		
		Member member1 = new Member(name,id,password,age);
		Member member2 = new Member(name2,id2,password2,age2);
		
		System.out.println(member1.compareTo(member2));
	}

}
