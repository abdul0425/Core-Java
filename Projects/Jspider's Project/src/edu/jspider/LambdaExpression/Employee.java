package edu.jspider.LambdaExpression;
public class Employee {

	String empName;
	int empSalary;
	int experience;
	public Employee(String empName, int empSalary, int experience) {
		this.empName = empName;
		this.empSalary = empSalary;
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empSalary=" + empSalary + ", experience=" + experience + "]";
	}
	
}