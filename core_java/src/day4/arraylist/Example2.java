package day4.arraylist;

import java.util.ArrayList;

public class Example2 {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		
		cars.add("Volvo");
		cars.add("Ford");
		cars.add("Honda");
		cars.add("Hyundai");
		
		for(int i = 0; i < cars.size(); i++) {
			String x = cars.get(i);
			System.out.println(x);
		}
		
	}
}
