package edu.jspider.Composition;

public class Employee {

	int empId;
	String empName;
	String empCompany;
	String empMobile;
	Address a;
	public Employee(int empId, String empName, String empCompany, String empMobile,Address a) {
		this.empId = empId;
		this.empName = empName;
		this.empCompany = empCompany;
		this.empMobile = empMobile;
		this.a=a;
	}
	
	void empDetails()
	{
		System.out.println("Employee Id         : "+empId);
		System.out.println("Employee Name       : "+empName);
		System.out.println("Employee Company    : "+empCompany);
		System.out.println("Employee Mobile No  : "+empMobile);
		System.out.println("Address             : "+a.houseNo+","
				+ a.street+","
						+ a.area+","
								+ a.city+","
										+ a.state+","
												+ a.country);
	}
	
	void pattern()
	{
		System.out.println("--------------------------------");
	}
}
