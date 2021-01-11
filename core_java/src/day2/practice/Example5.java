package day2.practice;

public class Example5 {
	public static void main(String[] args) {
		String word1 = "Fizz";
		String word2 = "Buzz";
		
		for (int i = 1; i < 100; i++) {
			if(i % 3 == 0) {
				System.out.println(word1);
			}
			
			else if(i % 5 == 0) {
				System.out.println(word2);
			}
			
			else {
				System.out.println(i);
			}
			
			
			if(i % 5 == 0 && i % 3 == 0) {
				System.out.println(word1.concat(word2));
			}
			
		}
	}
}
