package exercise;

import java.util.Scanner;

public class ClassEx1_Ex {

	public static void main(String[] args) {
		String name;
		double math;
		double engl;
		double scie;
		double avg;
		
		Scanner scanner =new Scanner(System.in);
		System.out.print("이름을 입력하세요>");
		name=scanner.nextLine();
		
		System.out.print("수학점수를 입려하세요>");
		math =Double.parseDouble(scanner.nextLine());
		
		System.out.print("영어점수를 입려하세요>");
		engl=Double.parseDouble(scanner.nextLine());
		
		System.out.print("과학점수를 입려하세요>");
		scie =Double.parseDouble(scanner.nextLine());
		scanner.close();
		// TODO Auto-generated method stub
		
		ClassEx1 classEx1 =new ClassEx1(name,math,engl,scie);
		String score=classEx1.toString();
		double av=classEx1.average();
		System.out.println(score);
		System.out.println("평균은 "+ av);

	}

}
