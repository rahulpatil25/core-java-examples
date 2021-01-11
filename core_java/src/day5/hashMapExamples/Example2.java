package day5.hashMapExamples;
import java.util.*;
public class Example2 {
	public static void main(String[] args) {
		Map<String, String> mapOfStatesAndCities = new HashMap<String, String>();
		
		
		mapOfStatesAndCities.put("Pune", "Maharashtra");
		mapOfStatesAndCities.put("Gandhinagar", "Gujarat");
		mapOfStatesAndCities.put("Hyderabad", "Telangana");
		mapOfStatesAndCities.put("Chennai", "Tamilnadu");
		
//		System.out.println(mapOfStatesAndCities);
		Set<String> keysSet = mapOfStatesAndCities.keySet();
		
//		for(String x : keysSet) {
//			String states = mapOfStatesAndCities.get(x);
//			System.out.println(states);
//		}
		
		Iterator<String> iterator = keysSet.iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			String state = mapOfStatesAndCities.get(key);
			System.out.println(state);
		}
		
		
		
	}
}
