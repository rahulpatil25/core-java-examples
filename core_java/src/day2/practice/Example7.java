package day2.practice;

public class Example7 {
	public static void main(String[] args) {
		int[] salaries = {20000, 25000, 55000, 47000, 38000};
		int salaryToFind = 55000;
		
		boolean found = false;
		
		for(int n : salaries) {
			if(n == salaryToFind) {
				found = true;
				break;
			}
		}
		
		if(found) {
			System.out.println(salaryToFind + " is found.");
		}
		else {
			System.out.println(salaryToFind + " is not found.");
		}
		
		
		
		
	}
}
