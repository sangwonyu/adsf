package member;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
 
public class BoardDAO {
	Connection conn;
    private static final String USERNAME = "javauser";
    private static final String PASSWORD = "javapass";
    private static final String URL = "jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false";
    private static final Logger LOG = LoggerFactory.getLogger(BoardDAO.class);
 
    
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
			LOG.info("doGet(): IllegalStateException Error");
		} finally {
			try {
				if (pStmt != null && !pStmt.isClosed()) 
					pStmt.close();
			} catch (SQLException e) {
				LOG.debug(e.getMessage());
			}
		}	
    }
    
    public int getCount() {
		String query = "select count(*) from bbs;";
		PreparedStatement pStmt = null;
		int count = 0;
		try {
			pStmt = conn.prepareStatement(query);
			ResultSet rs = pStmt.executeQuery();
			while (rs.next()) {				
				count = rs.getInt(1);
			}
			rs.close();
		} catch (Exception e) {
			LOG.info("doGet(): IllegalStateException Error");
		} finally {
			try {
				if (pStmt != null && !pStmt.isClosed()) 
					pStmt.close();
			} catch (SQLException se) {
				LOG.debug(se.getMessage());
			}
		}
		return count;
	}
    
    public void updateBoard(BoardDTO board) {
    	String query = "update bbs set title=?, content=? where Id=?;";
    	PreparedStatement pStmt = null;
    	try {
			pStmt = conn.prepareStatement(query);
			pStmt.setString(1, board.getTitle());
			pStmt.setString(2, board.getContent());
			pStmt.setInt(3, board.getId());
			
			pStmt.executeUpdate();
		} catch (Exception e) {
			LOG.info("doGet(): IllegalStateException Error");
		} finally {
			try {
				if (pStmt != null && !pStmt.isClosed()) 
					pStmt.close();
			} catch (SQLException se) {
				LOG.debug(se.getMessage());
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
			LOG.info("doGet(): IllegalStateException Error");
		} finally {
			try {
				if (pStmt != null && !pStmt.isClosed()) 
					pStmt.close();
			} catch (SQLException se) {
				LOG.debug(se.getMessage());
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
				LOG.debug(se.getMessage());
			}
		}
    	return board;
    }
    
    public List<BoardDTO> selectJoin() {
    	String query = "select bbs.id, bbs.title, member_table.name, bbs.date from bbs inner join member_table on bbs.memberId=member_table.id order by id desc;";
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
			LOG.debug(e.getMessage());
		} finally {
			try {
				if (pStmt != null && !pStmt.isClosed()) 
					pStmt.close();
			} catch (SQLException se) {
				LOG.debug(se.getMessage());
			}
		}
    	return boardList;
    }
    	
    public String prepareDownload_Board() {
    	
    	
    	StringBuffer sb = new StringBuffer();
    	List<BbsMember> bList=selectJoinAll(0);
    	
    	try {
    		BufferedWriter fw= new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:/tmp/board_list.csv"),"euc-kr"));
    		String head="글번호,제목,글쓴이,최종수정일\n";
    		sb.append(head);
    		fw.write(head);
    		for(BbsMember mDto:bList) {
    			String line = mDto.getId()+","+mDto.getTitle()+","+mDto.getName()+"," + mDto.getDate()+"\n";
    			sb.append(line);
    			fw.write(line);
    		}
    		fw.flush();
    		fw.close();
    	} catch(IOException e) {
    		LOG.debug(e.getMessage());
    	}
    	return sb.toString();
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
				LOG.debug(se.getMessage());
			}
		}
    	return boardList;
    }
    
    public List<BbsMember> selectJoinAll(int page) {
		int offset = 0;
		String query = null;
		if (page == 0) {	// page가 0이면 모든 데이터를 보냄
			query = "select bbs.id, bbs.title, member_table.name, bbs.date from bbs " + 
					"inner join member_table on bbs.memberId=member_table.id order by bbs.id desc;";
		} else {			// page가 0이 아니면 해당 페이지 데이터만 보냄
			query = "select bbs.id, bbs.title, member_table.name, bbs.date from bbs " + 
					"inner join member_table on bbs.memberId=member_table.id order by bbs.id desc limit ?, 10;";
			offset = (page - 1) * 10;
		}
		PreparedStatement pStmt = null;
		List<BbsMember> bmList = new ArrayList<BbsMember>();
		try {
			pStmt = conn.prepareStatement(query);
			if (page != 0)
				pStmt.setInt(1, offset);
			ResultSet rs = pStmt.executeQuery();
			while (rs.next()) {	
				BbsMember bmDto = new BbsMember();
				bmDto.setId(rs.getInt(1));
				bmDto.setTitle(rs.getString(2));
				bmDto.setName(rs.getString(3));
				bmDto.setDate(rs.getString(4).substring(0, 16));
				bmList.add(bmDto);
			}
			rs.close();
		} catch (Exception e) {
			LOG.info("doGet(): IllegalStateException Error");
		} finally {
			try {
				if (pStmt != null && !pStmt.isClosed()) 
					pStmt.close();
			} catch (SQLException se) {
				LOG.debug(se.getMessage());
			}
		}
		return bmList;
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
			LOG.info("doGet(): IllegalStateException Error");
		} finally {
			try {
				if (pStmt != null && !pStmt.isClosed()) 
					pStmt.close();
			} catch (SQLException se) {
				LOG.debug(se.getMessage());
			}
		}
    }
    
    public void close() {
    	try {
			if (conn != null && !conn.isClosed()) 
				conn.close();
		} catch (SQLException e) {
			LOG.debug(e.getMessage());
		}
    }
    
    public BoardDTO searchById(int Id) {
    	String sql = "select * from bbs where id=" + Id + ";";
    	BoardDTO bDto = selectOne(sql);
    	return bDto;
    }
}