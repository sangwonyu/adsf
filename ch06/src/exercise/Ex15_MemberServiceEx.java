package exercise;

public class Ex15_MemberServiceEx {

	public static void main(String[] args) {
		Ex15_MemberService memberService = new Ex15_MemberService("홍길동", "hong");
		
		boolean result =memberService.login("hong","12345");
		if(result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
		// TODO Auto-generated method stub

	}

}
