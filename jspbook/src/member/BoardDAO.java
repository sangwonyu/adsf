package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

public class BoardDAO {
	Connection conn;
    private static final String USERNAME = "javauser";
    private static final String PASSWORD = "javapass";
    private static final String URL = "jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false";

    public BoardDAO() {
    	try { 
			Class.forName("com.mysql.jdbc.Driver");	
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
    	} catch (Exception ex) {
			ex.printStackTrace();
		}
    }
    
    public void addBoard(BoardDTO board) {
    	String query = "insert into bbs (memberId,title,date,content) values(?,?,now(),?)";
    	PreparedStatement pStmt = null;
    	try {
			pStmt = conn.prepareStatement(query);
			pStmt.setInt(1, board.getMemberId());
			pStmt.setString(2, board.getTitle());
			pStmt.setString(3, board.getContent());
			
			
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
    
    public void updateBoard(BoardDTO board) {
    	String query = "update bbs set title=?, content=? where memberId=?;";
    	PreparedStatement pStmt = null;
    	try {
			pStmt = conn.prepareStatement(query);
			pStmt.setString(1, board.getTitle());
			pStmt.setString(2, board.getContent());
			pStmt.setInt(3, board.getMemberId());
			
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
    
    public void deleteBoard(int Id) {
    	String query = "delete from bbs where id=?;";
    	PreparedStatement pStmt = null;
    	try {
			pStmt = conn.prepareStatement(query);
			pStmt.setInt(1, Id);
			
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
    
    public BoardDTO selectOne(String query) {
    	PreparedStatement pStmt = null;
    	BoardDTO board = new BoardDTO();
    	try {
			pStmt = conn.prepareStatement(query);
			ResultSet rs = pStmt.executeQuery();
			
			while (rs.next()) {
				board.setId(rs.getInt(1));
				board.setMemberId(rs.getInt(2));
				board.setTitle(rs.getString(3));
				board.setDate(rs.getString(4));
				board.setContent(rs.getString(5));
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
    	return board;
    }
    
    public List<BoardDTO> selectJoin() {
    	String query = "select bbs.id, bbs.title, member_table.name, bbs.date from bbs inner join member_table on bbs.memberId=member_table.id;";
    	PreparedStatement pStmt = null;
    	List<BoardDTO> boardList = new ArrayList<BoardDTO>();
    	try {
			pStmt = conn.prepareStatement(query);
			ResultSet rs = pStmt.executeQuery();
			
			while (rs.next()) {
				BoardDTO board = new BoardDTO();
				board.setId(rs.getInt(1));
				board.setTitle(rs.getString(2));
				board.setName(rs.getString(3));
				board.setDate(rs.getString(4));
				boardList.add(board);
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
    	return boardList;
    }
    	
    
    public List<BoardDTO> selectAll() {
    	String query = "select * from bbs;";
    	PreparedStatement pStmt = null;
    	List<BoardDTO> boardList = new ArrayList<BoardDTO>();
    	try {
			pStmt = conn.prepareStatement(query);
			ResultSet rs = pStmt.executeQuery();
			
			while (rs.next()) {
				BoardDTO board = new BoardDTO();
				board.setId(rs.getInt(1));
				board.setMemberId(rs.getInt(2));
				board.setTitle(rs.getString(3));
				board.setDate(rs.getString(4));
				board.setContent(rs.getString(5));
				boardList.add(board);
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
    	return boardList;
    }
    
       
    public void insertBoard(BoardDTO board) {
    	String query = "insert into bbs(memberId,title,now(),content) values (?, ?,?);";
    	PreparedStatement pStmt = null;
    	try {
			pStmt = conn.prepareStatement(query);
			pStmt.setInt(1, board.getMemberId());
			pStmt.setString(2, board.getTitle());
			pStmt.setString(3, board.getContent());
			
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
    
    public void close() {
    	try {
			if (conn != null && !conn.isClosed()) 
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
    
    public BoardDTO searchById(int Id) {
    	String sql = "select * from bbs where id=" + Id + ";";
    	BoardDTO bDto = selectOne(sql);
    	return bDto;
    }
}
