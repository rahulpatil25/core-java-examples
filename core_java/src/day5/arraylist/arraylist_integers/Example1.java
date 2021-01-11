package day5.arraylist.arraylist_integers;
import java.util.*;

public class Example1 {
	public static void main(String[] args) {
		ArrayList<Integer> speed = new ArrayList<Integer>();
		
		speed.add(150);
		speed.add(26);
		speed.add(80);
		speed.add(65);
		speed.add(45);
		
		Collections.sort(speed);
		
		for(Integer x : speed) {
			System.out.print(x + " ");
		}
		
		
	}
}
