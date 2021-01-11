package day6.assignments.beanHashMap_forEach;

public class Account {
	private int accNO;
	public String accHolderName;
	
	
	public Account() {
	}
	
	
	public Account(int accNO, String accHolderName) {
		super();
		this.accNO = accNO;
		this.accHolderName = accHolderName;
	}


	public int getAccNO() {
		return accNO;
	}
	public void setAccNO(int accNO) {
		this.accNO = accNO;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	@Override
	public String toString() {
		return "Account No: " + accNO + " Account Holder Name: " + accHolderName;
	}
}
