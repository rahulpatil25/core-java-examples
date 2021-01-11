package day5.practice.assignment;
import java.util.*;
import java.util.Map.Entry;

import day3.classAttributes.*;
public class Example1 {
	 public static void main(String[] args) {
		Map<Integer, Employee> employeeMap = new HashMap<Integer, Employee>();
		
		Employee employee1 = new Employee(10001,"John");
		Employee employee2 = new Employee(10002,"Peter");
		Employee employee3 = new Employee(10003,"Derek");
		Employee employee4 = new Employee(10004,"Lisa");
		
		employeeMap.put(252, employee1);
		employeeMap.put(363, employee2);
		employeeMap.put(951, employee3);
		employeeMap.put(486, employee4);
		
//		Set<Integer> keysSet = employeeMap.keySet();
		
//		for(int x : keysSet) {
//			Employee employee = employeeMap.get(x);
//			System.out.println(employee);
//		}
		
//		Iterator<Employee> iterator = keysSet.iterator();
		
		Iterator<Map.Entry<Integer, Employee>> iterator = employeeMap.entrySet().iterator();
		
		while (iterator.hasNext()) {
			Map.Entry<Integer, Employee> entry = iterator.next();
			System.out.println("Key: " + ((Entry<Integer, Employee>) entry).getKey()
					+ " Value: " + ((Entry<Integer, Employee>) entry).getValue());
		}
		
		
		
	}
}
 