package edu.jspider.Sep20;

public class Student implements Comparable{

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
	@Override
	public int compareTo(Object o) {
		Student s=(Student)o;
		return studentName.compareTo(s.studentName);
	}
	
}
