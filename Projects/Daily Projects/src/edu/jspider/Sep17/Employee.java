package edu.jspider.Sep17;

public class Employee implements Cloneable {

	String empName;
	int empId;
	int empAge;
	String empGender;
	Address a;
	public Employee(String empName, int empId, int empAge, String empGender, Address a) {
		this.empName = empName;
		this.empId = empId;
		this.empAge = empAge;
		this.empGender = empGender;
		this.a=a;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", empAge=" + empAge + ", empGender=" + empGender
				+ ", empAddress=" + a +"]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Employee emp=(Employee)super.clone();
		emp.a=(Address)a.clone();
		return emp;
	}
	
	
}
