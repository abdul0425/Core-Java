package edu.jspider.Sep17;

public class EmployeeDetails {

	public static void main(String[] args) throws CloneNotSupportedException{
		Address address=new Address("11EB", "Teacher's Colony", "High School", "Barwadih", "Latehar","Jharkhand", "India");
		Employee e1=new Employee("Arshad Alam", 101, 25, "Male",address);
		Employee e2=(Employee)e1.clone();
		e2.a.city="Ranchi";
		e2.a.state="Karnataka";
		System.out.println(e1);
		System.out.println(e2);
	}
}
