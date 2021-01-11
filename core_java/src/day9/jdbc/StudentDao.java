package day9.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import beans.Student;
import utility.DBUtil;

public class StudentDao {
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
	
	public void deleteStudent(int rollNumber) {
		Connection con = DBUtil.getMySqlDbConnection();
		String sql = "delete from student where roll_number=?;";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, rollNumber);
			int result = pst.executeUpdate();
			if(result == 0) {
				System.out.println("Deletion of Student Failed");
			} else {
				System.out.println("Deletion of Student successful");
			}
		} catch (SQLException e) {
			System.out.println("Exception occurred: " + e);
		}
	}
	public void updateStudent(Student student) {
		Connection con = DBUtil.getMySqlDbConnection();
		String sql = "update student set student_name=?,course=?,duration,age=? where roll_number=?;";
		try {
			PreparedStatement pst =con.prepareStatement(sql);
			pst.setString(1, student.getStudentName());
			pst.setString(2, student.getCourse());
			pst.setInt(3, student.getDuration());
			pst.setInt(4, student.getAge());
			pst.setInt(5, student.getRollNumber());
			int result = pst.executeUpdate();
			if(result == 0) {
				System.out.println("Student Details Updation Failed");
			} else {
				System.out.println("Student Details updated successfully");
			}
		} catch (SQLException e) {
			System.out.println("Exception occurred: " + e);
		}
	}
}
