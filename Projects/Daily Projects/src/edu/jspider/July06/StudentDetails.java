package edu.jspider.July06;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
public class StudentDetails {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		Student s1=new Student("Arshad Alam", 601, 55, "male");
		Student s2=new Student("Rivu Naskar", 701, 28, "male");
		Student s3=new Student("Akhil Pandu", 301, 50, "male");
		Student s4=new Student("Sai Pallavi", 101, 28, "Female");
		Student s5=new Student("Kooyal Mallick", 201, 30, "Female");
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		
//		for(int i=0;i<al.size();i++)
//		{
//			Student name=(Student)al.get(i);
//			System.out.println(name);
//		}
		
		Collections.sort(al);
		for(Object o : al)
		{
			System.out.println(o);
		}
		
		// Sort According to Age/
//		Comparator c=new CompareStudentAge();
//		Collections.sort(al, c);
//		
//		System.out.println("Sorting Based On Age  :  ");
//		for(Object o : al)
//		{
//			System.out.println(o);
//		}
//		
//		// Sort According to id.
//		
//		c=new CompareStudentId();
//		Collections.sort(al, c);
//		System.out.println("Sorting Based on Id  :  ");
//		for(Object o : al)
//		{
//			System.out.println(o);
//		}
	}

}
