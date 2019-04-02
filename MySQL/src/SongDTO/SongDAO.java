package SongDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SongDAO {
	private Connection conn;
	private static final String USERNAME = "javauser";
	private static final String PASSWORD = "javapass";
	private static final String URL = "jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false";

	// 생성자
	public SongDAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	// insert 메소드
	public void insertSong(SongDTO song) {
		String query = "insert into song(title,lyrics) values(?,?);";
		PreparedStatement pStmt = null;
		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setString(1, song.getTitle());
			pStmt.setString(2, song.getLyrics());

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

	// Select 메소드
	public SongDTO selectOne(int id) {
		String query = "select *from song where _id=?;";
		PreparedStatement pStmt = null;
		SongDTO song = new SongDTO();
		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setInt(1, id);
			ResultSet rs = pStmt.executeQuery();

			while (rs.next()) {
				song.setId(rs.getInt("_id"));
				song.setTitle(rs.getString("title"));
				song.setLyrics(rs.getString("lyrics"));
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
		return song;
	}

	// update 메소드
	public void update(SongDTO song) {
		String query = "update song set title=?, lyrics=? where _id=?;";
		PreparedStatement pStmt = null;
		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setString(1, song.getTitle());
			pStmt.setString(2, song.getLyrics());
			pStmt.setInt(3, song.getId());

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
	// delete 메소드
	public void deleteSong(SongDTO song) {
		String query = "delete from song where _id=?;";
		PreparedStatement pStmt = null;
		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setInt(1, song.getId());

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
