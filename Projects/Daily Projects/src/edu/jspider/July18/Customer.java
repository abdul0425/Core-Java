package edu.jspider.July18;

public class Customer {

	String customerName;
	int customerId;
	String contactNo;
	int customerAge;
	public Customer(String customerName, int customerId, String contactNo, int customerAge) {
		this.customerName = customerName;
		this.customerId = customerId;
		this.contactNo = contactNo;
		this.customerAge = customerAge;
	}
	@Override
	public String toString() {
		return "CustomerRegistrationForm [customerName=" + customerName + ", customerId=" + customerId + ", contactNo="
				+ contactNo + ", customerAge=" + customerAge + "]";
	}
	
	
}
