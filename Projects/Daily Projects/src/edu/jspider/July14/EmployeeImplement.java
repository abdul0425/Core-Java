package edu.jspider.July14;

public class EmployeeImplement {

	public static void main(String[] args) throws CloneNotSupportedException{
		Address a1=new Address("256AB", "Teacher's Colony", "Near Boy's High School", "Barwadih", "Latehar", "Jharkhand");
		Employee e1=new Employee("Mehmed Arsalan", "54MA", "6299634638", a1);
		Employee e2=(Employee)e1.clone();
		
		System.out.println(e1);
		System.out.println(e2);
		
		e2.add.city="Bengaluru";
		System.out.println(e1);
		System.out.println(e2);
		
		
	}
}
