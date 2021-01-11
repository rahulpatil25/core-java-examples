package day4.javaDates;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Example2 {
	public static void main(String[] args) {
		LocalDateTime myDateObj = LocalDateTime.now();
		System.out.println("Before Formatting: " + myDateObj);
		DateTimeFormatter myFormatterObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		String formattedDate = myDateObj.format(myFormatterObj);
		System.out.println("After Formatting: " + formattedDate);
		
	}
}
