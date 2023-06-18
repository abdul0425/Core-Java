package edu.jspider.July06;

public class Student implements Comparable{

	String studentName;
	int studentId;
	int studentAge;
	String studentGender;
	
	public Student(String studentName, int studentId, int studentAge, String studentGender) {
		this.studentName = studentName;
		this.studentId = studentId;
		this.studentAge = studentAge;
		this.studentGender = studentGender;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentId=" + studentId + ", studentAge=" + studentAge
				+ ", studentGender=" + studentGender + "]";
	}
	
	@Override 
	public int compareTo(Object o)
	{
		Student s=(Student)o;
		if(studentAge>s.studentAge)return 1;
		if(studentAge<s.studentAge)return -1;
		return 0;
	}
	
	
}
