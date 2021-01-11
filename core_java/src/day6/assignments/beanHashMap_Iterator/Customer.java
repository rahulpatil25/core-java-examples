package day6.assignments.beanHashMap_Iterator;

public class Customer {
	private String custName;
	private String city;
	private int mobNum;
	
	public Customer(String custName, String city, int mobNum) {
		super();
		this.custName = custName;
		this.city = city;
		this.mobNum = mobNum;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getMobNum() {
		return mobNum;
	}

	public void setMobNum(int mobNum) {
		this.mobNum = mobNum;
	}

	@Override
	public String toString() {
		return "Customer [ Name = " + custName + ", City = " + city + ", Mobile No = " + mobNum + " ] ";
	}
}
