package day8.jdbc;

import java.sql.*;
//Demo of JDBC Connection
public class Example1 {
	public static void main(String[] args) {
		String driverClassName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/java_training";
		String dbUserName = "root";
		String dbPassword = "1";
		
		try {
			Class.forName(driverClassName);
			Connection con = DriverManager.getConnection(url, dbUserName, dbPassword);
			System.out.println("Connection: " + con);
			
			String sql = "select * from login";
			//Statement or PreparedStatement
//			Statement st = con.createStatement();
//			st.executeQuery(sql);
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery(sql);
			while(rs.next()) {
				String username = rs.getString("username");
				String password = rs.getString("password");
				System.out.println("User Name: " + username);
				System.out.println("Password: " + password);
				System.out.println("****************************");
			}
			con.close();
		} catch (Exception e) {
			System.out.println("Exception Ocurred: " + e);
		}
		
	}
}
