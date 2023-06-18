package edu.jspider.Aug03;

import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
public class StudentDetails {

	static void pattern()
	{
		System.out.println("=========================================================================");
	}
	
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		Student s1=new Student("Arshad Alam", 101, 55);
		Student s2=new Student("Rivu Naskar", 201, 50);
		Student s3=new Student("Pawan Reddy", 301, 52);
		Student s4=new Student("Sk Ameen", 401, 49);
		Student s5=new Student("Akhil Pandu", 501, 54);
		
		a.add(s1);
		a.add(s2);
		a.add(s3);
		a.add(s4);
		a.add(s5);
		
		Collections.sort(a);
		pattern();
		System.out.println("Sorting Based On Name  :   ");
		for(Object obj:a)
			System.out.println(obj);
		pattern();
		
		Comparator c=new CompAge();
		Collections.sort(a,c);
		pattern();
		System.out.println("Compare Based On Age  :  ");
		for(Object obj:a)
			System.out.println(obj);
		
		pattern();
		c=new CompId();
		Collections.sort(a,c);
		System.out.println("Compare Based On Id  :  ");
		for(Object obj:a)
			System.out.println(obj);
	}
}
