package day7.javaExceptions;

public class Example3 {
	public static void checkAge(int age) throws Exception {
		if(age < 18) {
			throw new Exception("Access Denied - You must be atleast 18 years old.");
		}
		else {
			System.out.println("Access granted - You are old enough!");
		}
	}
	
	public static void main(String[] args) {
		try {
			checkAge(15);
		} catch (Exception e) {
			System.out.println("Something went wrong " + e.getMessage());
		}
	}
}
