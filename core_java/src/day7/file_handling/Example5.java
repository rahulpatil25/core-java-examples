package day7.file_handling;
import java.io.*;
public class Example5 {
	public static void main(String[] args) {
		try {
			File folder = new File("G:\\pp");
			
			boolean result = folder.exists();
			if(result) {
				System.out.println("Folder named pp exists");
				System.out.println("Deleting folder");
				folder.delete();
				System.out.println("Folder deleted successfully");
			}
			else {
				System.out.println("Folder named pp does not exists");
			}
		} catch (Exception e) {
			System.out.println("Exception occurred: " + e);
		}
	}
}
