package day7.javaExceptions.user_defined_exception;

public class Test {
	public static void checkAge(int age) throws AgeNotValidException{
		if(age < 18) {
			throw new AgeNotValidException("Access Denied - You must be 18 years old.");
		}
		else {
			System.out.println("Access granted - You are old enough");
		}
	}
	
	public static void main(String[] args) {
		try {
			checkAge(15);
		} catch (AgeNotValidException e) {
			e.printStackTrace();
		}
	}
}
