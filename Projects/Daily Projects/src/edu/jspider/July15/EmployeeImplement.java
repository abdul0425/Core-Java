package edu.jspider.July15;

public class EmployeeImplement {

	public static void main(String[] args) throws CloneNotSupportedException{
		Address a=new Address("11AB", "Teacher's Colony", "High School", "Barwadih", "Latehar", "Jharkhand");
		Employee e1=new Employee("Arshad Alam", "101DC", "Project Manager", "6299634638", a);
		Employee e2=(Employee)e1.clone();
		System.out.println(e1);
		System.out.println(e2);
		e2.a.city="Bengaluru";
		System.out.println("=======================================================================================================");
		System.out.println(e1);
		System.out.println(e2);
		
	}
	
}
