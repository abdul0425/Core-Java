package edu.jspider.Sep10;

public class Student implements Comparable{
	int studentId;
	String studentName;
	int studentAge;
	public Student(int studentId, String studentName,int studentAge) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge + "]";
	}
//	@Override
//	public int compareTo(Object s)
//	{
//		return studentName.compareTo(((Student)s).studentName);
//	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
