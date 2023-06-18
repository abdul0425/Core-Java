package edu.jspider.Clone;

public class Employee implements Cloneable{
	int empId;
	String empName;
	int empAge;
	Address a;
	
	public Employee(int empId, String empName, int empAge,Address a) {
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.a=a;
	}

	
	
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + ", a=" + a + "]";
	}




	protected Employee clone() throws CloneNotSupportedException
	{
		return (Employee)super.clone();
	}
}
