package edu.jspider.DTOorBEANclass;

import java.io.Serializable;

public class Employee implements Serializable {
	private int employeeId;
	private String employeeName;
	private int studentAge;
	private String emoloyeeContactNumber;
	private String gender;
	
	
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId +"\n"+ " employeeName=" + employeeName +"\n"+ " studentAge=" + studentAge +"\n"
				+ " emoloyeeContactNumber=" + emoloyeeContactNumber +"\n"+ " gender=" + gender + "]";
	}
	
	
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	public String getEmoloyeeContactNumber() {
		return emoloyeeContactNumber;
	}
	public void setEmoloyeeContactNumber(String emoloyeeContactNumber) {
		this.emoloyeeContactNumber = emoloyeeContactNumber;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
