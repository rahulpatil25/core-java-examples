package day3.Practice.inheritance;
import java.util.*;

public class Volume extends Area {
	private int height;
	public void input2() {
		input1();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Height: ");
		height = sc.nextInt();
	}
	
	void show() {
		System.out.println("******************************************");
		System.out.println("Length: " + length);
		System.out.println("Width: " + width);
		System.out.println("Area: " + (length * width));
		System.out.println("Height: " + height);
		System.out.println("Volume: " + (length * width * height));
		System.out.println("******************************************");
	}
}
