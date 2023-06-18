package edu.jspider.Sep14;

public class Employee implements Comparable{

	String empId;
	String empName;
	int empAge;
	String empGender;
	
	public Employee(String empId, String empName, int empAge, String empGender) {
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.empGender = empGender;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + ", empGender=" + empGender
				+ "]";
	}
	
	
	// For Name wise Arrange.
//	@Override
//	public int compareTo(Object o)
//	{
//		
//		return empName.compareTo(((Employee)o).empName);
//	}
	
	
	// Id wise Arrange.
	@Override
	public int compareTo(Object o)
	{
		
		return empId.compareTo(((Employee)o).empId);
	}
	
	
	
	
	
}
