package exercise;

import java.util.Scanner;

public class Ex20_AccountBankEx {
	private static Ex20_AccountBank[] accountArray = new Ex20_AccountBank[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int createCount = 0;

	// 계좌생성하기 - 생성자 이용 - 객체초기화
	private static void createAccount() {
		// 클래스이름 객체이름 = new 클래스이름(매개변수값, 매개변수값, 매개변수값);
		System.out.println("---------------");
		System.out.println("계좌생성");
		System.out.println("---------------");
		
		System.out.println("계좌를 입력하세요.");
		String ano = scanner.nextLine();
		System.out.println("계좌주를 입력하세요.");
		String owner = scanner.nextLine();
		
		
		accountArray[createCount] = new Ex20_AccountBank(ano, owner, 0);
		
		System.out.println(accountArray[createCount].toString());
		
		
	}

	private static void accountList() {
		System.out.println("---------------");
		System.out.println("계좌 목록");
		System.out.println("---------------");
		
		System.out.println(accountArray[createCount].getAno());
		System.out.println(accountArray[createCount].getOwner());
		
		

	}
	
	private static void deposit() {
		System.out.println("---------------");
		System.out.println("예금");
		System.out.println("---------------");
		
		
		System.out.println(accountArray[createCount].getAno());
		
		System.out.println("예금액을 입력하시오");
		int balance = Integer.parseInt(scanner.nextLine());
		accountArray[createCount].setBalance(balance);
		System.out.println(accountArray[createCount].getBalance());
	}
	
	private static void withdraw() {
		System.out.println("---------------");
		System.out.println("출금");
		System.out.println("---------------");
		
		String ano = scanner.nextLine();
		accountArray[createCount].setAno(ano);
		System.out.println(accountArray[createCount].getAno());
		
		
		int widthdraw = Integer.parseInt(scanner.nextLine());
		System.out.print("출금액 :"+(accountArray[createCount].getBalance()-widthdraw));
		
	}

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택>");

			int selectNo = Integer.parseInt(scanner.nextLine());

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
				System.out.println("프로그램 종료");
			}
		}
		

	}

}
