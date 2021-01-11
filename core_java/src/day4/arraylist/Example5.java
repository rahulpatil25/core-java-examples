package day4.arraylist;

import java.util.*;

public class Example5 {
	public static void main(String[] args) {
		ArrayList<Integer> salariesList = new ArrayList<Integer>();
		
		salariesList.add(25000);
		salariesList.add(26000);
		salariesList.add(20000);
		salariesList.add(25000);
		
		for(int x:salariesList) {
			System.out.println(x);
		}
		
	}
}
