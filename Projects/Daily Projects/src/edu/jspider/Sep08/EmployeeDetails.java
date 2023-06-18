package edu.jspider.Sep08;

public class EmployeeDetails {

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.setEmpId(101);
		e1.setEmpName("Arshad");
		e1.setCompany("Jspider");
		e1.getEmpId();
		e1.getEmpName();
		e1.getCompany();
		
		Employee e2=new Employee();
		e2.setEmpId(201);
		e2.setEmpName("Rivu");
		e2.setCompany("Jspider");
		e2.getEmpId();
		e2.getEmpName();
		e2.getCompany();
		
		Employee e3=new Employee();
		e3.setEmpId(301);
		e3.setEmpName("Akhil");
		e3.setCompany("Jspider");
		e3.getEmpId();
		e3.getEmpName();
		e3.getCompany();
		
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		System.out.println(e3.toString());
	}
}
