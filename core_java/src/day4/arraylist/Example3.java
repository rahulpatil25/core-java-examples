package day4.arraylist;

import java.util.ArrayList;

public class Example3 {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		
		cars.add("Volvo");
		cars.add("Ford");
		cars.add("Honda");
		cars.add("Hyundai");
		
		for(String x: cars) {
			System.out.println(x);
		}
		
	}
}
