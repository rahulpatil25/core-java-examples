package day4.arraylist;

import java.util.*;

public class Example7 {
	public static void main(String[] args) {
		ArrayList<Integer> salariesList = new ArrayList<Integer>();
		
		salariesList.add(25000);
		salariesList.add(26000);
		salariesList.add(20000);
		salariesList.add(35000);
		
//		Collections.sort(salariesList, Collections.reverseOrder());
		Collections.sort(salariesList);
		
		for(int x : salariesList) {
			System.out.print(x + "\t");
		}
		
		System.out.println();
		
	}
}
