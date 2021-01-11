package day8.jdbc_practice;

import java.sql.*;

import beans.Student;
import utility.DBUtil;

public class Example2 {
	public static void main(String[] args) {
		try {
			Connection con = DBUtil.getMySqlDbConnection();
			String sql = "select * from student;";
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery(sql);
//			int result = pst.executeUpdate();
			while(rs.next()) {
				System.out.println("Roll No: " + rs.getInt(1) + "\n"
						+ "Name: " + rs.getString(2) + "\n"
						+ "Course: " + rs.getString(3) + "\n"
						+ "Duration: " + rs.getString(4) + "\n"
						+ "Age: " + rs.getString(5) + "\n");
			}
			con.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
}
