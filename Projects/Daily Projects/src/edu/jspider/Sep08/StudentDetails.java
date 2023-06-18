package edu.jspider.Sep08;

public class StudentDetails {

	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		s1.setStudentId(101);
		s1.setName("Arshad Alam");
		s2.setStudentId(102);
		s2.setName("Rivu Naskar");
		s3.setStudentId(103);
		s3.setName("Akhil Pandu");
		s1.getStudentId();
		s1.getName();
		s2.getStudentId();
		s2.getName();
		s3.getStudentId();
		s3.getName();
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
	}
}
