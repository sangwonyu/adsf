package bbs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import basic03.EaglesDTO;
import member.MemberDAO;
import member.MemberDTO;

public class BbsDAO {
	private Connection conn;
	private static final String USERNAME = "javauser";
	private static final String PASSWORD = "javapass";
	private static final String URL = "jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false";

	// 생성자
	public BbsDAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	// 글 쓰기 메소드
	public void write(BbsDTO writer) {
		String query = "insert into bbs (title,memberId,date,content) values(?,?,default,?);";
		PreparedStatement pStmt = null;
		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setString(1, writer.getTitle());
			pStmt.setInt(2, writer.getMemberId());
			pStmt.setString(3, writer.getContent());

			pStmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pStmt != null && !pStmt.isClosed())
					pStmt.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
	}

	// 글 조회(틀)
	public List<BbsDTO> selectCondition(String query) {
		PreparedStatement pStmt = null;
		List<BbsDTO> Bbslist = new ArrayList<BbsDTO>();
		try {
			pStmt = conn.prepareStatement(query);
			ResultSet rs = pStmt.executeQuery();
			while (rs.next()) {
				BbsDTO wirte = new BbsDTO();
				wirte.setId(rs.getInt(1));
				wirte.setName(rs.getString(2));
				wirte.setTitle(rs.getString(3));
				wirte.setDate(rs.getString(4));
				wirte.setContent(rs.getString(5));
				

				Bbslist.add(wirte);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pStmt != null && !pStmt.isClosed())
					pStmt.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		return Bbslist;
	}

	// 제목 조회
	public List<BbsDTO> selectTitle(String Title) {
		String sql = "select * from bbs where title like'" + Title + "'order by id desc";
		List<BbsDTO> titleList = selectCondition(sql);
		return titleList;
	}

	// 내용 조회
	public List<BbsDTO> selectContent(String content) {
		String sql = "select * from bbs where content like'%" + content+ "%'order by id desc";
		List<BbsDTO> contentList = selectCondition(sql);
		return contentList;
	}
	// id 조회
		public List<BbsDTO> selectId(int id) {
			String sql = "select * from bbs where id="+id+";";
			List<BbsDTO> contentList = selectCondition(sql);
			return contentList;
		}

	// 글 조회(select)
		public List<BbsDTO> selectOne(int id) {
			PreparedStatement pStmt = null;
			List<BbsDTO> Bbslist = new ArrayList<BbsDTO>();
			String sql = "select  bbs.id, member_table.name, bbs.title, bbs.date, bbs.content from member_table inner join bbs on member_table.id=bbs.memberId where memberid=?;";
			try {
				pStmt = conn.prepareStatement(sql);
				ResultSet rs = pStmt.executeQuery();
				pStmt.setInt(1, id);
				while (rs.next()) {
					BbsDTO wirte = new BbsDTO();
					wirte.setId(rs.getInt(1));
					wirte.setName(rs.getString(2));
					wirte.setTitle(rs.getString(3));
					wirte.setDate(rs.getString(4));
					wirte.setContent(rs.getString(5));
					

					Bbslist.add(wirte);
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (pStmt != null && !pStmt.isClosed())
						pStmt.close();
				} catch (SQLException se) {
					se.printStackTrace();
				}
			}
			return Bbslist;
		}

	// 글 수정
	public void revice(BbsDTO revice) {
		String query = "update bbs set title=?,content=? where id=?";
		PreparedStatement pStmt = null;
		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setString(1, revice.getTitle());
			pStmt.setString(2, revice.getContent());
			pStmt.setInt(3, revice.getId());

			pStmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pStmt != null && !pStmt.isClosed())
					pStmt.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
	}

	// 글 삭제
	public void delete(int write) {
		String query = "delete from bbs where id=?;";
		PreparedStatement pStmt = null;
		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setInt(1, write);

			pStmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pStmt != null && !pStmt.isClosed())
					pStmt.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
	}
	// 로그인메소드
	public void corr(int id, String pass) {
		MemberDAO mDao = new MemberDAO();
		MemberDTO mem = mDao.selectOne(id);System.out.println(mem.toString());
		
		if (pass.equals(mem.getPassword())) {
			System.out.println("로그인이 되었습니다.");
		} else {
			System.out.println("password가 틀렸습니다.");
		}
	}
}

