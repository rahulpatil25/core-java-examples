package day3.scannerExample;

import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Username: ");
		String userName = sc.nextLine();
		
		System.out.print("Enter Age: ");
		int age = sc.nextInt();
		
		System.out.println("***************************");
		System.out.println("Username: " + userName);
		System.out.println("Age: " + age);
	}
}
