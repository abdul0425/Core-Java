package edu.jspider.Sep07;

import java.io.Serializable;

public class Student implements Serializable{
	private int studentId;
	private String studentName;
	private String contactNumber;
	private int studentAge;
	private String gender;
	

	
	
	
	//public Student(int studentId, String studentName, String contactNumber, int studentAge, String gender) {
		//this.studentId = studentId;
		//this.studentName = studentName;
		//this.contactNumber = contactNumber;
		//this.studentAge = studentAge;
		//this.gender = gender;
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", contactNumber=" + contactNumber
				+ ", studentAge=" + studentAge + ", gender=" + gender + "]";
	}
	
	
	public void setId(int id)
	{
		this.studentId=id;
	}
	
	
	public int getId()
	{
		return this.studentId;
	}
	
	
	public void setName(String name)
	{
		this.studentName=name;
	}
	
	
	public String getName()
	{
		return this.studentName;
	}
	
	
	public void setNumber(String no)
	{
		this.contactNumber=no;
	}
	
	
	public String getNumber()
	{
		return this.contactNumber;
	}
	
	
	public void setAge(int age)
	{
		this.studentAge=age;
	}
	
	
	public int getAge()
	{
		return this.studentAge;
	}
	
	
	public void setGender(String gender)
	{
		this.gender=gender;
	}
	
	
	public String getGender()
	{
		return this.gender;
	}
	
	
}
