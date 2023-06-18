package edu.jspider.Clone;

public class Student implements Cloneable{
	int studentId;
	String studentName;
	String department;
	StudentAddress sa;
	public Student(int studentId, String studentName, String department, StudentAddress sa) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.department = department;
		this.sa = sa;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", department=" + department
				+ ", sa=" + sa + "]";
	}
	@Override
	protected Student clone() throws CloneNotSupportedException {
		
		 Student s= (Student)super.clone();
		s.sa =(StudentAddress)sa.clone();
		 return s;
	}
	
	
}
