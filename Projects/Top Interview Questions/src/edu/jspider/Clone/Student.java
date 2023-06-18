package edu.jspider.Clone;

public class Student implements Cloneable{

	private static final String Student = null;
	String studentName;
	int studentId;
	Address studentAddress;
	public Student(String studentName, int studentId, Address studentAddress) {
		this.studentName = studentName;
		this.studentId = studentId;
		this.studentAddress = studentAddress;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public Address getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentId=" + studentId + ", studentAddress=" + studentAddress
				+ "]";
	}
	@Override
	protected Student clone() throws CloneNotSupportedException
	{
		Student s=(Student)super.clone();
		s.studentAddress=(Address)studentAddress.clone();
		return s;
	}
}
