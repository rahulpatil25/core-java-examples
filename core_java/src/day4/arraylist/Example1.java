package day4.arraylist;

import java.util.ArrayList;

public class Example1 {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>(); 
		
		cars.add("Volvo");
		cars.add("Ford");
		cars.add("Honda");
		cars.add("Hyundai");
		
		System.out.println(cars);
		
//		System.out.println(cars.get(2));
		
		System.out.println("Updating Volvo to Opel");
		cars.set(0, "Opel");
		System.out.println(cars);
		
		
		System.out.println("Removing Index 2");
		cars.remove(2);
		System.out.println(cars);
		
		
		System.out.println("Now removing all elements from cars ArrayList");
		cars.clear();
		System.out.println(cars);
		
	}
}
