package edu.jspider.Comparable;

public class Employee implements Comparable<Employee>{

	String employeeName;
	int employeeId;
	double employeeSalary;
	public Employee(String employeeName, int employeeId, double employeeSalary) {
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.employeeSalary = employeeSalary;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeId=" + employeeId + ", employeeSalary="
				+ employeeSalary + "]";
	}
	@Override
	public int compareTo(Employee obj)
	{
		return employeeName.compareTo(obj.employeeName);
	}
}