package day5.arraylist.arraylist_StringValues;
import java.util.*;
public class Example1 {
	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<String>();
		
		fruits.add("Apples");
		fruits.add("Bananas");
		fruits.add("Oranges");
		fruits.add("Pomegranates");
		
		for(String x : fruits) {
			System.out.println(x);
		}
		
	}
}
