package edu.jspider.Sep09;


public class Employee implements Cloneable {
	
	int employeeId;
	String employeeName;
	int employeeAge;
	
	public Employee(int employeeId, String employeeName, int employeeAge) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeAge=" + employeeAge
				+ "]";
	}
	
	@Override
	protected Employee clone() throws CloneNotSupportedException
	{
		return (Employee) super.clone();
	}
}
