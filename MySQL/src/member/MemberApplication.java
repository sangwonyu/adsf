package member;

import java.util.*;
import java.sql.*;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class MemberApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MemberDAO mDao = new MemberDAO();
		boolean run = true;
		while (run) {
			System.out.println("---------------------------------------------------");
			System.out.println("1.회원가입|2.조회|3.변경|4.삭제|5.검색|6.완료");
			System.out.println("---------------------------------------------------");
			int selecNum = Integer.parseInt(scanner.nextLine());
			if (selecNum == 1) {
				// 회원가입
				System.out.println("비밀번호를 입력하세요.문자로입력");
				String pass = scanner.nextLine();
				System.out.println("이름을 입력하세요.");
				String name = scanner.nextLine();

				System.out.println("생일을 입력하세요.");
				String date = scanner.nextLine();

				System.out.println("주소를 입력하세요.");
				String address = scanner.nextLine();
				mDao.joinMember(new MemberDTO(pass, name, date, address));
			} else if (selecNum == 2) {
				// 1명 조회
				System.out.println("1.아이디조회|2.생년월일조회");
				int selecNum2 = Integer.parseInt(scanner.nextLine());
				if (selecNum2 == 1) {
					System.out.println("아이디조회한번 가겠습니다. id입력해주세요>");
					int num = Integer.parseInt(scanner.nextLine());
					MemberDTO mem = mDao.selectOne(num);
					System.out.println("조회하신 멤버: " + mem.toString());
				} else if (selecNum2 == 2) {
					// 생년월일검색
					System.out.println("생년월일을 입력하세요>");
					String birth = scanner.nextLine();
					List<MemberDTO> memList = mDao.selectBirth(birth);
					for (MemberDTO mems : memList) {
						System.out.println(mems.toString());
					}
				}
			} else if (selecNum == 3) {
				// 멤버변경
				System.out.println("멤버 내용 변경");
				MemberDTO mDto = new MemberDTO();
				System.out.println("변경할id를 입력하세요 ");
				int num = Integer.parseInt(scanner.nextLine());
				mDto = mDao.selectOne(num);
				System.out.println(mDto.toString());// 변경전
				System.out.println("변경할password입력하세요");
				mDto.setPassword(scanner.nextLine());
				System.out.println("변경할 이름을입력하세요");
				mDto.setName(scanner.nextLine());
				System.out.println("변경할 생일을 입력하세요");
				mDto.setBirthday(scanner.nextLine());
				System.out.println("변경할 주소입력하세요");
				mDto.setAddress(scanner.nextLine());
				mDao.MemberUpdate(mDto);
				System.out.println(mDao.selectOne(num).toString());// 변경후
			} else if (selecNum == 4) {
				System.out.println("삭제할 id입력하세요");
				int num = Integer.parseInt(scanner.nextLine());
				mDao.deleteMember(num);
				System.out.println(mDao.toString());
			} else if (selecNum == 5) {
				System.out.println("검색할 이름을 입력하세요>");
				String name = scanner.nextLine();
				List<MemberDTO> dt = mDao.selectName(name);
				for (MemberDTO nameList : dt) {
					System.out.println(nameList.toString());
				}
			} else if (selecNum == 6) {
				run = false;
			}
		}
		System.out.println("로그인?y,n로대답");
		String answer = scanner.nextLine();
		String a = "y";
		if (answer.equals(a)) {
			System.out.println("Login:id");
			int id = Integer.parseInt(scanner.nextLine());
			System.out.println("password");
			String pass = scanner.nextLine();
			
				mDao.corr(id, pass);
			
		} else {
			System.out.println("시스템종료");
		}
	}
}
