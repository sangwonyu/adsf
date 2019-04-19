package member;

import java.util.List;
import java.util.Scanner;

public class MemberApplication {
	static Scanner scan = new Scanner(System.in);
	static MemberDAO mDao = new MemberDAO();
	public static void main(String[] args) {
		boolean run = true;	
		while(run) {
			System.out.print("1.가입 | 2.조회 | 3.변경 | 4.삭제 | 5.검색 | 6.로그인 | 7.종료 >>> ");
			int selectNo = Integer.parseInt(scan.nextLine());
			
			switch(selectNo) {
			case 1:
				create(); break;
			case 2:
				list(); break;
			case 3:
				update(); break;
			case 4:
				delete(); break;
			case 5:
				search(); break;
			case 6:
				login(); break;
			case 7:
				run = false; break;
			default:
				System.out.println("Warning: 1에서 7까지의 숫자만 입력하세요.");
			}
		}
		mDao.close();
		System.out.println("프로그램 종료");
	}
	
	private static void create() {
		System.out.println("회원가입");
		System.out.print("패스워드> ");
		String password = scan.nextLine();
		System.out.print("이름> ");
		String name = scan.nextLine();
		System.out.print("생년월일(yyyy-mm-dd)> ");
		String birthday = scan.nextLine();
		System.out.print("주소> ");
		String address = scan.nextLine();
		mDao.insertMember(new MemberDTO(password, name, birthday, address));
	}

	private static void list() {
		List<MemberDTO> memberList = mDao.selectAll();
		for (MemberDTO member: memberList)
			System.out.println(member.toString());
	}
	
	private static void update() {
		System.out.print("수정할 회원 ID> ");
		int memberId = Integer.parseInt(scan.nextLine());
		MemberDTO member = mDao.searchById(memberId);
		System.out.print("패스워드(" + member.getPassword() + ")> ");
		String password = scan.nextLine();
		if (password.length() != 0)
			member.setPassword(password);
		System.out.print("이름(" + member.getName() + ")> ");
		String name = scan.nextLine();
		if (name.length() != 0)
			member.setName(name);
		System.out.print("생년월일(" + member.getBirthday() + ")> ");
		String birthday = scan.nextLine();
		if (birthday.length() != 0)
			member.setBirthday(birthday);
		System.out.print("주소(" + member.getAddress() + ")> ");
		String address = scan.nextLine();
		if (address.length() != 0)
			member.setAddress(address);
		//System.out.println(member.toString());
		mDao.updateMember(member);
	}
	
	private static void delete() {
		System.out.print("삭제할 회원 ID> ");
		int memberId = Integer.parseInt(scan.nextLine());
		mDao.deleteMember(memberId);
	}
	
	private static void search() {
		System.out.print("검색할 회원이름> ");
		String memberName = scan.nextLine();
		MemberDTO mDto = mDao.searchByName(memberName);
		System.out.println(mDto.toString());
	}
	
	private static void login() {
		System.out.print("회원 ID > ");
		int memberId = Integer.parseInt(scan.nextLine());
		System.out.print("패스워드> ");
		String password = scan.nextLine();
		MemberDTO mDto = mDao.searchById(memberId);
		
		if (memberId != mDto.getId()) {
			System.out.println("회원 ID에 해당하는 회원이 없습니다.");
			return;
		}
		if (!password.equals(mDto.getPassword())) {
			System.out.println("패스워드가 틀렸습니다.");
			return;
		}
		System.out.println("로그인 되었습니다.");
	}
}