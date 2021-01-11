package day2.methods;

public class Example4 {
	public static int add(int x, int y) {
		int z = x + y;
		return z;
	}
	
	public static int subtract(int x, int y) {
		int z = x - y;
		return z;
	}
	
	
	public static void main(String[] args) {
		int result1 = add(6, 9);
		int result2 = subtract(14, 8);
		
		System.out.println("Result 1: " + result1);
		System.out.println("Result 2: " + result2);
	}
}
