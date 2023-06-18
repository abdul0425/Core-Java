package edu.jspider.CloneShallow;

public class StudentDetails {

	public static void main(String[] args) throws CloneNotSupportedException {
		Address a1=new Address("12BC", "Aswath Nagar", "MarathaHalli Bridge", "Marathahalli", "Bengalore", "Bengaluru", "Karnataka", "India");
		Student s1=new Student(101, "Arshad Alam", "Male",a1);
		Student s2=(Student) s1.clone();
		Student s3=(Student) s1.clone();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		//s2.a.city="Mysore";
		//s3.a.city="Ranchi";
		
		System.out.println("----------------------------------------------------------------------");
		System.out.println("----------------------------------------------------------------------");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
	}

}
