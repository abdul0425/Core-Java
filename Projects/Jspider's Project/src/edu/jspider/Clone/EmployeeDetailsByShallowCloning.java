package edu.jspider.Clone;

public class EmployeeDetailsByShallowCloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address a1=new Address("12C", "High School", "Doranda", "Ranchi", "Ranchi", "Jharkhand", "India");
		
		Employee e1=new Employee(101, "Ranchi", 65,a1);
		Employee e2=e1.clone();
		
		System.out.println(e1.toString());
		System.out.println(e2.toString());
	}

}
