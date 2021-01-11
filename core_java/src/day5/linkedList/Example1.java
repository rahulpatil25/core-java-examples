package day5.linkedList;
import java.util.*;


public class Example1 {
	public static void main(String[] args) {
		LinkedList<String> cars = new LinkedList<String>();
		
		
		cars.add("Volvo");
		cars.add("Ford");
		cars.add("Honda");
		cars.add("Hyundai");
		
		System.out.println(cars);
		
		System.out.println("Updating Volvo to Opel");
		cars.set(0, "Opel");
		System.out.println(cars);
		
		System.out.println("Now removing all elements from cars LinkedList");
		cars.clear();		
		
		System.out.println(cars);
	}
}
