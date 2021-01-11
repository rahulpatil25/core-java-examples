package day3.classAttributes;

public class Employee {
	private int employeeID;
	private String employeeName;
	
	public Employee() {
		
	}
	
	public Employee(int employeeID, String employeeName) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
	}
	
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", employeeName=" + employeeName + "]";
	}
	
	
	
}
