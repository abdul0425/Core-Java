package edu.jspider.Comparable;

public class Student implements Comparable {

	int studentId;
	String studentName;
	int studentAge;
	String geder;

	public Student(int studentId, String studentName, int studentAge, String geder) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.geder = geder;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge
				+ ", geder=" + geder + "]";
	}

	@Override
	public int compareTo(Object o) {
		Student s = (Student) o;
		return studentName.compareTo(s.studentName);
	}

}
