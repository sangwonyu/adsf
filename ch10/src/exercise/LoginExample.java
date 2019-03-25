package exercise;

public class LoginExample {

	public static void main(String[] args) {
		try {
			login("white", "12345");
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

		try {
			login("blue", "54321");
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void login(String id, String password) throws IndexOutOfBoundsException {

		// id가 "blue"가 아니라면 NotExistIDExeption 발생시킴
		if (!id.equals("blue")) {
			NotExistIDExeption no = new NotExistIDExeption();
			no.NotExist("아이디가 존재하지 않습니다.");
			
		}

		// password가 "12345"가 아니라면 WrongPasswordException 발생시킴
		if (!password.equals("12345")) {
			WrongPasswordException wro = new WrongPasswordException();
			wro.WrongPass("패스워드가 다릅니다.");
		}
	}
}
