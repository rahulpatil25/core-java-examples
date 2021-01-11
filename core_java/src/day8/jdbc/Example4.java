package day8.jdbc;

import utility.DBUtil;
import java.sql.*;
public class Example4 {
	public static void main(String[] args) {
		String userName = "admin";
		String passWord = "465";
		Connection con = DBUtil.getMySqlDbConnection();
		String sql = "select * from login where username=?";
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, userName);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String passwordFromDb = rs.getString("password");
				if (passWord.equals(passwordFromDb)) {
					System.out.println("Login Successful.");
				} else {
					System.out.println("Login Failed.");	
				}
			}
			
		} catch (SQLException e) {
			System.out.println("Exception occurred: " + e);
		}
	}
}
