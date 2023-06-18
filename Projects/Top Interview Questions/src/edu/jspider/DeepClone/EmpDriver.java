package edu.jspider.DeepClone;

public class EmpDriver {

	public static void main(String[] args)throws CloneNotSupportedException {
		Address a1=new Address("12AB", "Teacher's Colony", "Boy's High School", "Latehar", "Barwadih", "Jharkhand", "India");
		Employee e1=new Employee("Mehmed Arsalan", 101, "6299634638", a1);
		Employee e2=(Employee)e1.clone();
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e1.equals(e2));
		e2.a.city="Ranchi";
		System.out.println("==================================================================");
		System.out.println(e1);
		System.out.println(e2);
		System.out.println("==================================================================");
		System.out.println(e1.equals(e2));
	}
}
