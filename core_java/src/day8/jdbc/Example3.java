package day8.jdbc;
//Insert data into Login Table using Statement

import java.sql.*;

public class Example3 {
	public static void main(String[] args) {
		Connection con = getMySqlDbConnection();
		String sql = "insert into login values ('?', '?');";
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, "user");
			pst.setString(2, "456");
			int result = pst.executeUpdate(sql);
			//Above method is used to insert/update/delete Queries.
			
				if(result == 0) {
					System.out.println("Insertion Failed.");
				} else {
					System.out.println("Data inserted successfully");
				}
			
		} catch (Exception e) {
			System.out.println("Exceptin ocurred: " + e);
		}
		
	}
	
	public static Connection getMySqlDbConnection() {
		String driverClassName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/java_training";
		String dbUserName = "root";
		String dbPassword = "1";
		Connection con = null;
		try {
			Class.forName(driverClassName);
			con = DriverManager.getConnection(url, dbUserName, dbPassword);
			
		} catch (Exception e) {
			System.out.println("Exception while creating Db Connection: " + e);
		}
		return con;
	}
}
