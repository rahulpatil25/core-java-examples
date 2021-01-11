package day5.hashMapExamples;
import java.util.*;

import day3.classAttributes.Employee;

public class Example6 {
	public static void main(String[] args) {
		Set<Employee> employeeSet = new HashSet<Employee>();
		
		Employee employee1 = new Employee(10001,"John");
		Employee employee2 = new Employee(10002,"Peter");
		Employee employee3 = new Employee(10003,"Derek");
		Employee employee4 = new Employee(10004,"Lisa");
		
		employeeSet.add(employee1);
		employeeSet.add(employee2);
		employeeSet.add(employee3);
		employeeSet.add(employee4);
		
		for(Employee employee : employeeSet) {
			System.out.println(employee);
		}
		
		Iterator<Employee> iterator = employeeSet.iterator();
		
//		while (iterator.hasNext()) {
//			Employee employee = iterator.next();
//			System.out.println(employee);
//		}
		
	}
}
