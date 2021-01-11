package day5.hashMapExamples;
import java.util.*;


public class Example3 {
	public static void main(String[] args) {
		HashMap<String, Integer> marks = new HashMap<String, Integer>();
		
		marks.put("Derek", 60);
		marks.put("Peter", 95);
		marks.put("Lisa", 80);
		marks.put("Kevin", 55);
		
//		System.out.println(marks);
		
		
		Set<String> keysSet = marks.keySet();
		for(String x : keysSet) {
			Integer candidates = marks.get(x);
			System.out.println(candidates + " " + x);
		}
		
		
		
	}
}
