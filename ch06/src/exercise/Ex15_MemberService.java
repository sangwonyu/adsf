package exercise;

public class Ex15_MemberService {
	// field
	String login;
	String logout;
	String id;
	String password;

	// 생성자
	
	Ex15_MemberService(String login, String id) {
		this.login = login;
		this.id = id;
	}

	boolean login(String id, String password) {
		this.id = id;
		this.password = password;
		
		if(id.equals("hong")&&password.equals("12345"))
				return true;
		else
				return false;
	}

	void logout(String login) {
		System.out.println(login + "님이 로그아웃 되었습니다.");
		
	}
}
