package day8.jdbc_practice;

import java.sql.*;

import beans.Student;
import utility.DBUtil;

public class Example1 {
	public static void main(String[] args) {
		Student student1 = new Student(45, "John", "B.E.", 4, 18);
		Example1 example1 = new Example1();
		example1.addStudent(student1);
	}
	public void addStudent(Student student) {
		System.out.println("Inserting student into Database: " + student);
		try {
			Connection con = DBUtil.getMySqlDbConnection();
			String sql = "insert into student value(?,?,?,?,?);";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, student.getRollNumber());
			pst.setString(2, student.getStudentName());
			pst.setString(3, student.getCourse());
			pst.setInt(4, student.getDuration());
			pst.setInt(5, student.getAge());
//			ResultSet rs = pst.executeQuery(sql);
			int result = pst.executeUpdate();
			if(result == 0) {
				System.out.println("Query Failed");
			} else {
				System.out.println("Success");
			}
			con.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
	
}
