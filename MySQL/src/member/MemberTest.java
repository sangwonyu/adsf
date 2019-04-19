package member;

import java.util.List;

public class MemberTest {
	public static void main(String[] args) {
		MemberDAO mDao = new MemberDAO();
		
		//mDao.insertMember(new MemberDTO("dlakdl", "이마이", "1988-05-04", "서울시 강동구 둔촌동"));
		//MemberDTO mDto = mDao.searchById(100001);
		//MemberDTO mDto = mDao.searchByName("최%");
		//mDao.updateMember(new MemberDTO(100002, "qkrelql", "박디비", "1998-08-21", "대전시 유성구 봉명동"));
		//mDao.deleteMember(100004);
		
		List<MemberDTO> memberList = mDao.selectAll();
		for (MemberDTO member: memberList)
			System.out.println(member.toString());
		
		mDao.close();
	}
}