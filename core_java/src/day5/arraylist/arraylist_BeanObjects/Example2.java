package day5.arraylist.arraylist_BeanObjects;
import java.util.*;
import day3.Practice.beans.BankAccount;

public class Example2 {
	public static void main(String[] args) {
		BankAccount bankAccount1 = new BankAccount("123", 25000, "ABC", "IND");
		BankAccount bankAccount2 = new BankAccount("456", 26000, "JKL", "AUS");
		BankAccount bankAccount3 = new BankAccount("357", 20000, "LMN", "SA");
		BankAccount bankAccount4 = new BankAccount("951", 35000, "XYZ", "UK");
		
		ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
		
		accounts.add(bankAccount1);
		accounts.add(bankAccount2);
		accounts.add(bankAccount3);
		accounts.add(bankAccount4);
		
//		for(BankAccount a : accounts) {
//			System.out.println(a);
//		}
		
		Iterator<BankAccount> iterator = accounts.iterator();
		
		System.out.println("****************************************");
		
		while (iterator.hasNext()) {
			BankAccount b = iterator.next();
			System.out.println(b);
		}
		
		
		
		
	}
}
