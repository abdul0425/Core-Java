package edu.jspider.July13;

public class Student implements Comparable{

	String studentName;
	int studentId;
	int studentAge;
	String gender;
	public Student(String studentName, int studentId, int studentAge, String gender) {
		this.studentName = studentName;
		this.studentId = studentId;
		this.studentAge = studentAge;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentId=" + studentId + ", studentAge=" + studentAge
				+ ", gender=" + gender + "]";
	}
	@Override
	public int compareTo(Object o)
	{
		Student s=(Student)o;
		return studentName.compareTo(s.studentName);
	}
	
	
}
