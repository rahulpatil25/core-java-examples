package day5.linkedList;

import java.util.Collections;
import java.util.LinkedList;

public class Example3 {
	public static void main(String[] args) {
		LinkedList<Integer> salariesList = new LinkedList<Integer>();
		
		salariesList.add(15000);
		salariesList.add(16000);
		salariesList.add(10000);
		salariesList.add(5000);
		
		Collections.sort(salariesList);
		
		for(int x : salariesList) {
			System.out.println(x);
		}
		
	}
}
