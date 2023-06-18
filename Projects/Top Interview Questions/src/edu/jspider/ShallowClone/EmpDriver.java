package edu.jspider.ShallowClone;

public class EmpDriver {

	public static void main(String[] args) throws CloneNotSupportedException{
		Address a1=new Address("25AB", "Teacher's COlony", "Boy's School", "Latehar", "Barwadih", "Jharkhand", "India");
		Employee e1=new Employee("Mehmed Arsalan", 101, "6299634638", a1);
		Employee e2=(Employee)e1.clone();
		//4375518965576002
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e1==e2);
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e1.equals(e2));
		e2.a.city="Ranchi";
		System.out.println(e1);
		System.out.println(e2);
	}
}
