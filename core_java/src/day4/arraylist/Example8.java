package day4.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Example8 {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		
		cars.add("Volvo");
		cars.add("Ford");
		cars.add("Honda");
		cars.add("Hyundai");
		
		Collections.sort(cars);
		
		for(String x : cars) {
			System.out.print(x + "\t");
		}
		
		System.out.println();
	}
}
