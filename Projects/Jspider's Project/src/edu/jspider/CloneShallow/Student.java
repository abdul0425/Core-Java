package edu.jspider.CloneShallow;

public class Student implements Cloneable {

	int studentId;
	String studentName;
	String gender;
	Address a;
	public Student(int studentId, String studentName, String gender,Address a) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.gender = gender;
		this.a=a;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", gender=" + gender + "Address : "+a +"]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Student s=(Student)super.clone();
		s.a=(Address)a.clone();
		return s;
	}
	
}
