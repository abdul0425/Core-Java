package edu.jspider.LambdaExpression;

public class Student {

	String studentName;
	int studentId;
	public Student(String studentName, int studentId) {
		this.studentName = studentName;
		this.studentId = studentId;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentId=" + studentId + "]";
	}
	
	
}
