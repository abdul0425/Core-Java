package edu.jspider.Clone;

public class StudentDetailsByDeepCloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		StudentAddress sa1=new StudentAddress("11AC", "Teacher'sRoad", "Firayalal", "Ranchi", "Ranchi", "Jharkhand", "India");
		StudentAddress sa2= sa1.clone();
		sa2.city="Kolkata";
		//StudentAddress sa3= sa2.clone();
		
		Student s1=new Student(101, "Arshad Alam", "Java Developer", sa1);
		Student s2=new Student(102, "Rivu Naskar", "Python Developer", sa2);
		//Student s3=new Student(103, "Akhil Pandu", "Front-End Developer", sa3);
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		//System.out.println(s3.toString());
		
	}

}
