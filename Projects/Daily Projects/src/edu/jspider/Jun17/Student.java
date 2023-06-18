package edu.jspider.Jun17;

public class Student {

	String studentName;
	int studentId;
	int studentAge;
	public Student(String studentName, int studentId, int studentAge) {
		this.studentName = studentName;
		this.studentId = studentId;
		this.studentAge = studentAge;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentId=" + studentId + ", studentAge=" + studentAge + "]";
	}
	
	
}
