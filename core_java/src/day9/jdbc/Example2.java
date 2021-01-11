package day9.jdbc;

import beans.Student;

public class Example2 {
	public static void main(String[] args) {
		Student student = new Student(69, "Ken", "B.Sc", 3, 21);
		Student student2 = new Student(420, "Matthew", "B.Pharm", 3, 17);
		Student student3 = new Student(666, "Lucifer", "B.E. Mech", 4, 18);
		StudentDao example1 = new StudentDao();
//		example1.addStudent(student);
//		example1.addStudent(student2);
//		example1.addStudent(student3);
//		example1.deleteStudent(56);
//		example1.getAllStudents();
	}
}
