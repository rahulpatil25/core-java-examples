package day7.file_handling;

import java.io.*;
import java.util.Scanner;

public class Example3 {
	public static void main(String[] args) {
		File file = new File("courses.txt");
		try {
			Scanner scan = new Scanner(file);
			while(scan.hasNext()) {
				String x = scan.nextLine();
				System.out.println(x);
			}
			scan.close();
		} catch (FileNotFoundException e) {
			System.out.println("Exception occurred: " + e);
		}
	}
}
