package day5.hashMapExamples;
import java.util.*;
public class Example4 {
	public static void main(String[] args) {
		Set<String> countries = new HashSet<String>();
		
		countries.add("INDIA");
		countries.add("AUSTRALIA");
		countries.add("UK");
		countries.add("USA");
		
//		for(String x : countries) {
//			System.out.println(x);
//		}
		
		Iterator<String> iterator = countries.iterator();
		
		while (iterator.hasNext()) {
			String c = iterator.next();
			System.out.println(c);
		}
		
	}
}
