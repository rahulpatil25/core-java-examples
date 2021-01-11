package day8.jdbc;

import utility.DBUtil;
import java.sql.*;
public class Example5 {
	public static void main(String[] args) {
		String userName = "john";
		String passWord = "123";
		Connection con = DBUtil.getMySqlDbConnection();
		String sql = "select * from login where username=?";
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, userName);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				String passwordFromDb = rs.getString("password");
				if (passWord.equals(passwordFromDb)) {
					System.out.println("Login Successful.");
				} else {
					System.out.println("Login Failed.");	
				}
			} else {
				System.out.println("User ID is not present in Database");
			}
			
		} catch (SQLException e) {
			System.out.println("Exception occurred: " + e);
		}
	}
}
