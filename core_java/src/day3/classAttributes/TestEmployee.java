package day3.classAttributes;

public class TestEmployee {
	public static void main(String[] args) {
		Employee e = new Employee();
		System.out.println(e.getEmployeeID());
		System.out.println(e.getEmployeeName());
		
		System.out.println();
		System.out.println("Updating values of Employee Object");
		System.out.println();
		
		e.setEmployeeID(5599);
		e.setEmployeeName("XYZ");

		
		System.out.println(e.getEmployeeID());
		System.out.println(e.getEmployeeName());
		
		System.out.println();
		System.out.println("Creating Object with parameterized constructor");
		System.out.println();
		
		Employee ex = new Employee(5001, "ABC");
		System.out.println(ex.getEmployeeID());
		System.out.println(ex.getEmployeeName());
		
		System.out.println("*******************************");
		System.out.println(ex);
	}
}
