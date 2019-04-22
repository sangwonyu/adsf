package Exam0419_16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class CityTable_18 {

	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false", "javauser",
					"javapass");
			
			String query = "select * from city where population>1000000 and countrycode='kor' order by population desc; ";
			
			PreparedStatement pStmt =conn.prepareStatement(query);
			ResultSet rs = pStmt.executeQuery();
			st.executeQuery(query);
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String count = rs.getString(3);
				String dis = rs.getString(4);
				String popu = rs.getString(5);
				System.out.println(id+name+count+dis+popu);
			}
			rs.close();
			st.close();
			
			conn.close();
		} catch (Exception ex) {
			System.err.println(ex.getMessage());
		}
	}

}
