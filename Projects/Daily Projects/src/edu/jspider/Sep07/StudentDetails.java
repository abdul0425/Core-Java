package edu.jspider.Sep07;

public class StudentDetails {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.setId(101);
		s1.setName("Rivu");
		s1.setNumber("8874563200");
		s1.setAge(65);
		s1.setGender("Male");
		s1.getId();
		s1.getName();
		s1.getNumber();
		s1.getAge();
		s1.getGender();
		System.out.println(s1.toString());
	}

}
