package day1.booleans;

public class Example4 {
	public static void main(String[] args) {
		String name1 = "ABC";
		String name2 = "abc";
		
		if(name1.equalsIgnoreCase(name2)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}
}
