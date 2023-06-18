package edu.jspider.Association;

public class Student {

	String studentName;
	String studentId;
	String studentMobNo;
	public Student(String studentName, String studentId, String studentMobNo) {
		this.studentName = studentName;
		this.studentId = studentId;
		this.studentMobNo = studentMobNo;
	}
	
	void studentDetails(Student s)
	{
		System.out.println("Student Name : "+studentName);
		System.out.println("Student Id : "+studentId);
		System.out.println("Student Mob Number : "+studentMobNo);
	}
	
	void pattern()
	{
		System.out.println("------------------------------");
	}
	
}
