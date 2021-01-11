package day4.arraylist.arrayListOfBeans;

import java.util.ArrayList;

import day3.classAttributes.Employee;

public class Example1 {
	public static void main(String[] args) {
		Employee employee1 = new Employee(1001, "Derek");
		Employee employee2 = new Employee(1002, "Eric");
		Employee employee3 = new Employee(1003, "Peter");
		Employee employee4 = new Employee(1004, "Lisa");
		
		ArrayList<Employee> employeesList = new ArrayList<Employee>();
		
		employeesList.add(employee1);
		employeesList.add(employee2);
		employeesList.add(employee3);
		employeesList.add(employee4);
		
//		System.out.println(employeesList);
		
		for(Employee employee: employeesList) {
			System.out.println(employee);
		}
		
		
	}
}
