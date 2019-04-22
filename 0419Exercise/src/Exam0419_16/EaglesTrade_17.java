package Exam0419_16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class EaglesTrade_17 {
	Connection conn = null;
	Statement st = null;
	private static final String USERNAME = "javauser";
	private static final String PASSWORD = "javapass";
	private static final String URL = "jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false";

	public EaglesTrade_17() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void trade(int backNum, String name, String po, String high, String thro, String hit, int birth, int sal)
			throws SQLException {

		try {
			String query = "insert into eagle value (?,?,?,?,?,?,?,?)";
			PreparedStatement pStmt = conn.prepareStatement(query);
			pStmt.setInt(1, backNum);
			pStmt.setString(2, name);
			pStmt.setString(3, po);
			pStmt.setString(4, high);
			pStmt.setString(5, thro);
			pStmt.setString(6, hit);
			pStmt.setInt(7, birth);
			pStmt.setInt(8, sal);

			pStmt.execute();
			conn.close();
		} catch (Exception ex) {
			System.err.println(ex.getMessage());
		}
	}

	public void trade22(int backNum, String name, String po, String high, String thro, String hit, int birth, int sal)
			throws SQLException {

		try {
			String query = "update eagle set backNum=?, name=?, po=?, high=?, thow=?, hit=?,birth=?,sal=? where backNum=99";
			PreparedStatement pStmt = conn.prepareStatement(query);
			pStmt.setInt(1, backNum);
			pStmt.setString(2, name);
			pStmt.setString(3, po);
			pStmt.setString(4, high);
			pStmt.setString(5, thro);
			pStmt.setString(6, hit);
			pStmt.setInt(7, birth);
			pStmt.setInt(8, sal);

			pStmt.executeUpdate();
			conn.close();
		} catch (Exception ex) {
			System.err.println(ex.getMessage());
		}
	}
}
