package day4.userInput;

import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter Age: ");
		int age = sc.nextInt();
		
		System.out.print("Enter Salary: ");
		double salary = sc.nextDouble();
		
		System.out.println("***************************");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Salary: " + salary);
		
		
	}
}
