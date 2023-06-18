package edu.jspider.Sep08;

public class Student {

	private int studentId;
	private String Name;
	

	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", Name=" + Name + "]";
	}



	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}
	
	
	
}
