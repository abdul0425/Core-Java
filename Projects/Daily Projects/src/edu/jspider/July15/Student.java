package edu.jspider.July15;

public class Student implements Comparable {

	String studentName;
	int studentId;
	String gender;
	int studentAge;

	public Student(String studentName, int studentId, String gender, int studentAge) {
		this.studentName = studentName;
		this.studentId = studentId;
		this.gender = gender;
		this.studentAge = studentAge;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentId=" + studentId + ", gender=" + gender
				+ ", studentAge=" + studentAge + "]";
	}

	@Override
	public int compareTo(Object o) {
		Student s = (Student) o;
		return studentName.compareTo(s.studentName);
	}

}
