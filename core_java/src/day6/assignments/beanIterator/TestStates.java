package day6.assignments.beanIterator;
import java.util.*;
public class TestStates {
	public static void main(String[] args) {
		States states1 = new States(403004, "Donna Paula");
		States states2 = new States(411058, "Pune");
		States states3 = new States(796751, "Demgiri");
		States states4 = new States(226001, "Lucknow");
		
		ArrayList<States> statesList = new ArrayList<States>();
		
		statesList.add(states1);
		statesList.add(states2);
		statesList.add(states3);
		statesList.add(states4);
		
		Iterator<States> iterator = statesList.iterator();
		
		while (iterator.hasNext()) {
			States states = iterator.next();
			System.out.println(states);
		}
		
	}
}
