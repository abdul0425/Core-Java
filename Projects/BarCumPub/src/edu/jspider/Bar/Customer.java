package edu.jspider.Bar;

public class Customer {

	private String customerName;
	private int customerId;
	private String contactNo;
	private int customerAge;
	public Customer(String customerName, int customerId, String contactNo, int customerAge) {
		this.customerName = customerName;
		this.customerId = customerId;
		this.contactNo = contactNo;
		this.customerAge = customerAge;
	}
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerId=" + customerId + ", contactNo=" + contactNo
				+ ", customerAge=" + customerAge + "]";
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public int getCustomerAge() {
		return customerAge;
	}
	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}
	
	
}
