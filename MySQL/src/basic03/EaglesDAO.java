package basic03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import SongDTO.SongDTO;

public class EaglesDAO {
	private Connection conn;
	private static final String USERNAME = "javauser";
	private static final String PASSWORD = "javapass";
	private static final String URL = "jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false";

	// 생성자
	public EaglesDAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	//SelectOne메소드
	public EaglesDTO selectOne(int backNo) {
		String query = "select *from eagle where backNum=?;";
		PreparedStatement pStmt = null;
		EaglesDTO player = new EaglesDTO();
		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setInt(1, backNo);
			ResultSet rs = pStmt.executeQuery();

			while (rs.next()) {
				player.setBackNo(rs.getInt(1));
				player.setName(rs.getString(2));
				player.setPosition(rs.getString(3));
				player.setHs(rs.getString(4));
				player.setHand(rs.getString(5));
				player.setHhit(rs.getString(6));
				player.setBirth(rs.getInt(7));
				player.setSalary(rs.getInt(8));
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
		return player;
	}
	
	//selectCondtion -> select의틀이라고 생각하면됨.
		public List<EaglesDTO> selectCondition(String query) {
			PreparedStatement pStmt = null;
			List<EaglesDTO> playerlist = new ArrayList<EaglesDTO>();
			try { 
				pStmt=conn.prepareStatement(query);
				ResultSet rs =pStmt.executeQuery();
				
				while(rs.next()) {
					EaglesDTO player =new EaglesDTO();
					player.setBackNo(rs.getInt(1));
					player.setName(rs.getString(2));
					player.setPosition(rs.getString(3));
					player.setHs(rs.getString(4));
					player.setHand(rs.getString(5));
					player.setHhit(rs.getString(6));
					player.setBirth(rs.getInt(7));
					player.setSalary(rs.getInt(8));
					playerlist.add(player);
				}
			} catch(Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if (pStmt != null && !pStmt.isClosed())
						pStmt.close();
				} catch (SQLException se) {
					se.printStackTrace();
				}
			}
			return playerlist;
		} 
		//position select
		public List<EaglesDTO> selectPlayersByPosition(String position){
			String sql= "select * from eagle where po like '" +position+"';";
			List<EaglesDTO> playerList=selectCondition(sql); 
			return playerList;
		}
		//selectAll 
		public List<EaglesDTO> selectAll() {
			String sql ="select * from eagle";
			List<EaglesDTO> playerList=selectCondition(sql); 
			return playerList;
		}
		//조건부select
		public List<EaglesDTO> selectPlayersBySalary(int salary) {
			String sql ="select * from eagle where sal>="+salary+";";
			PreparedStatement pStmt = null;
			List<EaglesDTO> playerList=selectCondition(sql); 
			return playerList;
		} 
	//insert 메소드
	public void insertEagles(EaglesDTO player) {
		String query = "insert into eagle values(?,?,?,?,?,?,?,?);";
		PreparedStatement pStmt = null;
		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setInt(1, player.getBackNo());
			pStmt.setString(2, player.getName());
			pStmt.setString(3, player.getPosition());
			pStmt.setString(4, player.getHs());
			pStmt.setString(5,player.getHand());
			pStmt.setString(6, player.getHit());
			pStmt.setInt(7, player.getBirth());
			pStmt.setInt(8, player.getSalary());
			
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
	
	// update 메소드
		public void update(EaglesDTO player) {
			String query = "update eagle set name=?,po=?,high=?,thow=?,hit=?,birth=?,sal=? where backNum=?;";
			PreparedStatement pStmt = null;
			try {
				pStmt = conn.prepareStatement(query);
				pStmt.setInt(1, player.getBackNo());
				pStmt.setString(2, player.getName());
				pStmt.setString(3, player.getPosition());
				pStmt.setString(4, player.getHs());
				pStmt.setString(5,player.getHand());
				pStmt.setString(6, player.getHit());
				pStmt.setInt(7, player.getBirth());
				pStmt.setInt(8, player.getSalary());

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
		//delete 메소드
		public void deleteEagles(int backNo) {
			String query = "delete from eagle where backNum=?;";
			PreparedStatement pStmt = null;
			try {
				pStmt = conn.prepareStatement(query);
				pStmt.setInt(1, backNo);
				
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
		
		
	// close 메소드
		public void close() {
			try {
				if (conn != null && !conn.isClosed())
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
}
