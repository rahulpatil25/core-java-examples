package day3.classAttributes;
import day3.beans.*;

public class TestStudent {
	public static void main(String[] args) {
		Student s = new Student(1, "ABC", "BE");
//		System.out.println(s);
		
		Student s1 = new Student(2, "XYZ", "BE");
//		System.out.println(s1);
		
		Student s2 = new Student(3, "DEF", "BE");
//		System.out.println(s2);
		
		Student s3 = new Student(4, "LMN", "BE");
//		System.out.println(s3);
		
		Student[] arrayOfStudents = {s, s1, s2, s3};
		
		TestStudent ts = new TestStudent();
		ts.displayAllStudents(arrayOfStudents);
		
	}
	
	public void displayAllStudents(Student[] arrayOfStudents) {
		for(Student s : arrayOfStudents) {
			System.out.println(s);
		}
	}
	
}
