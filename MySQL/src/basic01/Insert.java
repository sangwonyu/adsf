package basic01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class Insert {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			// 데이터베이스연결 코드
			Class.forName("com.mysql.jdbc.Driver");
			
			//Connection conn = DriverManager.getConnection(URL, USER, PWD); // URL:DB 접속 드라이버 url, USER:DB접속 ID, PWD:비밀번호
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false", "javauser",
					"javapass");
			String query = "update song set lyrics=? where _id=?";
			
			//create the mysql insert preparedStatement
			PreparedStatement pStmt =conn.prepareStatement(query);
			pStmt.setString(1,"왜 예븐 날 두고 가시나(날 두고 가시나)");
			pStmt.setString(2,"117");
			
			//execute the preparedStatement
			//insert update delete 등 create drop 등 실행하는데에 사용
			pStmt.executeUpdate();
			
			conn.close();
		} catch (Exception ex) {
			System.err.println(ex.getMessage());
		}

		finally {
			try {if(conn!=null) {
				conn.close();
			}
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
