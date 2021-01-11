package day3.Practice.inheritance;

import java.util.Scanner;

public class Area {
	protected int length;
	protected int width;
	
	public void input1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length: ");
		length = sc.nextInt();
		System.out.print("Enter Width: ");
		width = sc.nextInt();
	}
	
}
