package day2.practice;

public class Example4 {
	public static void main(String[] args) {
		int[] Array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		float sum = 0;
		
		for(float num : Array1) {
			sum = sum + num;
		}
		
		float average = sum / Array1.length;
		
		System.out.println(average);
	}
}
