package basic01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectMain {
	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;
		try {
			//데이터베이스연결 코드
			//jdbc드라이버 로딩
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false", "javauser", "javapass");
			//쿼리를 가져옴 executecreateStatement():쿼리에 넣은 state형성.그 state를 Query(sql): sql문장을 통해 쿼리에 놓고 실행
			st = conn.createStatement();
			String sql = "select * FROM song;";
			ResultSet rs = st.executeQuery(sql);
			//song안에 몇개있는지 몰라 while로 접근
			while (rs.next()) {
				int songId = rs.getInt(1);//데이터베이스는 1이 시작.
				String title = rs.getString(2);
				String lyrics = rs.getString(3);
				System.out.printf("%8d %-20s\t%s\n", songId, title, lyrics);
			}
			rs.close();
			st.close();
			conn.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		} 
		
		finally {
			try {
				if (st != null)
					st.close();
			} catch (SQLException se2) {
			}
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
	}
}
