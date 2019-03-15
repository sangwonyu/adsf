package ch04;
import java.util.*;
public class SwitchStringExple {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.print("직급을입력하세요>>");
		String posi = scan.nextLine();
		switch(posi) {
		case "부장" :	
			System.out.println("700만원");
			break;
		case "과장" : 
			System.out.println("500만원");
			break;
		default:
			System.out.println("300만원");
		}
		// TODO Auto-generated method stub

	}

}
