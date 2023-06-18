package edu.jspider.Sep13;

public class Employee implements Cloneable {

	int empId;
	String empName;
	int empAge;
	String gender;
	public Employee(int empId, String empName, int empAge, String gender) {
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + ", gender=" + gender + "]";
	}
	
	
	
}
