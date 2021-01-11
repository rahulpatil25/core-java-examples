package day7.file_handling;
import java.io.*;
public class Example1 {
	public static void main(String[] args) {
		try {
			File file = new File("G:\\courses.txt");
			
			boolean result = file.createNewFile();
			
			if(result) {
				System.out.println("File Successfully created: " + file.getName());
			}
			else {
				System.out.println("File Already exists.");
			}
			
		} catch (Exception e) {
				System.out.println("Exception occurred: " + e);
		}
	}
}
