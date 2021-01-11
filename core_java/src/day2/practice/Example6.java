package day2.practice;

public class Example6 {
	public static void main(String[] args) {
		int[] marks = {69, 85, 66, 80, 81};
		
		int sum = 0;
		
		for(int i : marks) {
			sum = sum + i;
		}
		
		System.out.println(sum);
	}
}
