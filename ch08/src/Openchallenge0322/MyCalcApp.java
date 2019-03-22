package Openchallenge0322;
import java.util.*;
public class MyCalcApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = Integer.parseInt(scanner.nextLine());
		System.out.println("숫자를 입력하세요");
		int num2 = Integer.parseInt(scanner.nextLine());
		
		Calculator cal;
		cal=new MyCalc();
		cal.add(num,num2);
		cal.substract(num,num2);
		cal.multiply(num,num2);
	}
}
