package day6.assignments.beanHashMap_Iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import day3.classAttributes.Employee;

public class TestCustomer {
	public static void main(String[] args) {
		Customer customer1 = new Customer("John", "Jerusalem", 888999);
		Customer customer2 = new Customer("Peter", "London", 444555);
		Customer customer3 = new Customer("Derek", "Tokyo", 777222);
		Customer customer4 = new Customer("Lisa", "Moscow", 555111);
		
		HashMap<Integer, Customer> customerMap = new HashMap<Integer, Customer>();
		
		customerMap.put(555, customer1);
		customerMap.put(420, customer2);
		customerMap.put(666, customer3);
		customerMap.put(786, customer4);
		
		Iterator<Map.Entry<Integer, Customer>> iterator = customerMap.entrySet().iterator();
		
		while(iterator.hasNext()) {
			Map.Entry<Integer, Customer> entry = iterator.next();
			System.out.println("Key: " + ((Entry<Integer, Customer>) entry).getKey()
					+ " Value: " + ((Entry<Integer, Customer>) entry).getValue());
		}
		
	}
}
