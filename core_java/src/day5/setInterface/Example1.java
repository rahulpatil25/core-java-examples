package day5.setInterface;

import java.util.*;

public class Example1 {
	public static void main(String[] args) {
		Set<Integer> setOfIds = new HashSet<Integer>();
		
		setOfIds.add(1);
		setOfIds.add(2);
		setOfIds.add(2);
		setOfIds.add(34);
		setOfIds.add(420);
		
//		for(int x : setOfIds) {
//			System.out.println(x);
//		}
		
		Iterator<Integer> iterator = setOfIds.iterator();
		while (iterator.hasNext()) {
			int x = iterator.next();
			System.out.println(x);
		}
		
	}
}
