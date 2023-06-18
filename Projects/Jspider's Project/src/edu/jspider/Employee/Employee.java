package edu.jspider.Employee;

// Initializing Object's values by Using Method's. When there is no "Constructor".
public class Employee {

	int empId;
	String empName;
	String empAddress;
	
	public void employeeDetails()
	{
		//empId = 101; empName = "Ribhu"; empAddress = "Bengaluru"; for same Object's value use this.
		System.out.println("Employee ID : "+ empId);
		System.out.println("Employee Name : "+ empName);
		System.out.println("Employee Address : "+ empAddress);
	}
	
	//Before constructor's methods are used to initialize data
	public void setEmpData(int empId, String empName, String empAddress)
	{
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
	}
	
	public static void design()
	{
		System.out.println("--------------.........");
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setEmpData(101, "Ribhu", "Bengaluru");
		Employee e2 = new Employee();
		e2.setEmpData(102, "Ameen", "Bengaluru");
		Employee e3 = new Employee();
		e3.setEmpData(103, "Arshad", "Bengaluru");
		
		e1.employeeDetails();
		Employee.design();
		e2.employeeDetails();
		Employee.design();
		e3.employeeDetails();
		Employee.design();
		
	}

}
