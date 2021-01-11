package day8.jdbc_practice;

import java.sql.*;

import beans.Student;
import utility.DBUtil;

public class Example3 {
	public static void main(String[] args) {
		Student student1 = new Student(56, "Peter", "BBA", 3, 19);
		Example3 example3 = new Example3();
//		example3.addStudent(student1);
//		example3.getAllStudents();
//		example3.getStudent(45);
		example3.getStudent("Peter");
	}
	
	public void addStudent(Student student ) {
		System.out.println("Inserting student into Database: " + student);
		Connection con = DBUtil.getMySqlDbConnection();
		String sql = "insert into student value(?,?,?,?,?);";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, student.getRollNumber());
			pst.setString(2, student.getStudentName());
			pst.setString(3, student.getCourse());
			pst.setInt(4, student.getDuration());
			pst.setInt(5, student.getAge());
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
	
	public void getAllStudents() {
		Connection con = DBUtil.getMySqlDbConnection();
		String sql = "select * from student;";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery(sql);
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
	public void getStudent(int rollNumber) {
		String sql = "select * from student where roll_number = ?;";
		Connection con = DBUtil.getMySqlDbConnection();
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, rollNumber);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				String studentName = rs.getString("student_name");
				String course = rs.getString("course");
				int duration = rs.getInt("duration");
				int age = rs.getInt("age");
				System.out.println("***********************************");
				System.out.println("Roll No: " + rollNumber);
				System.out.println("Name: " + studentName);
				System.out.println("Course: " + course);
				System.out.println("Duration: " + duration);
				System.out.println("Age: " + age);
				System.out.println("***********************************");
			} else {
				System.out.println("Student not available");
			}
		} catch (SQLException e) {
			System.out.println("Exception occurred: " + e);
		}
	}
	
	public void getStudent(String studentName) {
		String sql = "select * from student where student_name = ?;";
		Connection con = DBUtil.getMySqlDbConnection();
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, studentName);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				int rollNumber = rs.getInt("roll_number");
				String course = rs.getString("course");
				int duration = rs.getInt("duration");
				int age = rs.getInt("age");
				System.out.println("***********************************");
				System.out.println("Roll No: " + rollNumber);
				System.out.println("Name: " + studentName);
				System.out.println("Course: " + course);
				System.out.println("Duration: " + duration);
				System.out.println("Age: " + age);
				System.out.println("***********************************");
			} else {
				System.out.println("Student not available");
			}
		} catch (SQLException e) {
			System.out.println("Exception occurred: " + e);
		}
	}
}
