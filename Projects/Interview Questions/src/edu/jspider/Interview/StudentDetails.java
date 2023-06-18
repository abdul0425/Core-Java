package edu.jspider.Interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class StudentDetails {

	static void pattern()
	{
		System.out.println("======================================================================");
	}
	
	public static void main(String[] args) {
		
		// Creating ArrayList.
		ArrayList a=new ArrayList();
		Student s1=new Student("Arshad Alam", 101, 55, "Male");
		Student s2=new Student("Rivu Naskar", 201, 53, "Male");
		Student s3=new Student("Akhil Pandu", 301, 50, "Male");
		Student s4=new Student("Sai Pallavi", 401, 28, "Female");
		Student s5=new Student("Keerthi Suresh", 501, 30, "Female");
		Student s6=new Student("Nayanthara", 601, 33, "Female");
		
		// Adding Element to the ArrayList.
		a.add(s1);
		a.add(s2);
		a.add(s3);
		a.add(s4);
		a.add(s5);
		a.add(s6);
		
		//Sorting Using Comparable Implementation.
		Collections.sort(a);
		pattern();
		System.out.println("Compare Based on Student Name :");
		for(Object name:a)
			System.out.println(name);
		pattern();
		
		// Sorting Using Comparator.
		//Comparator c=new CompareAge();
		// Using Anonymous Class.
		Comparator c=new Comparator()
				{

					@Override
					public int compare(Object o1, Object o2) {
						Student s1=(Student)o1;
						Student s2=(Student)o2;
						if(s1.studentAge>s2.studentAge)return 1;
						if(s1.studentAge<s2.studentAge)return -1;
						return 0;
					}
					
				};
		Collections.sort(a, c);
		System.out.println("Compare Based On Student Age  :  ");
		for(Object age:a)
			System.out.println(age);
		pattern();
		
		
		//c=new CompareId();
		// Using Lambda Expression.
		c=( o1, o2)->
				{
					
					if(s1.studentId>s2.studentId)return 1;
					if(s1.studentId<s2.studentId)return -1;
					return 0;
				};
				
		Collections.sort(a,c);
		System.out.println("Compare Based On Student Id");
		for(Object id:a)
			System.out.println(id);
		pattern();
	}

}
