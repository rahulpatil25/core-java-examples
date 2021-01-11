package day7.file_handling;
import java.io.*;

//Demo for Deleting the File
public class Example4 {
	public static void main(String[] args) {
		File file = new File("courses.txt");
		boolean fileExists = file.exists();
		if(fileExists) {
			System.out.println("This File exists.");
			System.out.println("Now going to delete this file");
			boolean deletionSuccessful = file.delete();
			if(deletionSuccessful) {
				System.out.println("File deleted successfully");
			}
			else {
				System.out.println("File deletion failed");
			}
		}
		else {
			System.out.println("This file does not exist.");
		}
		
	}
}
