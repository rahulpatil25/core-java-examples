package day4.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Example6 {
	public static void main(String[] args) {
		ArrayList<String> arraylist = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		
		int count;
		System.out.print("Enter No. of Cities: ");
		count = Integer.parseInt(scan.nextLine());
		
		for(int i = 1; i <= count; i++) {
			System.out.println("************************");
			System.out.print("Enter the city name: ");
			String city = scan.nextLine();
			arraylist.add(city);
		}
		System.out.println(arraylist);
	}
}
