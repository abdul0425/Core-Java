package edu.jspider.Sep09;

public class Student {
	
	int studentId;
	String studentName;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Student))return false;
		Student s=(Student)obj;
		
		return studentName.equals(s.studentName);
	}



	public static void main(String[] args) {
		Student s1=new Student(101,"Arshad");
		Student s2=new Student(102,"Rivu");
		
		System.out.println(s1.equals(s2));
	}

}
