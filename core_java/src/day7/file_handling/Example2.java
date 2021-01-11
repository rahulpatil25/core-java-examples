package day7.file_handling;
import java.io.*;
public class Example2 {
	public static void main(String[] args) {
		try {
			FileWriter fileWriter = new FileWriter("courses.txt");
			fileWriter.write("Core Java \n");
			fileWriter.write("Python \n");
			fileWriter.write("C++ \n");
			fileWriter.close();
			System.out.println("Successfully written in the file.");
		} 
		catch (IOException e) {
			System.out.println("Exception occurred: " + e);
		}
	}
}
