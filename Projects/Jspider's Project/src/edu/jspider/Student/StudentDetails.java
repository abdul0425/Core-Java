package edu.jspider.Student;

import java.util.Scanner;

public class StudentDetails {

	int studentId;
	String studentName;
	int studentAge;
	String gender;

	public StudentDetails(int studentId,String studentName,int studentAge,String gender)
	{
		this.studentId=studentId;
		this.studentName=studentName;
		this.studentAge=studentAge;
		this.gender=gender;
	}
	
	public StudentDetails(int studentId,String studentName,int studentAge,StudentDetails s)
	{
		this.studentId=studentId;
		this.studentName=studentName;
		this.studentAge=studentAge;
		this.gender=s.gender;
	}
	
	void studentDetails()
	{
		System.out.println("Student ID : "+ studentId);
		System.out.println("Student Name : "+ studentName);
		System.out.println("Student Age : "+ studentAge);
		System.out.println("Gender : "+ gender);
	}
	
	static void pattern()
	{
		System.out.println("----------------------");
	}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		StudentDetails s1 = new StudentDetails(101,"Arshad",65,"male");
		s1.studentDetails();
		StudentDetails.pattern();
		StudentDetails s2 = new StudentDetails(102,"Ribhu",57,s1.gender);
		s2.studentDetails();
		StudentDetails.pattern();
	}

}
