package Exam0419_16;
import java.util.*;
public class Application_0519_16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("아이디를 입력하세요>");
		int id = Integer.parseInt(scanner.nextLine());
		
		System.out.println("비밀번호를 입력하세요>");
		String pass = scanner.nextLine();
		
		Exam0519_16 col=new Exam0519_16();
		int num = col.verifyIdPassword(id,pass);
		if(num==1) {
			System.out.println("로그인이 되었습니다.");
		}
		else if(num==2) {
			System.out.println("존재하지 않는 아이디입니다.");
		}
		else if(num==3) {
			System.out.println("패스워드가 잘못 되었습니다.");
		} else
			System.out.println("database error");
	}

}
