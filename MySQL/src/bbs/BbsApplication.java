package bbs;

import java.util.*;

import member.MemberDAO;

public class BbsApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BbsDAO bDao = new BbsDAO();

		boolean run = true;
		System.out.println("로그인 하세요>");
		MemberDAO mDao = new MemberDAO();
		System.out.println("Login:id");
		int id = Integer.parseInt(scanner.nextLine());
		System.out.println("password");
		String pass = scanner.nextLine();
		boolean a = mDao.corr(id, pass);
		while(!a) {
			System.out.println("다시로그인하세요");
			System.out.println("Login:id");
			id = Integer.parseInt(scanner.nextLine());
			System.out.println("password");
			pass = scanner.nextLine();
			a = mDao.corr(id, pass);
		}
		if (a == true) {
			while (run) {
				System.out.println("---------------------------------------------------");
				System.out.println("1.글 쓰기|2.조회|3.수정|4.삭제|5.상세 조회|6.완료");
				System.out.println("---------------------------------------------------");
				int selecNum = Integer.parseInt(scanner.nextLine());

				if (selecNum == 1) {
					System.out.println("글의 제목을 입력하세요.>");
					String title = scanner.nextLine();
					System.out.println("멤버 아이디를 입력하세요>");
					int memId = Integer.parseInt(scanner.nextLine());
					System.out.println("글을 쓰세요>");
					String write = scanner.nextLine();

					bDao.write(new BbsDTO(title, memId, write));
					System.out.println(bDao.toString());
				} else if (selecNum == 2) {
					System.out.println("조회를 시작하겠습니다.");
					List<BbsDTO> btoList = bDao.selectOne(id);
					for (BbsDTO btoLists : btoList) {
						System.out.println(btoLists.toString());
					}
				} else if (selecNum == 3) {
					System.out.println("글을 수정하시겠습니다. 수정할 아이디를 입력하세요>");
					int reviceId = Integer.parseInt(scanner.nextLine());
					System.out.println("제목 수정하세요>");
					String reviceTitle = scanner.nextLine();
					System.out.println("글 내용을 수정하세요>");
					String reviceContent = scanner.nextLine();
					bDao.revice(new BbsDTO(reviceTitle, reviceContent, reviceId));
					System.out.println("수정이 완료되었습니다.");
					System.out.println(bDao.toString());
				} else if (selecNum == 4) {
					System.out.println("글을 삭제하겠습니다. 삭제할 아이디를 입력하세요>");
					int deleteId = Integer.parseInt(scanner.nextLine());
					bDao.delete(deleteId);
				} else if (selecNum == 5) {
					System.out.println("1.제목조회|2.글 내용 조회|3.아이디 조회");
					int num = Integer.parseInt(scanner.nextLine());
					if (num == 1) {
						System.out.println("조회할 제목을 입력하세요>");
						String title = scanner.nextLine();
						List<BbsDTO> bDto = bDao.selectTitle(title);
						for (BbsDTO bdtoList : bDto) {
							System.out.println(bdtoList.toString());
						}
					} else if (num == 2) {
						System.out.println("조회할 글 내용을 입력하세요>");
						String content = scanner.nextLine();
						List<BbsDTO> bDto = bDao.selectContent(content);
						for (BbsDTO bdtoList : bDto) {
							System.out.println(bdtoList.toString());
						}
					} else if (num == 3) {
						System.out.println("조회할 아이디를 입력하세요>");
						int id2 = Integer.parseInt(scanner.nextLine());
						List<BbsDTO> bDto = bDao.selectId(id2);
						for (BbsDTO bdtoList : bDto) {
							System.out.println(bdtoList.toString());
						}
					} else if (selecNum == 6) {
						run = false;
					}
				}
			}
		}
	}
}
