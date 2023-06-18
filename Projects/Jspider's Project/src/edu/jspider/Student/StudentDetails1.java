package edu.jspider.Student;

public class StudentDetails1 {

	int studentId;
	String studentName;
	int studentAge;
	String gender;

	StudentDetails1(int studentId, String studentName, int studentAge, String gender) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.gender = gender;

	}

	StudentDetails1(int studentId, String studentName, StudentDetails1 a, StudentDetails1 s) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = a.studentAge;
		this.gender = s.gender;
	}

	void details() {
		System.out.println("Student ID : " + studentId);
		System.out.println("Student Name : " + studentName);
		System.out.println("Student Age : " + studentAge);
		System.out.println("Gender : " + gender);
	}

	static void pattern() {
		System.out.println("----------------------");
	}

	public static void main(String[] args) {

		StudentDetails1 s1 = new StudentDetails1(101, "Arshad", 65, "male");
		s1.details();
		StudentDetails1.pattern();
		StudentDetails1 s2 = new StudentDetails1(102, "Ribhu", s1.studentAge, s1.gender);
		s2.details();
		StudentDetails1.pattern();
	}
}
