package day5.hashMapExamples;
import java.util.*;
public class Example1 {
	public static void main(String[] args) {
		HashMap<Integer, String> mapOfCities = new HashMap<Integer, String>();
		
		mapOfCities.put(1, "Pune");
		mapOfCities.put(2, "Mumbai");
		mapOfCities.put(3, "Sydney");
		mapOfCities.put(4, "Melbourne");
		
//		System.out.println(mapOfCities);
		
		Set<Integer> keysSet = mapOfCities.keySet();
		
//		for(int x : keysSet) {
//			String city = mapOfCities.get(x);
//			
//			System.out.println(x + " " +city);
//		}
		
		Iterator<Integer> iterator = keysSet.iterator();
		
		while (iterator.hasNext()) {
			int key = iterator.next();
			String city = mapOfCities.get(key);
			System.out.println(city);
		}
		
	}
}
