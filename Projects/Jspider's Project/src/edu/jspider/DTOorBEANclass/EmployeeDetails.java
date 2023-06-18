package edu.jspider.DTOorBEANclass;

public class EmployeeDetails {

	public static void main(String[] args) {
		Employee employee1=new Employee();
		employee1.setEmployeeId(101);
		employee1.setEmployeeName("Arshad Alam");
		employee1.setStudentAge(45);
		employee1.setEmoloyeeContactNumber("6299634638");
		employee1.setGender("Male");
		employee1.getEmployeeId();
		employee1.getEmployeeName();
		employee1.getStudentAge();
		employee1.getEmoloyeeContactNumber();
		employee1.getGender();
		System.out.println();
		
		
		//Employee 2 details.
		Employee employee2=new Employee();
		employee2.setEmployeeId(102);
		employee2.setEmployeeName("Rivu Naskar");
		employee2.setStudentAge(55);
		employee2.setEmoloyeeContactNumber("6222654638");
		employee2.setGender("Male");
		employee2.getEmployeeId();
		employee2.getEmployeeName();
		employee2.getStudentAge();
		employee2.getEmoloyeeContactNumber();
		employee2.getGender();
		System.out.println();
		
		//Employee 3 details.
		Employee employee3=new Employee();
		employee3.setEmployeeId(103);
		employee3.setEmployeeName("Akhil Pandey");
		employee3.setStudentAge(65);
		employee3.setEmoloyeeContactNumber("9988634638");
		employee3.setGender("Male");
		employee3.getEmployeeId();
		employee3.getEmployeeName();
		employee3.getStudentAge();
		employee3.getEmoloyeeContactNumber();
		employee3.getGender();
		
		System.out.println(employee1.toString());
		System.out.println(employee2.toString());
		System.out.println(employee3.toString());
	}

}
