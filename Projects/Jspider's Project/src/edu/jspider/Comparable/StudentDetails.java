package edu.jspider.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentDetails {

	static void pattern()
	{
		System.out.println("=========================================================================");
	}
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		
		Student s1=new Student(1,"Arshad Alam",55,"Male");
		Student s2=new Student(2,"Keerthi Suresh",29,"Female");
		Student s3=new Student(3,"Rivu Naskar",52,"Male");
		Student s4=new Student(4,"Sai Pallavi",28,"Female");
		Student s5=new Student(5,"Akhil Pandu",53,"Male");
		Student s6=new Student(6,"Nayantara",30,"Feale");
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		al.add(s6);
		pattern();
		Collections.sort(al);
		System.out.println("Comparison Based on Student Name   : ");
		for(Object name:al)
			System.out.println(name);
		Comparator c=new CompareStudentId();
		pattern();
		Collections.sort(al, c);
		System.out.println("Comparison Based on Student Id   : ");
		for(Object name:al)
			System.out.println(name);
		
		
		pattern();
		c=new CompareStudentAge();
		Collections.sort(al, c);
		System.out.println("Comparison Based on Student Age   : ");
		for(Object name:al)
			System.out.println(name);
		pattern();
	}

}
