package day4.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Example4 {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		
		cars.add("Volvo");
		cars.add("Ford");
		cars.add("Honda");
		cars.add("Hyundai");
		
		Iterator<String> iterator = cars.iterator();
		
		while(iterator.hasNext()) {
			String x = iterator.next();
			System.out.println(x);
		}
	}
}
