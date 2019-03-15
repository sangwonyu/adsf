package exercise;
import java.util.Scanner;
public class exercise07 {

	public static void main(String[] args) {
		boolean run =true;
		
		int balance = 0;
		
		Scanner scanner =new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("-----------------------");
			System.out.print("선택>");
			String a =scanner.nextLine();
			if(a.equals("1")) {
				System.out.print("예금액>");
				Scanner deposit = new Scanner(System.in);
				balance +=Integer.parseInt(deposit.nextLine());
				System.out.println();
				deposit.close();
			
			} else if(a.equals("2") ) {
				System.out.print("출금액>");
				Scanner draw =new Scanner(System.in);
				int tmp = balance;
				balance -=Integer.parseInt(draw.nextLine());
				if(balance<0) {
					System.out.println("출금 안됨");
					balance=tmp;
					
				}
				System.out.println();
				draw.close();
		
			}else if (a.equals("3")) {
				System.out.print("잔고>");
				System.out.println(balance);
			}else if(a.equals("4") ) {
				System.out.println("시스템 종료");
				run=false;
			}
			scanner.close();
			
			
		}
		
		// TODO Auto-generated method stub

	}

}
