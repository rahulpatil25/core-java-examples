package day6.assignments.beanHashMap_forEach;
import java.util.*;
public class TestAccount {
	public static void main(String[] args) {
		Account account1 = new Account(36589, "John");
		Account account2 = new Account(98563, "Peter");
		Account account3 = new Account(12687, "Derek");
		Account account4 = new Account(65243, "Lisa");
		
		HashMap<Integer, Account> accountMap = new HashMap<Integer, Account>();
		
		accountMap.put(1, account1);
		accountMap.put(2, account2);
		accountMap.put(3, account3);
		accountMap.put(4, account4);
		
		Set<Integer> keysSet = accountMap.keySet();
		
		for(int x : keysSet) {
			Account account = accountMap.get(x);			
			System.out.println(x + " " + account);
		}
		
	}
}
