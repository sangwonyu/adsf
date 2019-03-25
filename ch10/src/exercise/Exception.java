package exercise;

import java.util.*;

public class Exception {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("아이디를 입력하세요>");
		String strId = scanner.nextLine();
		System.out.println("비밀번호를 입력하세요");
		String strPass = scanner.nextLine();

		try {
			login(strId, strPass);
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void login(String id, String password) throws IndexOutOfBoundsException {
		String[] loginIds = { "abcde", "fghij", "klmno", "pqrst", "uvwxyz" };
		String[] passwords = { "abcde12", "fghij12", "klmno12", "pqrst12", "uvwxyz12" };
		String corrId = null;
		String corrPass = null;
		boolean a = false;
		boolean b = false;
		
		for (int i = 0; i < loginIds.length; i++) {
			if (loginIds[i].equals(id)) {
				a = true;
				corrId = loginIds[i];
				break;
			}
		}
		
		for (int i = 0; i < loginIds.length; i++) {
			if (passwords[i].equals(password)) {
				b = true;
				corrPass = passwords[i];
				break;
			}
		}
		
		if (a == false) {
			InvalidLoginIdException noId = new InvalidLoginIdException();
			noId.nomessage("로그인 아이디가 없습니다.");
		}

		if (b == false) {
			InvalidLoginIdException noId = new InvalidLoginIdException();
			noId.nomessage("패스워드가 틀립니다.");
		}
		
		if (corrId != null && corrPass != null) {
			System.out.println("로그인 성공");
		}
	}
}
