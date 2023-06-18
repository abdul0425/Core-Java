package edu.jspider.July15;

public class Employee implements Cloneable{

	String employeeName;
	String employeeId;
	String designation;
	String mobNo;
	Address a;
	public Employee(String employeeName, String employeeId, String designation, String mobNo, Address a) {
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.designation = designation;
		this.mobNo = mobNo;
		this.a = a;
	}
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeId=" + employeeId + ", designation=" + designation
				+ ", mobNo=" + mobNo + ", a=" + a + "]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		Employee e=(Employee)super.clone();
		e.a=(Address)a.clone();
		return e;
	}
	
}
