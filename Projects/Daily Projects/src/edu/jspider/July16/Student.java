package edu.jspider.July16;

public class Student {

	String studentName;
	int studentAge;
	int studentId;
	public Student(String studentName, int studentAge, int studentId) {
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.studentId = studentId;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentAge=" + studentAge + ", studentId=" + studentId + "]";
	}
	
}
