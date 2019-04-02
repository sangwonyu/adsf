package basic01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DateTable {
	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;
		try {
			// 데이터베이스연결 코드
			Class.forName("com.mysql.jdbc.Driver");
			
			//Connection conn = DriverManager.getConnection(URL, USER, PWD); // URL:DB 접속 드라이버 url, USER:DB접속 ID, PWD:비밀번호
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false", "javauser",
					"javapass");
			// 쿼리를 가져옴 executecreateStatement():쿼리에 넣은 state형성.그 state를 Query(sql): sql문장을
			// 통해 쿼리에 놓고 실행
			st = conn.createStatement();
			String sql = "select * FROM date_table;";
			
			//데이터베이스로 전송되어질 sql문은 statement 객체를 실행하기 위한 메소드들의 인자로서 공급.
			//: 하나의 ResultSet을 만드는 SQL문에서 사용(executeQyery 메소드는 ResultSet 객체를 리턴한다.)
		    //: 주로 SELECT문을 이용하는 조회에서 사용됨.
			ResultSet rs = st.executeQuery(sql);
			// song안에 몇개있는지 몰라 while로 접근
			while (rs.next()) {
				int id = rs.getInt(1);// 데이터베이스는 1이 시작.
				String datetime = rs.getString(2);
				System.out.printf("%8d %s\n",id, datetime);
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
