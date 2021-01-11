package day3.Practice.beans;

public class BankAccount {
	private String accountNumber;
	private int totalAmount;
	private String accountHolderName;
	private String accountHolderAddress;
	
	public BankAccount() {
		
	}
	
	
	public BankAccount(String accountNumber, int totalAmount, String accountHolderName, String accountHolderAddress) {
		super();
		this.accountNumber = accountNumber;
		this.totalAmount = totalAmount;
		this.accountHolderName = accountHolderName;
		this.accountHolderAddress = accountHolderAddress;
	}


	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getAccountHolderAddress() {
		return accountHolderAddress;
	}
	public void setAccountHolderAddress(String accountHolderAddress) {
		this.accountHolderAddress = accountHolderAddress;
	}
	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", totalAmount=" + totalAmount + ", accountHolderName="
				+ accountHolderName + ", accountHolderAddress=" + accountHolderAddress + "]";
	}
	
	
	
}
